/*
 *----------------------------------------------------------------------------
 * $RCSfile: ApiFaker.java,v $
 *
 * $Revision: 1.62 $
 *
 * Description: Simulates the database API
 *
 * Copyright 1998 Hughes Electronics Corporation. All rights reserved.
 *----------------------------------------------------------------------------
 */

package BigInteger;

/*
 *----------------------------------------------------------------------------
 * Imported libraries:
 *----------------------------------------------------------------------------
 */

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Enumeration;
import java.util.Vector;

public class ApiFaker {

/*
 *----------------------------------------------------------------------------
 * Constants and Variables
 *----------------------------------------------------------------------------
 */
  // Version Control Stuff
  private static final String identString = "ident $Id: ApiFaker.java,v 1.62 2007/07/20 01:54:01 hnguyen Exp $";

  // Copyright Stuff
  private static final String copyrightString = "$Copyright 1998 Hughes Electronics Corporation.  All rights reserved.$";

  // the field delimiter used when reading and writing database objects
  public final static String fieldDelim = "\001";

/*
 *----------------------------------------------------------------------------
 * Constructor(s)
 *----------------------------------------------------------------------------
 */
  public ApiFaker() {
  }

/*
 *----------------------------------------------------------------------------
 * IMPLEMENTATION OF PRIVATE METHODS:
 *----------------------------------------------------------------------------
 */

  /*
   *--------------------------------------------------------------------------
   * Outputs the current thread name (for debugging)
   *--------------------------------------------------------------------------
   */
  private void printThread() {
    //Debug.println("ApiFaker Thread " + getName() + " called");
  }

  /*
   *--------------------------------------------------------------------------
   * reads a file and returns it as a Vector of Objects
   *--------------------------------------------------------------------------
   */
  private Vector readData(String fileName) {
    File fileToRead = new File(fileName);
    String thisLine = new String();
    Vector returnVector = new Vector();

    try {
      FileReader fr = new FileReader(fileToRead);
      BufferedReader myInput = new BufferedReader(fr);
      while ((thisLine = myInput.readLine()) != null) {
        if (!(thisLine.startsWith("#"))) {
          returnVector.addElement(thisLine);
        }
      }
      myInput.close();
    }
    catch (FileNotFoundException e) {
    	System.out.println("file " + fileToRead + " not found exception");
    }
    catch (IOException e) {
    	System.out.println("io exception");
    }

    return (returnVector);
  }

  /*
   *--------------------------------------------------------------------------
   * Writes a file to the database
   *--------------------------------------------------------------------------
   */
  private void writeData(String fileName, Vector newObject) {
    File fileToWrite = new File("gui_database/gui_database_" + fileName + ".cfg");
    String thisLine = new String();

    try {
      FileWriter fw = new FileWriter(fileToWrite);
      BufferedWriter myOutput = new BufferedWriter(fw);
      Enumeration enumerator = newObject.elements();
      while (enumerator.hasMoreElements()) {
        thisLine = enumerator.nextElement().toString() + "\n";
        myOutput.write(thisLine);
      }
      myOutput.close();
    }
    catch (FileNotFoundException e) {
    	System.out.println("file " + fileToWrite + " not found exception");
    }
    catch (IOException e) {
      System.out.println("io exception");
    }
  }


/*
 *----------------------------------------------------------------------------
 * IMPLEMENTATION OF PROTECTED METHODS:
 *----------------------------------------------------------------------------
 */

/*
 *----------------------------------------------------------------------------
 * IMPLEMENTATION OF PUBLIC METHODS:
 *----------------------------------------------------------------------------
 */

  /*
   *--------------------------------------------------------------------------
   * Simulates opening the database connection
   *--------------------------------------------------------------------------
   */
/*
  public ApiClient openAPGS() {
    printThread();
    Debug.println("Opening database...");
    return (new ApiClient());
  }
*/

  /*
   *--------------------------------------------------------------------------
   * Simulates closing the database connection
   *--------------------------------------------------------------------------
   */
  public boolean closeAPGS() {
    printThread();
    return (true);
  }

  /*
   *--------------------------------------------------------------------------
   * Sets an object in the "database"
   *--------------------------------------------------------------------------
   */
  public void setObject(ApiObjectId objId, Vector newObject) {
    printThread();
    writeData(String.valueOf(objId.objectType), newObject);
  }

}
