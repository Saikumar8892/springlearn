package com.day01;

public class TestVehicle 
{
  public static void main(String[] args) {
	 Vehicle v1 = new Scooty();
	 v1.name = "Bajaj";
	 
	 Vehicle v2 = new Lorry();
	 v2.name ="Benz";
	 
	 Mechanic m = new Mechanic();
	 m.name ="Mahesh";
	 m.test(v1);
	 m.test(v2);
	 
}
}
