package java_day21.rpg;

public class Boss extends Enemy {

	public Boss(String name, int damage, int hp) {
		super(name, damage, hp);
		talk();
	}

	@Override
	public void talk() {
		System.out.println("여기까지 오다니 제법이구나");
	}
	
}
