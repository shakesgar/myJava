/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Protools
 */
public class Person{				
	public String name;					

	public Person(String aName){	
		name = aName;
	}
	
	/*Newly added code - a "toString" method*/
	public String toString(){
		return name;
	}
}	
