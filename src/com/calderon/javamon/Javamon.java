package com.calderon.javamon;

import java.util.Random;

public class Javamon {
	private final int MAX_INITIAL_LIFE = 25;
	private int agility;
	private int defence;
	private int strength;
	private int life;
	private String name;
//	private Dice dice;
	private Dice dice = new Dice();

	public Javamon() {
		super();
		Nickname nickname = new Nickname();
		this.name = nickname.getNewNickname();
		this.initAttributes();
	}

	public Javamon(String name) {
		super();
		this.name = name;
		this.initAttributes();
	
	}

	public int inititive() {
//		Dice dice = new Dice();
		return this.agility + this.dice.getRoll();
	}

	public int attack() {
//		Dice dice = new Dice();
		return this.strength + this.dice.getRoll();
	}

	public int defend() {
//		Dice dice = new Dice();
		return this.agility + (this.defence / 2) + this.dice.getRoll();
	}

//	@Override
//	public String toString() {

	public String status() {
		return name +  
	 "[agility=" + agility 
	+ ", " + "defence=" + defence 
	+ ", " + "strength=" + strength 
	+ ", " + "life=" + life 
	+  "]";
	}

	private void initAttributes() {
		
//		this.agility = 8;
		Random random = new Random ();
		this.setAgility(1+ random.nextInt(6));
		this.setStrength(1+ random.nextInt(12));
		this.setDefence(18- (this.getAgility() + this.getStrength()));


//		this.setAgility(5);
////		this.strength = 7;
//		this.setStrength(9);
////		this.defence = 3 ;
//		this.setDefence(4);
////		this.life = 20 ;
		this.setLife(MAX_INITIAL_LIFE);
		
		//TODO Pendiente poner atributos aleatorios

	}

	public int getAgility() {
		return agility;
	}

	public void setAgility(int agility) {
		this.agility = agility;
	}

	public int getDefence() {
		return defence;
	}

	public void setDefence(int defence) {
		this.defence = defence;
	}

	public int getStrength() {
		return strength;
	}

	public void setStrength(int strength) {
		this.strength = strength;
	}

	public int getLife() {
		return life;
	}

	public void setLife(int life) {
//		this.life = life;
//		if (life <=0) {
//			this.life =0;
//			}
//		else {
//			this.life = life;
//
		this.life = (life <0) ?0 : life;
//		this.life = (life >=0) ?life : 0;
	
	
	}
	
	
	
	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Dice getDice() {
		return dice;
	}

	public void setDice(Dice dice) {
		this.dice = dice;
	}
	
	

}
