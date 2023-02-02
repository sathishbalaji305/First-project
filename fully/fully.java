package com.fully;

public class fully implements sample {

	
	@Override
	public void window() {
System.out.println("window1");		
	}
	
	@Override
	public void run() {
System.out.println("run");		
	}
	
	@Override
	public void go() {
System.err.println("go");	
	}
	
	public static void main(String[] args) {
		fully r = new fully();
		r.window();
		r.run();
		r.go();
	}
}
