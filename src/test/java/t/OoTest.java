package t;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

import org.junit.jupiter.api.Test;
import org.springframework.util.StringUtils;

public class OoTest {
// 公有類別(public class)一java程式只有一個，必須和程式檔案名稱一樣

	@Test // 不同的資料型態
	public void llTest() {
		System.out.println(2000000000000L);
		// 直接打整數，程式預設的型態是int，如果要打超過20億的整數=長整數，要在數字後面加L
		System.out.println(3.14159268);
		// 浮點數，程式預設的型態是double(雙精度浮點數，到小樹下15位數)，如果要打單精度浮點數，要在數字後面加f
		System.out.println("kuha");
		System.out.println('a');
	}

	@Test // 使用變數(步驟：宣告變數_指定資料_使用資料)
	public void ooTest() {
		int x; // 宣告變數語法【資料型態 變數名稱；】宣告一個整數變數x，x的裡面就只能夠放int型態的資料
		x = 3; // 指定資料作法1
		System.out.println(x);
		x = 40; // 整數變數x裡面裝的資料可以變化(在後面的資料會覆蓋先前的資料)
				// 注意錯誤寫法int x=3; int x=40;(第一個意味著整數變數x已經被宣告了)
		System.out.println(x);
		float n = 3.7489324732894F; // 指定資料作法2(同時宣告變數並指定資料) & 太多位數後加f才是符合n的資料型態，才可以放進n裡面
		System.out.println(n);
		int h, j, k, l; // 可以一次宣告多個變數，變數間用,隔開
	}

	@Test // 數值資料型態的轉變
	// 數字型態大小排序：
	public void numchtest() {
		int n1 = 3;
		double n2 = n1;
		System.out.println(n2);// 範圍小變大：直接轉換變成3.0
		System.out.println(n1);// n1還在

		double n3;// 範圍大變小，須加上(資料型態)做強制轉換，但數字可能失真
		n3 = 3.54;
		int n4 = (int) n3;// 把n3作強制轉換為int，然後存放到n4
		System.out.println(n4);
		System.out.println(n3);
		n3 = 24.55;
		System.out.println(n4); // n3裡放的東西變了，n4還沒變
		n4 = (int) n3;
		System.out.println(n4);// 再相等一次，n4裡放的才會變
	}

	@Test // 字串與數字間的轉換
	public void Stringchtest() {
		int q1 = Integer.parseInt("675");// 字串轉換成數字：Integer.parseInt()
		System.out.println(q1);
		String q2 = "9.1";
		double q3 = Double.parseDouble(q2);
		System.out.println(q3);

		String q4;
		q4 = String.valueOf(23); // 數字轉換成字串String.valueOf()
		System.out.println(q4);
		float q5 = 5.243F;
		q4 = String.valueOf(q5);
		System.out.println(q4);
	}

	@Test // 算術運算
	public void plutest() {
		System.out.println(5 * 2);
		System.out.println(5 / 2);// 整數除法(兩邊均為整數)，會拋棄小數
		double z;
		z = (double) (5 / 2);
		System.out.println(z); // 先做整數除法5/2，再將答案2強制轉換成double，再放進z
		z = (double) 5 / 2; // 先將5強制轉換成double，再做浮點數除法5.0/2，再放進z
		System.out.println(z);
		System.out.println((int) (5 % 1.5)); // %=mod=取餘數
	}

	@Test // 指定運算(用來將資料指定給變數=將資料存放進變數裡面)
	public void htset() {
		int x = 3;// 把3指定放進x裡
		x = x + 1; // 把x拿出來+1，再放回X裡
		System.out.println(x);
		int y = 3;
		y += 1; // 把y拿出來+1，再放回y裡(相當於x=x+1)
		y *= 2; // 把y拿出來*2，再放回y裡
		System.out.println(y);
	}

