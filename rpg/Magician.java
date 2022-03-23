package java_day21.rpg;

public class Magician extends Character {
	private Jobs job;

	public Magician(String name, int damage, int hp, Jobs job) {
		super(name, damage, hp);
		this.job = job;
		talk();
	}

	@Override
	public void skill(Enemy enemy) {
		switch (job) {
		case FIRE:
			System.out.println("파이어볼");
			enemy.setHp(enemy.getHp() - 50);
			System.out.println(enemy.getName() + "이(가) 화상을 입었습니다.");

			for (int i = 0; i < 4; i++) {
				enemy.setHp(enemy.getHp() - 5);
				System.out.println("-" + enemy.getHp());
				if (enemy.getHp() <= 0) {
					enemy.die();
				} else if (enemy.getHp() > 0) {
					System.out.println(enemy.getName() + "이(가) 화마에서 벗어났습니다.");
					enemy.talk();
				}
			}
			break;
			
		case ICE:
			System.out.println("아이스 스톰");
			enemy.setHp(enemy.getHp() - 50);
			System.out.println(enemy.getName() + "이(가) 동상을 입었습니다.");

			for (int i = 0; i < 4; i++) {
				enemy.setHp(enemy.getHp() - 5);
				System.out.println("-" + enemy.getHp());
				if (enemy.getHp() <= 0) {
					enemy.die();
				} else if (enemy.getHp() > 0) {
					System.out.println(enemy.getName() + "이(가) 동상에서 벗어났습니다.");
					enemy.talk();
				}
			}
			break;
		}
	}

	@Override
	public void talk() {
		switch (job) {
		case FIRE:
			System.out.println("내손안에 흑염룡이....!");
			break;
		case ICE:
			System.out.println("저는 냉장고가 싫습니다.");
			break;
		default:
			System.out.println("직업이 없습니다.");
			break;
		}
	}

	enum Jobs {
		FIRE, ICE
	}
}
