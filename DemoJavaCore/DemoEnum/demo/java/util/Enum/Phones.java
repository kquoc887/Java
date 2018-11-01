package demo.java.util.Enum;

public enum Phones {
	Iphone("Iphone 6s+", "4GB", "IOS 11"),
	Android("SamSung Galaxy S7", "4GB", "Android 8.0");
	private String type;
	private String ram;
	private String system;
	private Phones(String type, String ram, String system) {
		this.type = type;
		this.ram = ram;
		this.system = system;
	}
	
	public String getType() {
		return type;
	}
	
	public String getRam() {
		return ram;
	}
	
	public String getSystem() {
		return system;
	}
}
