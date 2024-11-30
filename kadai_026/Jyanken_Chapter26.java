package kadai_026;

import java.util.HashMap;
import java.util.Scanner;

public class Jyanken_Chapter26 {
	private String rock = "r";
	private String scissors = "s";
	private String paper = "p";
	
	public String getMyChoice() {
		System.out.println("自分のじゃんけんの手を入力しましょう");
		System.out.println("グーはrockのrを入力しましょう");
		System.out.println("チョキはscisssorsのsを入力しましょう");
		System.out.println("パーはpaperのpを入力しましょう");
		
		Scanner scanner = new Scanner(System.in);
		String input = scanner.next();

		if((input.equals(rock)) || (input.equals(scissors)) || (input.equals(paper))) {	
			scanner.close();
			return input;
		} else {
			System.out.println("この値は適切ではありません");
			return getMyChoice();
		}
		
	}
	 
	
	public String getRandom() {
		String[] hand = { "r", "s", "p"};
		int randNum = (int)(Math.floor(Math.random()*3));
		return hand[randNum];
	}
	
	public void playGame(String myChoice, String random) {
		HashMap<String,String> eachHands = new HashMap<String, String>();
		eachHands.put("r", "グー");
		eachHands.put("s", "チョキ");
		eachHands.put("p", "パー");
		System.out.println("自分の手は" + eachHands.get(myChoice) + ",対戦相手の手は" + eachHands.get(random));
		
		if(myChoice.equals(random)) {
			System.out.println("あいこです");
		} else if(((myChoice.equals("r"))&&(random.equals("s"))) || 
				((myChoice.equals("s"))&&(random.equals("p"))) || 
				((myChoice.equals("p"))&&(random.equals("r")))){
			System.out.println("自分の勝ちです");
		} else {
			System.out.println("自分の負けです");
		}
	}
}
