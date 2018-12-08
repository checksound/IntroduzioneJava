package it.isisgallarate.test;

public class TestEqualsOnObjects {
	
	public static void main(String[] args) {
		
		Object o1 = new Object();
		Object o2 = new Object();
		
		if (o1 == o2) {
			System.out.println("SONO UGUALI PER REFERENCE - o1, o2");
		} else {
			System.out.println("SONO DIVERSI PER REFERENCE - o1, o2");
		}
		
		if (o1.equals(o2)) {
			System.out.println("EQUALS TRUE - o1, o2");
		} else {
			System.out.println("EQUALS FALSE - o1, o2");
		}
		
		// Oggetto o1 assegnato a o3
		
		Object o3 = o1;
		
		if (o1 == o3) {
			System.out.println("SONO UGUALI PER REFERENCE - o1, o3");
		} else {
			System.out.println("SONO DIVERSI PER REFERENCE - o1, o3");
		}
		
		if (o1.equals(o3)) {
			System.out.println("EQUALS TRUE - o1, o3");
		} else {
			System.out.println("EQUALS FALSE - o1, o3");
		}
				
	}
}
