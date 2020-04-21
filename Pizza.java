package homework;

public class Pizza {
	private String pizzasize;
	private int cheesecount;
	private int veggicount;
	
	public Pizza() {
		this.pizzasize = " No Size";
		this.cheesecount = 0;
		this.veggicount = 0;
	}

	public Pizza(String pizzasize, int cheesecount, int veggicount ){
		this.pizzasize=pizzasize;
		this.cheesecount=cheesecount;
		this.veggicount=veggicount;
		
}	
	public void setPizzaSize(String pizzasize) {
		this.pizzasize=pizzasize;
	}
	public String getPizzaSize() {
		return pizzasize;
	}
	public void addCheese(int cheesecount ) {
		this.cheesecount=cheesecount;
	}
	public int getChesse() {
		return cheesecount;
	}
	public void addVeggie(int veggicount ) {
		this.veggicount=veggicount;
	}
	public int getVeggie() {
		return veggicount;
	}
	public int calcCost() {
		if(pizzasize.equalsIgnoreCase("small")) {
	
			return 7+(cheesecount+veggicount)*2;
		}
		else if(pizzasize.equalsIgnoreCase("medium")) {
			
			return 10+(cheesecount+veggicount)*2;
	}
		if(pizzasize.equalsIgnoreCase("large")) {
			
			return 12+(cheesecount+veggicount)*2;
}
		else 
			return 0;
}
	public String getDescription()
	{
		return "Pizza size: " + pizzasize + "\n Cheese toppings: " 
				+ cheesecount + "\n veggie toppings: " +veggicount+ "\n Pizza cost: $" +calcCost() + "\n";
	}
}