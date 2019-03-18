package oca;

public class q59 {
	
}

class CD {
	int r;
	CD(int r) {
		this.r=r;
	}
	CD() {}
}

class DVD extends CD {
	int c;
	DVD(){
	}
	
	DVD(int r, int c) {
//		super();
		this();
		this.c=c;
	}
}