package object;

public class ToStringOverride {
	String name;

	public ToStringOverride(String name) {
		this.name = name;
	}
	
	@Override
	public String toString() {
		return name;
	}
	
	public static void main(String[] args) {
		ToStringOverride TSO1 = new ToStringOverride("Tom");
		ToStringOverride TSO2 = new ToStringOverride("Jerry");
		System.out.println(TSO1);
		System.out.println(TSO2);
	}
}
