package de.bosch.volkmar.java.kurs.kapitel03;

public class switch_case {

	public static void main(String[] args) {
		int note = Integer.parseInt(args[0]);
		switch(note) {
		case 1: System.out.println("sehr gut"); break;
		case 2: System.out.println("gut"); break;
		case 3: System.out.println("befriedigend"); break;
		case 4: System.out.println("ausreichend"); break;
		case 5: System.out.println("mangelhaft"); break;
		case 6: System.out.println("ungenügend"); break;
		
		}

	}

}
