package extend.practice;

public class Fighter extends Human  {
	public void attack(Living target) {
		//乱数を使って攻撃力を計算
		int offensive = super.offensive * Rand.get(10);
		
		//メッセージを表示
		String Humandoing = super.name + "が斧で攻撃！" + target.name + "に" + offensive + "のダメージを与えた。";
		System.out.println(Humandoing);

		//hpを減らす
		target.hp = target.hp - offensive;
	}
}
