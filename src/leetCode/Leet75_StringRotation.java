package leetCode;

class StringRotation
{
    /* Function checks if passed strings (str1 and str2)
       are rotations of each other */
    static boolean areRotations(String str1, String str2)
    {
        return (str1.length() == str2.length()) &&
               ((str1 + str1).indexOf(str2) != -1);
    }
     
    public static boolean rotateString(String A, String B) {
    	return (A.length() == B.length()) &&
                ((A + A).indexOf(B) != -1);
    }
    // Driver method
    public static void main (String[] args)
    {
        String str1 = "abcde", str2 = "abced";
 
        if (rotateString(str1, str2))
            System.out.println("Strings are rotations of each other");
        else
            System.out.printf("Strings are not rotations of each other");
    }
}