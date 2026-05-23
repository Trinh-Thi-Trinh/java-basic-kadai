package kadai_028;

import java.util.HashMap;
import java.util.Scanner;

public class Jyanken_Chapter28 {

	public Jyanken_Chapter28() {

	}

	public String getMyChoice() {
		while (true) {
			System.out.println("自分のじゃんけんの手を入力しましょう");
			System.out.println("グーはrockのrを入力しましょう");
			System.out.println("チョキはscissorsのsを入力しましょう");
			System.out.println("パーはpaperのpを入力しましょう");

			Scanner scanner = new Scanner(System.in);
			String handInput = scanner.next();
			if (handInput.equals("r") || handInput.equals("p") || handInput.equals("s")) {
				scanner.close();
				return handInput;
			}
			else {
				System.out.println("正しく入力してください");
			}

		}

	}

	public String getRandom() {
	
		int randomComputer = (int)Math.floor(Math.random() * 3);
		//int randomComputer = (int)Math.random()*3;

		String computerInput = "";
		if (randomComputer == 0)
			computerInput = "r";
		else if (randomComputer == 1)
			computerInput = "s";
		else
			computerInput = "p";
		return computerInput;
	}

	public void playGame(String handInput, String computerInput) {
		HashMap<String, String> letterMap = new HashMap<>();
		letterMap.put("r", "グー");
		letterMap.put("s", "チョキ");
		letterMap.put("p", "パー");
		System.out.println("自分の手は" + letterMap.get(handInput) + ",対戦相手の手は" + letterMap.get(computerInput));
		//あいこ
		if (handInput.equals(computerInput))
			System.out.println("あいこです");
		//自分の勝ち
		else if ((handInput.equals("r") && computerInput.equals("s")) ||
				(handInput.equals("s") && computerInput.equals("p")) ||
				(handInput.equals("p") && computerInput.equals("r")))
			System.out.println("自分の勝ちです");
		// 負け
		else {
			System.out.println("自分の負けです");
		}
	}

}
