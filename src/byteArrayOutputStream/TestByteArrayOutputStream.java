package byteArrayOutputStream;

import java.util.Arrays;

public class TestByteArrayOutputStream {
    /** 
     * The buffer where data is stored. 
     */
    protected static byte buf[];

    /**
     * The number of valid bytes in the buffer. 
     */
    protected static int count;

    /**
     * Writes the specified byte to this byte array output stream. 
     *
     * @param   b   the byte to be written.
     */
    public static void write(int b) {
	int newcount = count + 1;
	if (newcount > buf.length) {
            buf = Arrays.copyOf(buf, Math.max(buf.length << 1, newcount));
	}
	buf[count] = (byte)b;
	count = newcount;
    }

    public static void main(String[] args) {
    	count = 28;
    	byte[] array = new byte[]{-102, -126, -1, -1, 0, 0, 0, 0, 0, 4, 15, 20, 0, 0, 0, 104, 35, -86, 7, 1, 0, 0, 3, 68, 84, 86, -128, 12, 0, 0, 0, 0};
    	
    	buf = new byte[array.length];
    	System.arraycopy(array,0,buf,0,array.length);
    	for (int i=0; i < buf.length; ++i) {
    		System.out.print(buf[i] + " ");
    	}
    	System.out.println();
    	
    	int frequencyIdx = 31;
    	write(frequencyIdx);
    	for (int i=0; i < buf.length; ++i) {
    		System.out.print(buf[i] + " ");
    	}	}
}
