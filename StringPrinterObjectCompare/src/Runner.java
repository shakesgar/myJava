/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Protools
 */
class Runner{
	public static void main(String[] args){
		String  s = new String("text");
		System.out.println(s);				//Prints "text" 
		s = new String("text");
		System.out.println(s);				//Also prints "text"
	}
}
/*
* Question: how are we going to check if the reference 's' 
*			"refers to" a different Object after each assignment?
*/