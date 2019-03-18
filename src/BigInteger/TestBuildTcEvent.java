//package BigInteger;
//
//import java.io.ByteArrayInputStream;
//import java.math.BigInteger;
//import java.text.SimpleDateFormat;
//import java.util.TimeZone;
//import java.util.Vector;
//
//public class TestBuildTcEvent {
//	public static void main(String[] args) {
//		java.util.Date myDate;
//		SimpleDateFormat df = new SimpleDateFormat("yyyy/MM/dd HH:mm");
//		df.setTimeZone(TimeZone.getTimeZone("GMT"));
//		Vector tcEvent = new Vector();
//		ByteArrayInputStream eventInputStr = new ByteArrayInputStream(event);
//
//		byte[] byteArray = new byte[4];
//		byte[] shortByteArray = new byte[2];
//		byte[] charArray = new byte[12];
//		int numRead;
//		String logStr = new String();
//
//		for (int eventIndex = 0; eventIndex < 1; eventIndex++) {
//			try {
//
//				boolean isA3Channel = false;
//
//				// get dayPartNumber
//				int daypartNumber = eventIndex + 1;
//
//				// read Start Time, and End Time
//				numRead = eventInputStr.read(byteArray);
//				long startTimeInt = new BigInteger(1, byteArray).longValue();
//
//				numRead = eventInputStr.read(byteArray);
//				long duration = new BigInteger(1, byteArray).longValue();
//				long endTimeInt = startTimeInt + duration;
//				String startTime = new String();
//				String endTime = new String();
//
//				// convert Start/End Time to YYYY/MM/DD hh:mm
//				if (startTimeInt == 0) {
//					// continuous channel
//					startTime = "0000/00/00 00:00";
//					endTime = "0000/00/00 00:00";
//				} else {
//					// scheduled channel
//					myDate = new java.util.Date(startTimeInt * 1000);
//					startTime = df.format(myDate);
//
//					myDate = new java.util.Date(endTimeInt * 1000);
//					endTime = df.format(myDate);
//				}
//
//				// read compiled_co_oid
//				numRead = eventInputStr.read(shortByteArray);
//				int objectType = new BigInteger(1, shortByteArray).intValue();
//				numRead = eventInputStr.read(shortByteArray);
//				int objectVersion = new BigInteger(1, shortByteArray).intValue();
//				numRead = eventInputStr.read(byteArray);
//				long dbObjectId = new BigInteger(1, byteArray).longValue();
//				ApiObjectId compiledCoOid = new ApiObjectId(objectType, objectVersion, dbObjectId);
//
//				numRead = eventInputStr.read(byteArray);
//				int majorNumber = new BigInteger(1, byteArray).intValue();
//				numRead = eventInputStr.read(byteArray);
//				int minorNumber = new BigInteger(1, byteArray).intValue();
//				numRead = eventInputStr.read(byteArray);
//				int networkId = new BigInteger(1, byteArray).intValue();
//				numRead = eventInputStr.read(byteArray);
//				int xmitNetworkId = new BigInteger(1, byteArray).intValue();
//
//			} catch (Exception e) {
//				System.out.println(e);
//			}
//		}
//	}
//}