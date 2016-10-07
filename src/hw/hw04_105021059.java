package hw;
/*讓使用者輸入一正整數n，用while迴圈計算n!後輸出。
 Author: 105021059 王俊鑌
 */
import java.util.Scanner;
public class hw04_105021059 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn =new Scanner(System.in);  
		int n = scn.nextInt();
		int i =1,sum =1;
		while(i <= n){
			sum*=i;i++;}
		System.out.println(sum);
	}

}
