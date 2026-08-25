package LeetCodeDay_18_22_08_2026;

import java.util.Arrays;
import java.util.List;

public class UseTarnariyeOprator {
	public static void main(String[] args) {
		int a=(4>5||4<3)?2:3;
		System.out.println(a);
		String name=("Archna"=="Archna"||"Kajal"=="Kamli")?"Archna":"Kajal";
		System.out.println(name);
		Boolean prsentage=(44>33 || 44>4 || 44>44 ||44 >44)? true:false;
		System.out.println(prsentage);
		List<String> useEuelsIgnorCases=Arrays.asList("Archna","Shusma","Sumit","Sumi");
		
	}

}
