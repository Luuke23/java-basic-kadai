package kadai_021;

import java.util.HashMap;

public class Dictionary_Chapter21 {
		
	HashMap<String,String> dictionaryMap = new HashMap<String,String>();
	
	public Dictionary_Chapter21() {
		dictionaryMap.put("apple","りんご");
		dictionaryMap.put("peach","桃");
		dictionaryMap.put("banana","バナナ");
		dictionaryMap.put("lemon","レモン");
		dictionaryMap.put("pear","梨");
		dictionaryMap.put("kiwi","キウイ");
		dictionaryMap.put("strawberry","いちご");
		dictionaryMap.put("grape","ぶどう");
		dictionaryMap.put("muscat","マスカット");
		dictionaryMap.put("cherry","チェリー");
		}
	
	public void searchWord(String fruitName) {
			if(dictionaryMap.containsKey(fruitName)) {
				System.out.println(fruitName + "の意味は" + dictionaryMap.get(fruitName));
			} else {
				System.out.println(fruitName + "は辞書に存在しません");
			}
		}

}
