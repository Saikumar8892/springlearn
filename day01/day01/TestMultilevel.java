package com.day01;

public class TestMultilevel {
public static void main(String[] args) {
	GrandFather gf = new GrandFather();
	gf.name ="Narayan";
	gf.walk();
	
	Father f = new Father();
	f.name = "Murthy";
	f.walk();
	f.work();
	
	Child c = new Child();
	c.name = "Harsha";
	c.walk();
	c.work();
	c.playMusic();
}
}
