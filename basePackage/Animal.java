package basePackage;

public class Animal {

	private String name;
	private String printName;

	public Animal(String name, String printName) {
		super();
		this.name = name;
		this.printName = printName;
	}

	public String getPrintName() {
		return printName;
	}

	public void setPrintName(String printName) {
		this.printName = printName;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}
