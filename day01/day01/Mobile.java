package com.day01;

public class Mobile {
      
	//Properties or Attributes
	  String brand;
	  String color;
	  int ram;
	  float price;

	  //Behaviour or Actions or Functions
	  public void call()
	  {
	    System.out.println("I am Calling");
	  }

	  public void text()
	  {
	    System.out.println("I am Texting");
	  }
	  
	  public void clickPictures()
	  {
	    System.out.println("I am Clicking Pictures");
	  }
	  
	  public static void main(String[] args) {
		Mobile m = new Mobile();
	    m.brand = "Nokia";
		m.color = "Black";
		m.ram = 64;
		m.price = 7999.00f;
		System.out.println("Brand is "+m.brand);
		System.out.println("Color is "+m.color);
		System.out.println("Ram is "+m.ram);
		System.out.println("Price is "+m.price);
		m.text();
		m.call();
		m.clickPictures();
		System.out.println(m.brand+"    "+ m.color+m.price+m.ram);
	}

}
