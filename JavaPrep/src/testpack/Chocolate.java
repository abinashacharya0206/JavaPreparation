package testpack;

public class Chocolate {
	
	private int barcode;
	private String name;
	
	public Chocolate() {
		this.barcode=101;
		this.name="Cadbury";
	}
	
	public Chocolate(int bar, String name) {
		this.barcode=bar;
		this.name=name;
	}

	public void setBarcode(int bar) {
		this.barcode=bar;
	}
	public int getBarcode() {
		return barcode;
	}
	public void setname(String name) {
		this.name=name;
	}
	public String getName() {
		return name;
	}
	
	public String toString() {
		return (getBarcode() +getName());
	}
}
