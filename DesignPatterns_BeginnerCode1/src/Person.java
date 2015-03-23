/**
 *
 * @author Protools
 */
public class Person {
    public String name;				//one attribute
	
	public Person(String aName){	//one constructor
		this.name = aName;
	}
        
//        /*Newly added code - a "toString" method*/
	public String toString(){
		return name;
	}
}
