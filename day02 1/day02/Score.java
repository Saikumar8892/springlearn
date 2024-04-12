package com.mphasis.day02;

public class Score 
{
  private double physics;
  private double chemistry;
  private double maths;
  
public Score() {
	super();
}
public Score(double physics, double chemistry, double maths) {
	super();
	this.physics = physics;
	this.chemistry = chemistry;
	this.maths = maths;
}
public double getPhysics() {
	return physics;
}
public void setPhysics(double physics) {
	this.physics = physics;
}
public double getChemistry() {
	return chemistry;
}
public void setChemistry(double chemistry) {
	this.chemistry = chemistry;
}
public double getMaths() {
	return maths;
}
public void setMaths(double maths) {
	this.maths = maths;
}
@Override
public String toString() {
	return "Score [physics=" + physics + ", chemistry=" + chemistry + ", maths=" + maths + "]";
} 
}
