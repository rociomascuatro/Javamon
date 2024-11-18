package com.calderon.javamon;

public class Combat {
	
	private final int MAX_NUMBER_ASSAULTS = 20;
	private int assault;
	private Javamon javamon1;
	private Javamon javamon2;

	public Combat(Javamon javamon1, Javamon javamon2) {
		super();
		this.javamon1 = javamon1;
		this.javamon2 = javamon2;
	}

	public void initCombat() {
		do {
			this.assault();
		} while (this.getJavamon1().getLife() > 0 && this.getJavamon2().getLife() > 0 && 
				this.getAssault() < MAX_NUMBER_ASSAULTS);
		this.outcome();
	}

	public void assault() {
		int dammage;
//		this assault++ Incrementaría nº de asaltos pero no es buena práctica
		this.setAssault(this.getAssault() + 1);
		System.out.println("Este es el asalto número:" + this.getAssault());
		if (this.getJavamon1().inititive() > this.getJavamon2().inititive()) {
			dammage = this.getJavamon1().attack() - this.getJavamon2().defend();
			dammage = (dammage >= 0) ? dammage : 0;
			System.out.println(this.getJavamon1().getName() + " está atacando y " + this.getJavamon2().getName()
					+ " está defendiendo. El daño es: " + dammage);
			this.getJavamon2().setLife(this.getJavamon2().getLife() - dammage);
		}

		else {
			dammage = this.getJavamon2().attack() - this.getJavamon1().defend();
			dammage = (dammage >= 0) ? dammage : 0;
			System.out.println(this.getJavamon2().getName() + " está atacando y " + this.getJavamon1().getName()
					+ " está defendiendo. y el daño es: " + dammage);
			this.getJavamon1().setLife(this.getJavamon1().getLife() - dammage);
		}
		System.out.println(
				"Resultado del asalto: \n\t" + this.getJavamon1().status() + "\n\t" + this.getJavamon2().status());

	}

	public void outcome() {
		// TODO Auto-generated method stub

		System.out.println("El número total de asaltos ha sido: " + this.getAssault());
		if(this.getJavamon1().getLife() > 0 && this.getJavamon2().getLife() > 0) {
			
			System.out.println("Estamos ante un empate. Esto merece unas cañas. Paga el que tenga menos vida.");
		}
		else{
			
			if (this.getJavamon1().getLife() == 0) {
				System.out.println("Podemos proclamar ganador a: " + this.getJavamon2().status());
			} else {
				System.out.println("Podemos proclamar ganador a: " + this.getJavamon1().status());
			}
		}
	}

	public int getAssault() {
		return assault;
	}

	public void setAssault(int assault) {
		this.assault = assault;
	}

	public Javamon getJavamon1() {
		return javamon1;
	}

	public void setJavamon1(Javamon javamon1) {
		this.javamon1 = javamon1;
	}

	public Javamon getJavamon2() {
		return javamon2;
	}

	public void setJavamon2(Javamon javamon2) {
		this.javamon2 = javamon2;
	}

}
