/**
 * 
 */
package com.dmedragh.tut.java8;

import java.util.Arrays;

/**
 * @author dmedragh
 *
 */
public class LambdaExpressionTutorial {

	/**
	 * 
	 */
	public LambdaExpressionTutorial() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) { 
		
		Personne[] personnes = {new Personne(54), new Personne(36), new Personne(33)};
		for(Personne personne : personnes) {
			System.out.println("l'age de la personne est "+personne.getAge());
		}
		
		//1-create a class implementing compararator
		//2-use an existing method
		//3-use a lambda expression
		Arrays.sort(personnes, (p1,p2)-> {
			return p1.getAge() - p2.getAge();
		});
		for(Personne personne : personnes) {
			System.out.println("l'age de la personne est "+personne.getAge());
		}

	}

}
