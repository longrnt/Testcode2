package string;

import oca.SexToy1;
import read.file.*;

public class SexToy2 extends SexToy1{
	public static void main(String[] args) {
		SexToy1 st = new SexToy1();
		
//		System.out.println(st.calc());
		SexToy2 st2 = new SexToy2();
		
		System.out.println(st2.calc());
		readFileUtil util = new readFileUtil();
	}
}
