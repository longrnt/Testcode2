package leetCode;

import java.util.ArrayList;
import java.util.List;

//830. Positions of Large Groups
//https://leetcode.com/contest/weekly-contest-83/problems/positions-of-large-groups/

public class Leet83_A {
	public static void main(String[] args) {
		String S = "bbaaaeee";
		System.out.println(largeGroupPositions(S));
	}

	public static List<List<Integer>> largeGroupPositions(String S) {
		List<List<Integer>> result = new ArrayList<List<Integer>>();
		List<Integer> list = new ArrayList<Integer>();;
		
		char preCh = S.charAt(0);
		int count = 1;
		list.add(0);
		for (int i = 1; i < S.length(); ++i) {
			char ch = S.charAt(i);
			if (ch == preCh) {
				++count;
			} else {
				if (count >= 3) {
					list.add(i - 1);
					result.add(list);
				}
				count = 1;
				list = new ArrayList<Integer>();
				list.add(i);
			}
			preCh = ch;
		}
		if (count >= 3) {
			list.add(count + list.get(list.size() - 1) - 1);
			result.add(list);
		}
		return result;
				
	}
}
