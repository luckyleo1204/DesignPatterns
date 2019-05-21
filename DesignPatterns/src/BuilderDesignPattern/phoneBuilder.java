package BuilderDesignPattern;

public class phoneBuilder {
	
	private int size;
	private String name;
	private double battery;
	private int ram;
	
	
	public phoneBuilder setSize(int size) {
		this.size = size;
		return this;
	}

	public phoneBuilder setName(String name) {
		this.name = name;
		return this;
	}

	public phoneBuilder setBattery(double battery) {
		this.battery = battery;
		return this;
	}

	public phoneBuilder  setRam(int ram) {
		this.ram = ram;
		return this;
	}
	
	public phone getPhone()
	{
		return new phone(size, name, battery, ram);
	}
	
	

}
