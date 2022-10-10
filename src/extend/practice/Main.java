package extend.practice;

import java.util.ArrayList;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		List<Living> humanList = new ArrayList<>();

		Brave brave = new Brave();
		brave.name = "勇者";
		brave.hp = 1500;
		brave.offensive = 80;
		humanList.add(brave);

		Fighter fighter = new Fighter();
		fighter.name = "戦士";
		fighter.hp = 1500;
		fighter.offensive = 80;
		humanList.add(fighter);

		Wizard wizard = new Wizard();
		wizard.name = "魔法使い";
		wizard.hp = 1500;
		wizard.offensive = 60;
		humanList.add(wizard);

		List<Living> monsterList = new ArrayList<>();

		Oak oak = new Oak();
		oak.name = "オーク";
		oak.hp = 1500;
		oak.offensive = 0;
		monsterList.add(oak);

		Dragon dragon = new Dragon();
		dragon.name = "ドラゴン";
		dragon.hp = 1500;
		dragon.offensive = 90;
		monsterList.add(dragon);

		Slime slime = new Slime();
		slime.name = "スライム";
		slime.hp = 1500;
		slime.offensive = 32;
		monsterList.add(slime);

		// バトル、交互に戦う操作
		boolean isHumanTurn = true;
		while (humanList.size() > 0 && monsterList.size() > 0) {
			// 攻撃
			if (isHumanTurn == true) {
				int attacker = Rand.get(humanList.size());
				int target = Rand.get(monsterList.size());
				System.out.println("人間のターン!");
				humanList.get(attacker).attack(monsterList.get(target));
				if (monsterList.get(target).hp <= 0) {
					System.out.println(monsterList.get(target).name + "が倒れた!");
					monsterList.remove(monsterList.get(target));
				}

			} else {
				int attacker = Rand.get(monsterList.size());
				int target = Rand.get(humanList.size());
				System.out.println("モンスターのターン!");
				monsterList.get(attacker).attack(humanList.get(target));
				if (humanList.get(target).hp <= 0) {
					System.out.println(humanList.get(target).name + "が倒れた!");
					humanList.remove(humanList.get(target));
				}

			}

			// ターン変更
			isHumanTurn = !isHumanTurn;
		}

		if (monsterList.size() == 0) {
			System.out.println("勇者達は勝利した！");

		} else {
			System.out.println("オーク達は勝利した！");

		}

	}
}
