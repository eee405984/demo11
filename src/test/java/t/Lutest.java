package t;

import java.util.Scanner; //使用標準輸入(從終端機輸入資料)步驟1：載入內建Scanner類別
import static org.mockito.ArgumentMatchers.argThat;
import org.junit.jupiter.api.Test;

public class Lutest {
	@Test
	public void texttest() {
		Scanner s = new Scanner(System.in);// 步驟2：建立一個Scanner物件
		System.out.println("請輸入一個整數"); // 提示使用者輸入一個整數
		int x = s.nextInt(); // 從使用者那裡獲得一個整數放進x裡
		System.out.println(x * 10); // 把x乘以10給使用者看
	}

	@Test // if判斷式
	public void iftest() {
		// 基本形式
		System.out.println("請輸入一個數字");
		Scanner s = new Scanner(System.in);
		int number = s.nextInt();
		if (number > 100) {
			System.out.println("這個數字大於100");
		}
		// if else(反面)
		System.out.println("請問您想提領多少錢");
		Scanner s2 = new Scanner(System.in);
		int money = s2.nextInt();
		if (money > 10000) {
			System.out.println("最多僅能提領1萬元");
		} else {
			System.out.println("請稍後");
		}
		// if...else if...else
		String x = "彭彭";
		if (x == "丁滿") {
			System.out.println("你是丁滿");
		} else if (x == "彭彭") {
			System.out.println("你是彭彭");
		} else if (x == "彭彭") {
			System.out.println("你仍然是彭彭"); // 如果上面有被執行了，下面就不會管了
		}
	}

	@Test // switch判斷式
	public void switchtest() {
		int n1 = 3;
		int n2 = 4;
		System.out.println("請輸入您想做的運算(請輸入+ - * /)");
		Scanner s3 = new Scanner(System.in);
		String re = s3.next();
		switch (re) {
		case "+":
			System.out.println(n1 + n2);
			break;
		case "-":
			System.out.println(n1 - n2);
			break;
		case "*":
			System.out.println(n1 * n2);
			break;
		case "/":
			System.out.println((double)n1 / (double)n2);
			break;
		default:
			System.out.println("輸入錯誤");
			break;
		}
	}
	
	@Test //迴圈
	public void circletest() {
	/*	int x=2;
		while(x<=6) { //while迴圈
			System.out.println(x);
			x=x+2;
		}
		//題目：用while迴圈計算1+2+3...+100
		int ans=0;
		int n=1;
		while(n<=100) {
			ans=ans+n;
			n++;
		}
		System.out.println(ans);
		//for迴圈
		for(int d=2;d<=6;d=d+2) {
			System.out.println(d);
		}
		//用for迴圈計算1+2+3+...+100
		int hi=0;
		for(int m=1;m<=100;m=m+1) {
			hi=hi+m;
		}
		System.out.println(hi);
		
		//迴圈指令
		for(int i=0;i<=6;i++) {
			if(x%3==0) { //可以被3整除的數字，0也可以
			  continue;//continue;強制回到迴圈的上方，進入下一圈
		}
			System.out.println(i);}
		
		int y=0;
		while(y<=6) {
			if(y==4) {break;} //break;強制結束迴圈
			System.out.println(y);
			y++;
		} */
		//迴圈應用案例：要求使用者連續輸入直到正確為止 (如輸入一個正整數)
		//欣答案
		/*Scanner s=new Scanner(System.in);
		System.out.println("請輸入一個正整數");
		int t=s.nextInt();
		while(t<=0) {
			System.out.println("輸入錯誤，請再次輸入");
			int l=s.nextInt();
			t=l;	
		}
		System.out.println("輸入數字為"+t);*/
	 
	//老師作法
	//先做一個要求要求輸入的無限迴圈，在滿足正整數條件時才break
	//為了離開迴圈後繼續使用輸入的數字，要先在外面建一個int
	Scanner r=new Scanner(System.in);
	int d;
	while(true) {
	System.out.println("請輸入一個正整數");
	d=r.nextInt();
	if(d>0) {break;
	}else {
	System.out.println("輸入錯誤，再來一次");}
	}
	System.out.println("您所輸入數字為："+d);
	}
	
	@Test//陣列
	public void arraytest() {
		int[] grade=new int[3]; //初始化陣列長度
		System.out.println("陣列長度："+grade.length); //取得陣列長度的語法：陣列名稱.length
		grade[0]=67; //第一格放進67
		int[] row=new int[] {78,89,90}; //同時初始化陣列長度並放進資料
		for(int n=0;n<row.length;n++) { //用for迴圈來逐一印出陣列中的資料
			System.out.println(row[n]);
		}
		//計算平均數
		int ans=0;
		for(int n=0;n<row.length;n++) {
			ans=ans+row[n];
		}
		System.out.println((double)ans/row.length);	
		//應用：要求老師輸入學生數量、每位學生的成績，幫助其計算平均分數
		System.out.println("請輸入學生數量");
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int[] gg=new int[n];
		int total=0;
		System.out.println("請逐一輸入學生成績");
		for(int k=0;k<n;k++) {
			/* 不用再重新打這些
			Scanner h=new Scanner(System.in);
			int l=h.nextInt();
			gg[k]=l; */
			gg[k]=s.nextInt();  //直接要求s.nextInt()就可以
			total=total+gg[k];
		}
		System.out.println("學生成績為：");
		for(int k=0;k<n;k++) {
			System.out.println(gg[k]);
		}
		System.out.println("平均成績為："+total/(double)gg.length);
	}
}
