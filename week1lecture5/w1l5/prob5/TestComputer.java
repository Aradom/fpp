package w1l5.prob5;

public class TestComputer {
	public static void main(String[] args) {
		Computer computer1 = new Computer("DELL", "i7", 6, 3.5);
		Computer computer2 = new Computer("HP", "i5", 6, 3.5);
		Computer computer3 = new Computer("MAC", "i7", 6, 2.5);
		Computer computer4 =  new Computer("MAC", "i7", 6, 2.5);
		
		System.out.println("Computer 1.equals(computer2)): " + computer1.equals(computer2));
		System.out.println("Computer2.equals((computer3)) :" + computer2.equals(computer3));
		System.out.println("computer3.equals(computer(4))" + computer3.equals(computer4));
		
		
		/***
		 * 
		 *  computer 1.equals(computer2)): false
			computer2.equals((computer3)) :false
			computer3.equals(computer(4))true

		 * 
		 * 
		 * 
		 */
		
	}

}
