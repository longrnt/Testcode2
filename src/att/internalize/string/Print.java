package att.internalize.string;

class Print {
    static public void printType(short param) {
        System.out.println("short");
    }
    static protected void printType(long param) {
    	System.out.println("long");
    }
    static protected void printType(int param) {
        System.out.println("int");
    }
    static void printType(Integer param) {
        System.out.println("Integer");
    }
    static void printType(CharSequence param) {
       System.out.println("CharSequence");
    }

    public static void main(String[] args) {
        byte b = 1;
        int i = 1;
        Integer integer = 1;
        String s = "1";

        printType(b);
        printType(i);
        printType(integer);
        printType(s);
        
        
        
   }
}

