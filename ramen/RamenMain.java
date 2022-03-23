package java_day21.ramen;

public class RamenMain {
	public static void main(String[] args) {
		JinRamen jinRamen = new JinRamen("진라면", 800);
		
		System.out.println(jinRamen.toString());
		jinRamen.printRecipe();
		
		BuldakRamen buldakRamen = new BuldakRamen("불닭볶음면", 1200);
		
		System.out.println(buldakRamen.toString());
		buldakRamen.printRecipe();
	}
}
