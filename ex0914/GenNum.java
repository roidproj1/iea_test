package sample.ex0914;

import java.util.ArrayList;

public class GenNum {

	public static String genAssetId(String startAssetId) {
	
		int iAssetId = Integer.parseInt(startAssetId);
		char[] chs = startAssetId.toCharArray();
		int tot = 0;
		
		for(char c:chs) {
			tot = tot + Integer.parseInt(String.valueOf(c));
		}
		
		return String.valueOf(iAssetId * 10 + (tot % 10));
	}
	
	
	public static ArrayList<String> genAssetIds(String startAssetId, int cnt) {
		
		int iAssetId = Integer.parseInt(startAssetId);
		char[] chs = startAssetId.toCharArray();
		ArrayList<String> rsltLst = new ArrayList<String>(); 
 	
		int tot = 0;
		
		for(char c:chs) {
			tot = tot + Integer.parseInt(String.valueOf(c));
		}
		
		int baseId = iAssetId * 10 + (tot % 10);
		
		for(int i=0; i<cnt; i++) {
			rsltLst.add(String.valueOf(baseId + i));
		}
		
		return rsltLst;
	}
	
	public static void main(String[] args) {

		String astId = 
//				"102341"
				"102355"				
			;
		
		System.out.println(genAssetId(astId));
		System.out.println(genAssetIds(astId, 5));
	}

}
