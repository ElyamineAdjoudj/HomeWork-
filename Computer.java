package homework;

public class Computer {

	String computerBrand;
	int computerHardDrive;
	int computerPrice;
	
	public Computer() {
		this.computerBrand="No brand";
		this.computerHardDrive=0;
		this.computerPrice=0;
		}
	public Computer(String computerBrand,int computerHardDrive,int computerPrice) {
		this.computerBrand=computerBrand;
		this.computerHardDrive=computerHardDrive;
		this.computerPrice=computerPrice;
		
	}
	public void setCompterBrand(String computerBrand) {
		if (computerBrand=="Acer" ||computerBrand=="Dell")
		this.computerBrand=computerBrand;
		else
			System.out.println("The brand is not available");
	}
	
	public String getComputerBrand() {
		return computerBrand;
	}
	public void printOrder() {
		System.out.println("Your computer is "+ computerBrand+"\nHard drive : "+computerHardDrive+ " Giga in hard drive\n" +"Your price is  $" +computerPrice );
	}
}
