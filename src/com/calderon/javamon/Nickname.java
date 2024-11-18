package com.calderon.javamon;

import java.util.Random;

public class Nickname {

	private String[] nicknameStartString = {"Ojo", "Puño", "Espada", "Viento" , "Poder", "Regeneración"};
	private String[] nicknameEndString = {"Celeste", "de fuego", "del Infierno", "Mortal", " de eternidad", "replicante"};

	
	public Nickname() {
		super();
		
		
	}

	public Nickname(String[] nicknameStartString, String[] nicknameEndString) {
		super();
		this.nicknameStartString = nicknameStartString;
		this.nicknameEndString = nicknameEndString;
	}




	public String getNewNickname() {
		Random random = new Random ();
		
		
		
		
		
////		int startNameIndex = random.nextInt(6);
//		int startNameIndex = random.nextInt(this.nicknameStartString.length);
//
////		int endNameIndex = random.nextInt(6);
//		int endNameIndex = random.nextInt(this.nicknameEndString.length);
//
//		String newNickname = this.nicknameStartString [startNameIndex] + " " + 
//		this.nicknameEndString[endNameIndex];
//		
//
//		return newNickname;
		
		
		
		return this.nicknameStartString[random.nextInt(this. nicknameStartString.length)]
				+" "
				+this.nicknameEndString[random.nextInt(this. nicknameEndString.length)];

		
	}

}
