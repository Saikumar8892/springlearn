package com.mphasis.day02;

public class Student 
{
   private int id;
  
   private Score score;
   
public Student() {
	super();
}

public Student(int id, Score score) {
	super();
	this.id = id;
	this.score = score;
}

public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public Score getScore() {
	return score;
}


public void setScore(Score score) {
	this.score = score;
}
@Override
public String toString() {
	return "Student [id=" + id + ", score=" + score + "]";
}
    
}

