package w1l5.prob6.deepcopy;

import java.util.Objects;

public class Person implements Cloneable{
	String name;
	Computer computer;
	
	Person(String name, Computer computer){
		this.name = name;
		this.computer = computer;
	}
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
//		super.clone();		
		Person clonedPerson = (Person)super.clone();
		clonedPerson.computer = (Computer)computer.clone();
		return clonedPerson;
		
	}
	
	@Override
	public String toString() {
		return "Owner Name :" + this.name + " " +  computer.toString();
	}
	
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return Objects.hash(name, computer);
	}

}
