package w1l5.prob6.deepcopy;


public class TestClone {
	public static void main(String[] args) throws CloneNotSupportedException {
		
		Computer computer1 = new Computer("DELL", "x64", 8, 3.0);		
		Person p1 = new Person("Linius Torvalds", computer1);
		System.out.println("Before cloning: " + p1);
		
		Person p2 = (Person) p1.clone();
		System.out.println("After cloning: " + p2);
		
		p2.name = "Bill Gates";
		p2.computer.manufacturer= "Toshiba";
		
		System.out.println("After changing P1 " + p1);
		System.out.println("After changing  P2 " + p2);
		
		
		/**
		 * 
		 *	Before cloning: Owner Name :Linius Torvalds Manufaturer = DELL, Processor = x64, RAM size = 
8, Processor Speed = 3.0
After cloning: Owner Name :Linius Torvalds Manufaturer = DELL, Processor = x64, RAM size = 
8, Processor Speed = 3.0
After changing P1 Owner Name :Linius Torvalds Manufaturer = DELL, Processor = x64, RAM size = 
8, Processor Speed = 3.0
After changing  P2 Owner Name :Bill Gates Manufaturer = Toshiba, Processor = x64, RAM size = 
8, Processor Speed = 3.0

		 * 
		 */
	}
}
