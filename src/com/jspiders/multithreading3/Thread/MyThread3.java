package com.jspiders.multithreading3.Thread;

public class MyThread3 extends Thread {
	
	public void run() {
		// TODO Auto-generated method stub
		
	  for(int i=1;i<=5;i++) {
		  
	  if(i>2) {
		  
	 	  this.stop();
	   }
	  System.out.println("MyThread is running Now !!!");
	  }

	}

}
