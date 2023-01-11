package com.example.activityintents;

public class FilledBox  extends Box{
	
	private String  color;
	private double  density;

	public FilledBox(double l, double w, double h, String Co, double D) {
		super(l, w, h);
		color = Co;
		density = D;
		
	}
	
	public double MassOfBosx() {
		double m;
		m=super.Volume() * density;
		
		return m;	
	}
	
	public String toString() {
		String s  =  super.toString();
		s +=" \n"+ " " +"and a Mass of = "+ MassOfBosx()+ "m" + " "+" and has a " + color + " " +"color "; 
		return s;
	}
}
