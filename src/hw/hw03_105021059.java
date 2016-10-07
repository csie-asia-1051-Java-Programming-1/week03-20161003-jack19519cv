package hw;
/*讓使用者輸入一正整數n，用for迴圈計算n!後輸出。
 *  Author: 105021059 王俊鑌
 */
import java.util.Scanner;
public class hw03_105021059 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner scn =new Scanner(System.in);  
		int n = scn.nextInt();
		int a =1;
		for(int i = 1;i <= n;i++){
			a *=i;}
		System.out.println(a);
        		  
	}

}
