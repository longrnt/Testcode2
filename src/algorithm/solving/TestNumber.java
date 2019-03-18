package algorithm.solving;

public class TestNumber {
	
	private static final long PACKET_SIZE = 130L;
	private static final double DTV_APG_OBJECT_HEADER_REC_SIZE = 12;
	private static final double DTV_TRANSPORT_APG_FRAME_MAX_OBJ_BODY_SIZE = 4008;
	private static final double DTV_TRANSPORT_APG_FRAME_MAX_PACKETS = 32;
	private static final double DTV_TRANSPORT_APG_FRAME_HEADER_SIZE = 8;
	private static final double DTV_TRANSPORT_PACKET_BODY_PAYLOAD_SIZE = 126;
	
	public static void main(String[] args) {
		int size = 87;
//		System.out.println(getNumberPacket(size));
		
		double packetSize = 512 * 130 * 8 / 550000;
		System.out.println(packetSize);
		
		System.out.println((long)8 / (double)5);
	}
	
	public static int getNumberPacket(int size) {
		if (size <= DTV_APG_OBJECT_HEADER_REC_SIZE) {
			return 0;
		}

		double objBodySize = size - DTV_APG_OBJECT_HEADER_REC_SIZE;
		double numberFrame = objBodySize / DTV_TRANSPORT_APG_FRAME_MAX_OBJ_BODY_SIZE;
		double numberPacket = numberFrame * DTV_TRANSPORT_APG_FRAME_MAX_PACKETS;
		double remainBytes = objBodySize % DTV_TRANSPORT_APG_FRAME_MAX_OBJ_BODY_SIZE;
		if (remainBytes > 0) {
			remainBytes += DTV_TRANSPORT_APG_FRAME_HEADER_SIZE + DTV_APG_OBJECT_HEADER_REC_SIZE + 4;
			numberPacket += remainBytes / DTV_TRANSPORT_PACKET_BODY_PAYLOAD_SIZE;
			if (remainBytes % DTV_TRANSPORT_PACKET_BODY_PAYLOAD_SIZE != 0) {
				++numberPacket;
			}
		}

		return (int) numberPacket;
	}
}
