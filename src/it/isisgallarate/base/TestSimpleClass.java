package it.isisgallarate.base;

public class TestSimpleClass {
	
	public static void main(String args[]) {
		
		DataOnly dataObj = new DataOnly();
		
		System.out.println("PRIMA DELLA MODIFICA: " + dataObj);
		
		dataObj.i = 47;
		dataObj.d = 1.1;
		dataObj.b = false;
		
		System.out.println("DOPO LA MODIFICA: " + dataObj);
	}
}

