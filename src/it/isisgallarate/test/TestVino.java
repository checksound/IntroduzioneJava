package it.isisgallarate.test;

import it.isisgallarate.equals.Vino;

public class TestVino {
	
	public static void main(String[] args) {
		Vino vino1 = new Vino("Barbera", 2010, 20);
		Vino vino2 = new Vino("Barbera", 2010, 18);
		
		if (vino1 == vino2) {
			System.out.println("SONO UGUALI PER REFERENCE - vino1, vino2");
		} else {
			System.out.println("SONO DIVERSI PER REFERENCE - vino1, vino2");
		}
		
		if (vino1.equals(vino2)) {
			System.out.println("EQUALS TRUE - vino1, vino2");
		} else {
			System.out.println("EQUALS FALSE - vino1, vino2");
		}
	}
}
