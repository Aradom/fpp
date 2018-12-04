package w1l5.prob2;

public class Professor extends DeptEmployee{
	
	
	int numberOfPublications;
	
	public Professor() {
		// TODO Auto-generated constructor stub
		super();
	}
	
	public Professor(String name, double salary, int publications) {
		super(name, salary);
		this.numberOfPublications = publications;
	}
	

	public int getNumberOfPublications() {
		return numberOfPublications;
	}

	public void setNumberOfPublications(int numberOfPublications) {
		this.numberOfPublications = numberOfPublications;
	}
	
}
