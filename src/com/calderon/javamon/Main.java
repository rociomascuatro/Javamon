package com.calderon.javamon;

public class Main {

	public static void main(String[] args) {
		System.out.println("START.Empieza el programa");
		
		Nickname nickname= new Nickname();
		
//		nickname.getNewNickname();
//		String newNickname = nickname.getNewNickname();
//		System.out.println("El nuevo nickname es: " + newNickname);
		
//		Dice dice = new Dice();
//		int diceSide= dice.getRoll();
//		System.out.println("Ha salido el valor: " + diceSide);
		
		Javamon javamon1= new Javamon();
		System.out.println(javamon1.status());
		
		Javamon javamon2= new Javamon();
		System.out.println(javamon2.status());
		
		Javamon javamon3= new Javamon("Picachu");
		System.out.println(javamon3.status());
		
		Combat combat= new Combat(javamon1,javamon2);
		combat.initCombat();
		
		
		
		System.out.println("Acaba el programa.END");


	}

}
