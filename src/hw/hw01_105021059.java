package hw;
import java.util.Scanner;
public class hw01_105021059 {
/*輸入一個正整數值(不含 0)，傳回該數值是幾位數(# ofdigits)。
 * Author: 105021059 王俊鑌
 */
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int a = 0;
		while(n>0){
			n= n/10;
			a=a+1;
		}
		System.out.println(a);
		}
		
	
		
		
		

	}


