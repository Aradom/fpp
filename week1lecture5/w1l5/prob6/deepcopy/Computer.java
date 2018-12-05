package w1l5.prob6.deepcopy;

public class Computer implements Comparable<Computer>, Cloneable {
	String manufacturer, processor;
	int ramSize;
	double processorSpeed;

	public Computer(String manufacturer, String processor, int ramSize, double processorSpeed) {
		super();
		this.manufacturer = manufacturer;
		this.processor = processor;
		this.ramSize = ramSize;
		this.processorSpeed = processorSpeed;
	}

	public int getRamSize() {
		return ramSize;
	}

	public double getProcessorSpeed() {
		return processorSpeed;
	}

	double computePower() {
		return ramSize * processorSpeed;
	}

	@Override
	public String toString() {
		String computerInfo = "Manufaturer = " + this.manufacturer + ", Processor = " +
				this.processor + ", RAM size = " + "\n"+ 
				this.ramSize + ", Processor Speed = " + this.processorSpeed;
		return computerInfo;
	}

	@Override
	public int hashCode() {
		return 31 + processor.hashCode() + manufacturer.hashCode() + ((Integer) ramSize).hashCode()
				+ ((Double) processorSpeed).hashCode();
	}
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		Computer computer = (Computer)super.clone();
		return computer;
		
	}
	

	@Override
	public int compareTo(Computer o) {
		if(o == null) return -1;
		if(!(o instanceof Computer))
			return -1;
		 if(this.manufacturer.equalsIgnoreCase(o.manufacturer) &&
				 (this.getProcessorSpeed() == o.getProcessorSpeed()) && (this.getRamSize() == o.getRamSize())){
			 return 0;
		 }
		 return 1; 
	}
}
