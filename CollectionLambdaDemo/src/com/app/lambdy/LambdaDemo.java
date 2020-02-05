package com.app.lambdy;


interface Bike

{
	 public void drive();
	 public void ride();
	 public void learn();
	 static  void see()
	 {
		System.out.println("Hi"); 
	 }
	
}
public class LambdaDemo {

	public static void main(String[] args) {
		
		Bike b=new Bike()
		
				{
			       public void drive()
			       
			       {
			    	   System.out.println("SwaroopaRani Driving Car");
			       }

				@Override
				public void ride() {
					 System.out.println("SwaroopaRani Riding Scooty ");
					
				}

				@Override
				public void learn() {
					 System.out.println("SwaroopaRani Still learning Both Car And Scooty");
					
				}
				};
				
				b.drive();
				b.ride();
				b.learn();
				Bike.see();
				
       
		
	}

	
}
