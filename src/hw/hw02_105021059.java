package hw;
/*讓使用者輸入多個數，統計正數、負數及零各有多少個。

 * Author: 105021059 王俊鑌
 */
import java.util.Scanner;
public class hw02_105021059 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int p=0, n=0, z=0, i;
        int sc[] = new int[10];
        Scanner scn = new Scanner(System.in);
		
        System.out.print("輸入 10個數 : ");
        for(i=0; i<10; i++)
        {
            sc[i] = scn.nextInt();
        }
        for(i=0; i<10; i++)
        {
            if(sc[i] < 0)
            {
                n++;
            }
            else if(sc[i] == 0)
            {
                z++;
            }
            else
            {
                p++;
            }
        }
        System.out.print(p + " 正數");
        System.out.print("\n" + n + " 負數");
        System.out.print("\n" + z + " 零");
	}

}
