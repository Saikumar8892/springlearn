package com.mphasis.day02;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Music 
{
  private String elements;
  private int duration;
  private Instrument instrument;
  
  public Music() {
	super();
}

public Music(String elements, int duration, Instrument instrument) {
	super();
	this.elements = elements;
	this.duration = duration;
	this.instrument = instrument;
}

public String getElements() {
	return elements;
}

public void setElements(String elements) {
	this.elements = elements;
}

public int getDuration() {
	return duration;
}

public void setDuration(int duration) {
	this.duration = duration;
}

public Instrument getInstrument() {
	return instrument;
}

@Autowired
@Qualifier("instrument")
public void setInstrument(Instrument instrument) {
	this.instrument = instrument;
}

@Override
public String toString() {
	return "Music [elements=" + elements + ", duration=" + duration + ", instrument=" + instrument + "]";
}
  
}
