package leetCode;

public class leet82_B {
	public static void main(String[] args) {
//		int[] ages = new int[]{16,16};
//		int[] ages = new int[]{16,17,18};
		//20,30,100,110,120]
		int[] ages = new int[]{20,30,100,110,120};
		System.out.println(numFriendRequests(ages));
	}
	/*
	 * 	age[B] <= 0.5 * age[A] + 7
		age[B] > age[A]
		age[B] > 100 && age[A] < 100
	 */
	public static boolean isFriend(int a, int b) {
		if ((float)b <= 0.5 * (float)a + 7) {
			return false;
		}
		else if (b > a) {
			return false;
		}
		else if (b > 100 && a < 100) {
			return false;
		}
		return true;
	}
    public static int numFriendRequests(int[] ages) {
    	int count = 0;
        for (int i = 0; i < ages.length - 1; ++i) {
        	for (int j = i + 1; j < ages.length; ++j) {
        		if (ages[i] != ages[j]) {
        			if (isFriend(ages[i], ages[j])) {
        				++count;
        			}
        			if (isFriend(ages[j], ages[i])) {
        				++count;
        			}
        		} else {
        			if (isFriend(ages[i], ages[j])) {
        				count+= 2;
        			}
        		}
        	}
        }
        return count;
    }
}