	@Test
	public void ytest() {
		boolean B;
		B = 5 <= 2;// 比較運算
		System.out.println(B);
		B = 5 != 2;
		System.out.println(B);
		B = "ftyfsdadiasdui" == "shfk"; // 也可以比較兩字串是否相等
		System.out.println(B);

		int u = 4;// 單元運算
		u++;
		System.out.println(u);
		boolean y = !true;
		System.out.println(y);

		// 邏輯運算
		boolean b = true && false;
		boolean bb = true || false;
		System.out.println(b);
		System.out.println(bb);
	}

	@Test
	public void hwiu() {
		System.out.println("name\tage");
	}

	// 計算字出現幾次
	@Test
	public void wiuf() {
		Random r = new Random();
		List<String> s = new ArrayList<>();
		while (s.size() < 4) {
			int number = r.nextInt(0, 10);
			if (s.contains(number + "") == false) {
				s.add(number + "");
			}
		}
		System.out.println(s.toString());
	}

	@Test
	public void sjdio() {
		System.out.println("請輸入三位數的整數");
		Scanner s = new Scanner(System.in);
		int number = s.nextInt();
		int hun = number / 100;
		int ten = number / 10 % 10;
		int one = number % 10;
		System.out.printf("個位數為%d十位數為%d百位數為%d", hun, ten, one);
	}

	@Test // P36 11min
	public void number6() {
		Scanner s = new Scanner(System.in);
		System.out.println("請輸入第一個整數");
		int n1 = s.nextInt();
		System.out.println("請輸入第二個整數");
		int n2 = s.nextInt();
		boolean resault = n1 == 6 || n2 == 6 || (n1 + n2) % 6 == 0;
		System.out.println(resault);
	}

	@Test // 三元表達式
	public void ternaryOperatorTest() {
		// 求兩個數是否相等
		Scanner s = new Scanner(System.in);
		System.out.println("請輸入第一個數");
		double n1 = s.nextDouble();
		System.out.println("請輸入第二個數");
		double n2 = s.nextDouble();
		System.out.println(n1 == n2 ? "相同" : "不相同");

		// 求三者中最大
		int a = 2;
		int b = 5;
		int c = 231;
		System.out.println((a > b ? a : b) > c ? (a > b ? a : b) : c);
	}

	@Test //
	public void noodleTest() {
		Scanner s = new Scanner(System.in);
		System.out.println("今天想吃什麼麵");
		String want = s.nextLine();
		if (StringUtils.hasText(want)) {
			if (want == "蘭州拉麵" || want == "武漢熱乾麵" || want == "北京炸醬麵") {
				System.out.println("今晚吃" + s);
			} else {
				System.out.println("今晚吃泡麵");
			}
		} else {
			System.out.println("快說啊");
		}

	}

	@Test
	public void whatSportToday() {
		Scanner s = new Scanner(System.in);
		System.out.println("今天星期幾?");
		String day = s.nextLine();
		switch (day) {
		case "一":
			System.out.println("跑步");
			break;
		case "二":
			System.out.println("游泳");
			break;
		case "三":
			System.out.println("慢走");
			break;
		case "四":
			System.out.println("跑步");
			break;
		case "五":
			System.out.println("跑步");
			break;
		case "六":
			System.out.println("跑步");
			break;
		case "日":
			System.out.println("跑步");
			break;
		default:
			System.out.println("沒有這個星期");
		}
	}

	@Test // 求1~100所有的偶數和
	public void uidhiuwf() {
		int sum = 0;
		for (int n = 1; n < 101; n++) {
			if (n % 2 == 0) {
				sum += n;
			}
		}
	}

	@Test // 輸入兩個數字，求兩個數字間可被3整除又可被5整除的數字有幾個
	public void uidfwefewfefwf() {
		Scanner s = new Scanner(System.in);
		int n1 = s.nextInt();
		int n2 = s.nextInt();
		int sum = 0;
		for (; n1 <= n2; n1++) {
			if (n1 % 3 == 0 && n1 % 5 == 0) {
				sum++;
			}
		}
		System.out.println(sum);
	}

