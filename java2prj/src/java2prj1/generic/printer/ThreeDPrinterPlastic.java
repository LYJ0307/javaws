package java2prj1.generic.printer;

public class ThreeDPrinterPlastic {
	
	
	private Plastic meterial;

	
	
	public Plastic getMeterial() {
		return meterial;
	}

	public void setMeterial(Plastic meterial) {
		this.meterial = meterial;
	}
	
	
	public void print() {
		System.out.println("3D print use: " + meterial);
	}
	
	

}
