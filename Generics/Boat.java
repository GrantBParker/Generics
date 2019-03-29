
public class Boat implements Measurable{
	
	private String name;
	private double weight;
	private double length;
	
	public Boat() {
		
	}
	
	public Boat(String name, double weight, double length) {
		this.name = name;
		this.weight = weight;
		this.length = length;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public double getLength() {
		return length;
	}

	public void setLength(double length) {
		this.length = length;
	}

	@Override
	public String toString() {
		return "Boat [name=" + name + ", weight=" + weight + ", length=" + length + "]";
	}

	@Override
	public int getMeasure() {
		
		return 0;
	}
	
	
	

}
