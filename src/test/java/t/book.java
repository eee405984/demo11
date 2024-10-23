package t;

import static org.mockito.ArgumentMatchers.argThat;
import org.junit.jupiter.api.Test;
import java.util.Scanner;

public class book {
	@Test//不換行
	public void sssstest() {
	System.out.printf("Hello");
	System.out.printf(" hi"); //接下來不換行
	System.out.println("OK");//接下來換行
	System.out.println("OKl");
	}
	
	//2進位：0b 或 0B開頭；8進位：0開頭；16進位：0x或0X開頭，其中10-15以A-F(a-f)來表示
	
	@Test//逸出字元
	public void uxxxxtest() {
		System.out.println("goo\tqoo"); //反斜線(在enter上面)\t為tab鍵會空出預設空間
		System.out.println("fonding\nnemo"); // \n是換行
	}
	
	@Test
	public void constanttest() {
		//具名常數(Named Constant)指不會更改的數值，必為final開頭
		final int F=36;
	}
	
	@Test //題目：有20人，有90顆糖果，每人可以分得幾顆，還剩下幾顆
	public void eheufuei() {
		System.out.println("每人分得："+90/20);
		System.out.println("還剩下："+90%20);
	}
	
	@Test //運算相關
	public void mathtest() {
		System.out.println(Math.pow(3,2)); //Math,pow(n,m)是n的m次方(回傳為double型態)
		int x=10;
		System.out.println(++x * 10);
		}
	
	@Test //請輸入一個小於10的整數，並列出數字的平方
	public void q444(){		
		int d;
		while(true) {
		 System.out.println("請輸入一個小於10的整數");
		 Scanner s=new Scanner(System.in);
		 d=s.nextInt();
		 if(d<=10) {break;
			 }else {
				 System.out.println("輸入錯誤");
			 }}
		 System.out.println("輸入的數字為"+d);
		 System.out.println("平方為："+d*d);		
	}
	
	@Test //雞兔同籠：一共有35隻動物，100隻腳
	public void chiratest() {
		int rabbit=35;
		while(true) {
			if(rabbit*4+(35-rabbit)*2==100) {break;}
			rabbit--;
		}
		System.out.println("兔子有"+rabbit+"隻");
	}
	
	@Test //猜數字
	public void p620() {
		int ans=40;
		System.out.println("請輸入一個整數");
		Scanner s=new Scanner(System.in);
		int nu=s.nextInt();
		int con=1;
		while(true) {
			if(nu<40) {
				System.out.println("請猜大一點");
			}
			else if(nu>40) {System.out.println("請猜小一點");}
			else{break;}
			nu=s.nextInt();
			con++;
		}
		System.out.println("恭喜猜對!!  總共猜了"+con+"次");
		
	}
	
	
	
	
	
}
