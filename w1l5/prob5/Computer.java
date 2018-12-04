package w1l5.prob5;

public class Computer {
	private  String manufacturer, processor;
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
		String computerInfo = "Manufaturer = "+ this.manufacturer +", Processor = " + this.processor+
				", RAM size = "+this.ramSize+", Processor Speed = "+this.processorSpeed;
		return computerInfo;
	}
	
	@Override
	public int hashCode() {
		return 31 + processor.hashCode() + manufacturer.hashCode() + ((Integer) ramSize).hashCode()
				+ ((Double)processorSpeed).hashCode();
	}
	
	
	

}
