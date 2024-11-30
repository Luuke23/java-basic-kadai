package kadai_026;

public class JyankenExec_Chapter26 {

	public static void main(String[] args) {
		Jyanken_Chapter26 jyanken = new Jyanken_Chapter26();
		
		String myChoice = jyanken.getMyChoice();
		String random = jyanken.getRandom();
		jyanken.playGame(myChoice, random);
	}

}
