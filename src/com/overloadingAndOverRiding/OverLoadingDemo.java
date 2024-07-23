package com.overloadingAndOverRiding;

public class OverLoadingDemo {
	
	public static void main(String[] args) {
		OverLoadingDemo demo = new OverLoadingDemo();
		demo.add(89, 90);
		demo.add(34, 78, 90.9f);
		
		demo.add(45, 89, 90);
		
	}
	
	
//	public OverLoadingDemo(int h) {
//		
//	}
	
	void add(int y, int x) {
		System.out.println(y+x);
			int g=06543;
		int i=0xBeer;
		
	}
void add(int y, int x, float num) {
	System.out.println(y+x+num);
	}

int add(int y, int b, int j) {
	System.out.println(y+b+j);
	return y+b+j;
	
}

void add() {
	// TODO Auto-generated method stub
	
}

String show() {
	// TODO Auto-generated method stub
	return null;
}



}
