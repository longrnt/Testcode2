package leetCode;

//https://leetcode.com/contest/weekly-contest-79/problems/largest-triangle-area/
public class Leet79_A_LargestTriangleAre {
	public static void main(String[] args) {
		//int[][] points = new int[][]{{0,0},{0,1},{1,0},{0,2},{2,0}};
		//int[][] points = new int[][]{{-35,19},{40,19},{27,-20},{35,-3},{44,20},{22,-21},{35,33},{-19,42},{11,47},{11,37}};
		int[][] points = new int[][]{{-24,5},{30,-7},{8,44},{-4,14},{31,26},{25,20},{-18,33},{-15,-9},{26,42},{-23,5},{-10,-43},{-25,4},{-5,17},{-43,-22},{-25,37},{-40,-14},{-11,2},{-33,9},{22,15},{-42,-24},{33,-50},{-33,3},{-6,-14},{25,3},{-7,-9},{-21,13},{-18,16},{-43,-33},{18,-27},{-24,-32},{31,30},{37,37},{43,-22},{-25,-23},{-20,36},{-21,-48},{-44,29},{-39,39},{-35,-45},{-45,-43},{-17,16},{46,34},{-38,-23},{43,29},{37,-43},{-9,24},{-9,35},{30,-40},{39,-12},{-1,40}};
		System.out.println(largestTriangleArea(points));
	}
	
    public static double largestTriangleArea(int[][] points) {
    	double max = 0.0;
    	for (int i = 0; i < points.length - 2; ++i) {
    		for (int j = i + 1; j < points.length - 1; ++j) {
    			double a = Math.hypot(points[i][0] - points[j][0], points[i][1] - points[j][1]);//ab
    			
    			for (int t = j + 1; t < points.length; ++t) {
    				//double a = Math.hypot(x1-x2, y1-y2);//ab
    				double b = Math.hypot(points[j][0] - points[t][0], points[j][1] - points[t][1]);//bc
    				double c = Math.hypot(points[i][0] - points[t][0], points[i][1] - points[t][1]);//ac
    				double p = (a + b + c)/2;
    				double area = Math.sqrt(Math.abs(p * (p - a) * (p - b) * (p - c)));

    				max = Math.max(max, area);
    			}
    		}
    	}
        return max;
    }
}
