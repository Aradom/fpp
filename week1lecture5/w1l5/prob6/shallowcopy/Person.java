package w1l5.prob6.shallowcopy;

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
		return (Person)super.clone();
		
	}
	
	@Override
	public String toString() {
		return "Owner Name :" + this.name + "  " +  computer.toString();
	}

}
