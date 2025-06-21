package Sunbeam2025.Selenium2025;

import org.bouncycastle.asn1.cmp.RevAnnContent;

public class New {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int s=12345;
		
		int res =0;
		
		while(s !=0)
		{
			int digit = s %10;
			res = res *10 +digit;
			s/=10;
					
		}
		
		System.out.println(" the value"+res);

}
}
