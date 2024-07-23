package com.overloadingAndOverRiding;

public class OverridingDemo extends  OverLoadingDemo{
	

public OverridingDemo() {
	super();	

}
		
	public static void main(String[] args) {
		OverridingDemo demo = new OverridingDemo();
		demo.add(23, 23);
	}
	
	

	@Override
	int add(int y, int b, int j) {
		System.out.println(y+b+j);
		System.out.println("jishcs");
		System.out.println("sgdyuf");		
		return y+b+j;		
	}
	
	@Override	
	String show() {
		return null;		
	}
	
	
	@Override	
	void add(int r, int k) {
		System.out.println("kfheui");
		int x=90;
		super.add(r, r, x);
		this.add(k, r, k);		
	}
	
	
	
	
	@override
	void addd(int r, int k) {
		System.out.println("kfheui");
		int x=90;
		super.add(r, r, x);
		this.add(k, r, k);
		this.add();
		
	}

	

}
