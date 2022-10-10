package extend.practice;

public class Brave extends Human {

	public void attack(Living target) {
		int offensive = super.offensive * Rand.get(10);
		
		// メッセージを表示
		String Humandoing = super.name + "が剣で攻撃！" + target.name + "に" + offensive + "のダメージを与えた。";
		System.out.println(Humandoing);

		// hpを減らす
		target.hp = target.hp - offensive;
	}


}