	@Test // P47 6min
	public void mountainAndPapaer() {
		int count = 0;
		double thickness = 0.1;
		while (thickness < 8844430) {
			thickness *= 2;
			count++;
		}
		System.out.println(count + "次");
	}

	@Test // 判斷是否為回文數(P48)
	public void palindromeTest() {
		Scanner s = new Scanner(System.in);
		int number= s.nextInt();//例如：1234	
		int copy=number;
		//要獲得一個反過來的數
		int upsidedown=0;
		//不確定循環次數，所以用while
		//結束的地方(指()裡面)不確定，可以先空著				
		while(number!=0) {
			//取得個位數，例如：第一次循環取得4
			int ge=number%10;
			//取完個位數，把number的值去掉個位數，例如：1234/10=123
			number/=10;
			//把取得的數字加到結果的最右邊，例如：第二次循環時，將獲得的3加到本來的數4的最右邊
			upsidedown=upsidedown*10+ge;
			//最後while()裡面要填?在變的是number，而number最後會剩下0(因為個位數/10=0)
		}
		if(upsidedown==copy) {
			System.out.println("true");
		}else {
			System.out.println("false");
		}
	}
	
	@Test //求商和餘數(不用除)
	public void modmodTest() {
		Scanner s=new Scanner(System.in);
		int n1=s.nextInt();
		int n2=s.nextInt();
		int count=0;
		while(n2<=n1) {
			n1-=n2;
			count++;
		}
		System.out.printf("商為%2d餘數為%2d",count,n1);
	}
	
	@Test //跳過7
	public void skipSevenGame() {
		for(int n=1;n<=100;n++) {
			if(n%7==0||n%10==7||n/10%10==7) {
				continue;
			}
			System.out.println(n);
		}
	}
	
	@Test //求平方根
	public void sqrtTest() {
		Scanner s=new Scanner(System.in);
		System.out.println("請輸入一個大於2的整數");
		int x=s.nextInt();
		while(x<=2) {			
			System.out.println("輸入值小於等於2，請重新數入");
			x=s.nextInt();
		}
		int n=1;
		while(n*n<x) {	
			n++;			
		}
		if(n*n==x) {
		System.out.println(n);
		}else {System.out.println(n-1);}
	}
	
	@Test//求質數
	public void dsfkdsfh() {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
//		int t=2;
//		for(;t<n;t++) {
//			if(n%t==0) {
//				System.out.println("不是質數");
//				break;
//			}
//		}
//		if(t==n) {
//			System.out.println("是質數");
//		}
		
		//也可以用boolean存儲兩種結果
		boolean result=true; //先預設為質數
		for(int t=2;t<=Math.sqrt(n);t++) {
			//設為<=n的平方根的理由：簡化運算
			//因為如果n=a*b，a或b必有一個比n的平方根小或相等(如果兩個都大於平方根，相乘必比n大)
			if(n%t==0) {
				result=false;
			}
		}
		if(result=false) {
			System.out.println("不是質數");
		}else {
			System.out.println("是質數");
		}
	}
	

	@Test//猜數字
	public void getNumberGame() {
		Random r=new Random();
		int answer=r.nextInt(1,101); //包頭不包尾
		int upper=100;
		int lower=1;
		int count=1;
		while(true) {
			System.out.printf("%2d~%2d中請猜一個數字",lower,upper);
			Scanner s=new Scanner(System.in);
			int guess=s.nextInt();
			if(guess>upper||guess<lower) {
				System.out.println("數字不在範圍內");
			}else if(guess==answer){
				System.out.println("恭喜猜對，共猜了"+count+"次");
				break;
			}else if(answer>guess) {
				lower=guess;
				count++;
			}else if(answer<guess) {
				upper=guess;
				count++;
			}
		}
	}
	
	@Test
	public void arrayAndList() {
		int[] array=new int[]{65,34,78};
		List<Integer> list=new ArrayList<>();
		list.add(65);
		list.add(34);
		System.out.println(array);
		System.out.println(list);		
	}
	
