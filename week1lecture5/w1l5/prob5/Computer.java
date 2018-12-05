package w1l5.prob5;

import java.util.Objects;

public class Computer implements Comparable<Computer> {
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
				this.processor + ", RAM size = " +  
				this.ramSize + ", Processor Speed = " + this.processorSpeed;
		return computerInfo;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj == null) return false;
		if(!(obj instanceof Computer)) return false;
		
		Computer comp = (Computer)obj;
		if(this.manufacturer.equals(comp.manufacturer) && this.processor.equals(comp.processor) &&
				this.ramSize == comp.getRamSize() && this.processorSpeed==comp.processorSpeed) {
			return true;
		}
		return false;
	}

	@Override
	public int hashCode() {
		return 31 + processor.hashCode() + manufacturer.hashCode() + ((Integer) ramSize).hashCode()
				+ ((Double) processorSpeed).hashCode();
		
		// In Java 8 we can do
//		return Objects.hash(processor, manufacturer, ramsize, processorSpeed);
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
