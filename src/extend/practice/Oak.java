package extend.practice;

public class Oak extends Monster {
	public void attack(Living target) {
		//乱数を使って攻撃力を計算
		int offensive = super.offensive * Rand.get(10);
		
		//メッセージを表示
		String Monsterdoing = super.name + "が槍で攻撃！" + target.name + "に" + offensive + "のダメージを与えた。";
		System.out.println(Monsterdoing);

		//hpを減らす
		target.hp = target.hp - offensive;
	}

}
