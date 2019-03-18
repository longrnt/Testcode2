package read.file;

import java.util.Vector;

public class TestReadFile {
	public static Vector KA_XPDR_FREQ_INFO;
	
	public static void main(String[] args) {
        Vector myKaXpdrMap = readFileUtil.readData("src/read/file/xpdrLookupTable.ini");
        KA_XPDR_FREQ_INFO = readFileUtil.convert(new ApiXpdrInfo().getClass(), myKaXpdrMap);
        for(int j=0; j<KA_XPDR_FREQ_INFO.size(); j++) {
            ApiXpdrInfo ent = (ApiXpdrInfo)KA_XPDR_FREQ_INFO.elementAt(j);
            System.out.println("ent.netid = " + ent.getNetId() + " ent.downlinkXpdr = " + ent.getDownlinkXpdr() + "\n" 
            		+ " freqindex = " + ent.getApgFreqIndex() + " ent.downlinkXpdr = " + ent.getDownlinkXpdr() + "\n"
            		+ " freqindex+1 = " + (ent.getApgFreqIndex()+1));
        }
	}
}
