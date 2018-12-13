package it.isisgallarate.base;

public class TestSimpleClass {
	
	public static void main(String args[]) {
		
		DataOnly dataObj = new DataOnly();
		
		dataObj.i = 47;
		dataObj.d = 1.1;
		dataObj.b = false;
		
	}
}

class DataOnly {
	int i;
	double d;
	boolean b;
}

