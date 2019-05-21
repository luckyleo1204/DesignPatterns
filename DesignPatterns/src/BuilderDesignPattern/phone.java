package BuilderDesignPattern;

public class phone {
	
	private int size;
	private String name;
	private double battery;
	private int ram;
	public phone(int size, String name, double battery, int ram) {
		super();
		this.size = size;
		this.name = name;
		this.battery = battery;
		this.ram = ram;
	}
	@Override
	public String toString() {
		return "phone [size=" + size + ", name=" + name + ", battery=" + battery + ", ram=" + ram + "]";
	}
	
	
	
	

}
