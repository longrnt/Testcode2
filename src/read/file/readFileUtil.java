package read.file;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.Enumeration;
import java.util.Vector;

public class readFileUtil {
	  /*
	   *--------------------------------------------------------------------------
	   * reads a file and returns it as a Vector of Objects
	   *--------------------------------------------------------------------------
	   */
	  public static Vector readData(String fileName) {
	    File fileToRead = new File(fileName);
	    String thisLine = new String();
	    Vector returnVector = new Vector();

	      FileReader fr;
		try {
			fr = new FileReader(fileToRead);
		      BufferedReader myInput = new BufferedReader(fr);
		      while ((thisLine = myInput.readLine()) != null) {
		    	  thisLine = thisLine.trim();
		        if (!(thisLine.startsWith("#")) &&
		            !(thisLine.startsWith(" ")) &&
		            !(thisLine.startsWith("\n")) &&
		            !(thisLine.startsWith("\t")) &&
		            !(thisLine.startsWith("\r")) &&
		            (thisLine.length() > 0) ) {
		          returnVector.addElement(thisLine);
		        }
		      }
		      myInput.close();

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return returnVector;
	  }

	  /*
	   *--------------------------------------------------------------------------
	   * converts the vector read from the file into a vector of class type
	   *--------------------------------------------------------------------------
	   */
	  public static Vector convert(Class tempClass, Vector convertVector) {
	    String fieldDelim = "\t";

	    if (convertVector == null) {
	      System.out.println("Convert Vector is null");
	      return convertVector;
	    } else {
	      System.out.println("Convert Vector size: "+ convertVector.size());
	    }

	    Class tClass[] = {new String().getClass(), new String().getClass()};
	    Object tempObjectSet[] = {null, fieldDelim};
	    Enumeration enume = convertVector.elements();
	    String tempElement;
	    while(enume.hasMoreElements()) {
	      tempElement = (String) enume.nextElement();
	      tempObjectSet[0] = tempElement;
	      try {
	        convertVector.setElementAt(tempClass.getMethod("convert", tClass).invoke(null, tempObjectSet), convertVector.indexOf(tempElement));
	      }
	      catch (NoSuchMethodException e) {
	        System.out.println("method convert is not found");
	      }
	      catch (SecurityException e) {
	        System.out.println("security exception caught trying to call convert");
	      }
	      catch (IllegalAccessException e) {
	        System.out.println("IllegalAccessException  caught");
	      }
	      catch (IllegalArgumentException e) {
	        System.out.println("IllegalArgumentException  caught");
	      }
	      catch (InvocationTargetException e) {
	        System.out.println("InvocationTargetException  caught");
	      }
	    }

	    return convertVector;
	  }

}
