package com.day01;

public class TestAnimal {
public static void main(String[] args) {
	Animal a = new Animal();
	a.sleep();
	
	System.out.println("-------------");
	
	Lion l = new Lion();
	l.name ="Simba";
	l.weight = 300;
	l.height = 12;	
	l.sleep();
	l.jump();
	
}
}
