package myCode;

import java.util.HashSet;
import java.util.Set;

public class StringCompare {
	private Set<String> sbstrlst = new HashSet<String>();
	private int fnsbstrsize = 0;

	public Set<String> getResult(String s){

		sbstrlst.clear();

		boolean[] flg = new boolean[256];
		int j = 0;
		char[] charArr= s.toCharArray();
		for (int i = 0; i < charArr.length; i++) {
			char c = charArr[i];
			if (flg[c]) {
				extSbStr(charArr,j,i);
				for (int k = j; k < i; k++) {
					if (charArr[k] == c) {
						j = k + 1;
						break;
					}
					flg[charArr[k]] = false;
				}
			} else {
				flg[c] = true;
			}
		}
		extSbStr(charArr,j,charArr.length);
		return sbstrlst;
	}
	private String extSbStr(char[] charArr, int st, int ed){

		StringBuilder sb = new StringBuilder();
		for(int i=st;i<ed;i++){
			sb.append(charArr[i]);
		}
		String subStr = sb.toString();
		if(subStr.length() > fnsbstrsize){
			fnsbstrsize = subStr.length();
			sbstrlst.clear(); 
			sbstrlst.add(subStr);
		} else if(subStr.length() == fnsbstrsize){
			sbstrlst.add(subStr);

		}

		return sb.toString()  ;
	}
	public static void main(String a[]){
		StringCompare sc = new StringCompare();

		System.out.println(sc.getResult("abcdffadc"))   ;



	}
}