	@Test
	public void arraysumTest() {
		int[] n=new int[]{1,2,3,4,5};
		int sum=0;
		for(int number:n) {
			sum+=number;
		}
		int y=0;;
		for(int t=0;t<n.length;t++) {
			y+=n[t];
		}
		System.out.println(sum);
		System.out.println(y);
	}
	
	@Test
	public void arrayMod3() {
		int[] arr=new int[] {1,2,3,4,5,6,7,8,9,10};
		int count=0;
		for(int number:arr) {
			if(number%3==0) {
				count++;
			}
		}
		System.out.println(count);
	}
	
	@Test
	public void changeArrayNum() {
		int[] arr1={1,2,3,4,5,6,7,8,9,10};
		for(int n=0;n<arr1.length;n++) {
			if(arr1[n]%2==0) {
				arr1[n]/=2;
			}else {
				arr1[n]*=2;
			}		
		}
		System.out.println(Arrays.toString(arr1));
	}
	
	@Test
	public void thebigestArray() {
		int[] arr1= {33,52,22,44,55};
		Arrays.sort(arr1);
		System.out.println(arr1[arr1.length-1]);
		int max=arr1[0];
		for(int n=1;n<arr1.length;n++) { //n從1開始，減少循環次數
			if(max<arr1[n]) {
				max=arr1[n];
			}
		}
		System.out.println(max);		
	}
	
	@Test
	public void P59Test1() {
		int[] arr1=new int[10];
		int n=0;
		while(n<10) {
			Random r=new Random();
			int s=r.nextInt(1,101);
			if(Arrays.toString(arr1).contains(s+"")==false) {
				arr1[n]=s;
				n++;				
			}
		}
		System.out.println(Arrays.toString(arr1));
		int sum=0;
		for(int item:arr1) {
			sum+=item;
		}
		double avg=(double)sum/arr1.length;
		int count=0;
		for(int item:arr1) {
			if(item<avg) {
					count++;}
		}
		System.out.printf("總合為%3d，平均值為%3f，有%d個數字小於平均值",sum,avg,count);
	}
	
	@Test //交換陣列的數字
	public void P60Test() {
		int[] arr1= {1,2,3,4,5};
		int[] arr2=new int[arr1.length];
		for(int n=0;n<arr1.length;n++) {
			arr2[n]=arr1[arr1.length-n-1];
		}
		System.out.println(Arrays.toString(arr2));
		
		//透過兩個變數
		int[]arr3= {1,2,3,4,5};
		//for迴圈一次多個值的寫法
		for(int i=0,j=arr3.length-1;i<j;i++,j--) {
			int nu=arr3[i];
			arr3[i]=arr3[j];
			arr3[j]=nu;
		}
		System.out.println(Arrays.toString(arr3));		
	}
	
	@Test//隨機打亂陣列資料
	public void randomArrayItem() {
//		int[] arr1=new int[5];
//		int n=0;
//		while(n<5) {		
//			Random r=new Random();
//			int number=r.nextInt(1,6);
//			if(Arrays.toString(arr1).contains(number+"")==false) {
//				arr1[n]=number;
//				n++;
//			}
//		}
//		System.out.println(Arrays.toString(arr1));
		
		//方法2：每個位置的資料都隨機跟別的位置的資料換位置
		int[] arr2= {1,2,3,4,5};
		Random r=new Random(); //放到循環外面比較好
		for(int g=0;g<arr2.length;g++) {
			int d=r.nextInt(arr2.length);
			int temp=arr2[g];
			arr2[g]=arr2[d];
			arr2[d]=temp;
			}
	}
	
	@Test //陣列的內存圖
	public void ArraysAddress() {
		int[] arr1= {1,2,3,4,5};
		int[] arr2=arr1; //把arr1的地址值複製給了arr2，兩者指向堆內存中的同一個小空間
		arr2[0]=33;
		System.out.println(arr1[0]);
	}

	
	
}
