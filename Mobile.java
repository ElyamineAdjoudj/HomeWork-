package homework;

public class Mobile {
	String mobileBrand;
	String mobileCarrier;
	double mobilePrice;
	
	
	public Mobile(String mobileBrand, String mobileCarrier) {
		super();
		this.mobileBrand = mobileBrand;
		this.mobileCarrier = mobileCarrier;
		
	}
	public String getMobileBrand() {
		return mobileBrand;
	}
	public void setMobileBrand(String mobileBrand) {
		this.mobileBrand = mobileBrand;
	}
	public String getMobileCarrier() {
		return mobileCarrier;
	}
	public void setMobileCarrier(String mobileCarrier) {
		this.mobileCarrier = mobileCarrier;
	}
	public double getMobilePrice() {
		return mobilePrice;
	}
	public void setMobilePrice(double mobilePrice) {
		this.mobilePrice = mobilePrice;
	}
	public double calPrice() {
		if (mobileBrand=="Iphone") {
	
		return 699.99;
		}
		else if(mobileBrand=="Samsung")	{
			return 799.99;	
		}
		else return 0.0;
	}
	public void printInvoice() {
		System.out.println("Phone brand: "+mobileBrand +"\nCarrier : "+mobileCarrier+"\nPrice : "+calPrice() );
	}
	

}
