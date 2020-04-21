package homework;

public class PizaaApplication {

	public static void main(String[] args) {
		Pizza pie =new Pizza("medium",2,2);
		pie.addCheese(6);
		pie.getDescription();
		
		System.out.println(pie.getDescription());
		
	}

}
