package com.example.activityintents;

public class Box {
	   private  double length;
	   private  double width;
	   private  double height;

	   
	   Box(double l , double w, double h){
		   length = l;
		   width = w;
		    height = h;
	   }
		
		
		public double Volume() {
			 double v;
			 v = length * width *height;
			 return v;
		  }
		
		public double LargestSurfaceArea() {
			 double LSF;
			 LSF = (2*length*width)+ (2*length*height)+ (2*height*width);
			 return LSF;
		  }
		
		public String toString() {
			String s;
			s = " The box of length:" + length +"m"+ ","+
			" " + " width:" + width +"m"+
					" " + " and height:" + height+ "m" + " " + "\n" +  " has the volume of = " + Volume() + "m3";
			return s;
		}
	}

