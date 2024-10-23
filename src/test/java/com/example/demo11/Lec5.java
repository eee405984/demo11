package com.example.demo11;

import java.util.Arrays;
import java.util.Scanner;

import org.junit.jupiter.api.Test;
import org.springframework.util.StringUtils;

public class Lec5 {
	@Test
	public void mathTest() {
		int a = Math.max(1, 2); // max比較兩個值哪個比較大，回傳比較大的；min相反
		System.out.println(a);
		int b = Math.min(2, Math.min(3, 98)); // 比較三個值時
		int c = Math.abs(-23); // abs取絕對值(負的變正的)
		int d = (int) Math.round(3.45); // 四捨五入，型態是long
		int e1 = (int) Math.rint(3.5);// rint：四捨六入，=而當小數點是5時，回傳最接近的偶數值(如3.5離4最近)；特別得稅制必較常用
		int e2 = (int) Math.rint(2.5);
		System.out.println(e1);
		System.out.println(e2);
		int f = (int) Math.ceil(2.5);// ceil無條件進位
		int g = (int) Math.floor(2.5);// floor無條件捨棄

		int h1 = (int) Math.sqrt(9); // 取平方根
		int h2 = (int) Math.cbrt(27); // 取次方根
		int i = (int) Math.pow(10, 2);// Math.pow(n,m)：n的m次方，值是double型態
	}

	@Test
	public void StringTest() {
		String st = "1234567";
		// 長度
		int a = st.length();
		System.out.println(a);

		// 判斷內容有無意義(防呆機制常用到)
		String st2 = ""; // 空字串(empty string)：內容為空(也是有記憶體位置)
		String st3 = "    ";// 空白字串：沒有有意義的字
		String st4 = new String();// 有建立一個記憶體位置，預設為空白字串
		String st5 = null; // null指連記憶體位置都沒有
		System.out.println(st2);
		boolean b1 = st2.isEmpty();// isEmpty：判斷字串長度是否為0
		boolean b2 = st3.isEmpty();
		System.out.printf("%d,%b\n", st2.length(), b1); // %b是boolean的佔位符號
		System.out.printf("%d,%b\n", st3.length(), b2);
		boolean b3 = st3.isBlank();// isBlank：empty或是全為space，都會為true
		// isBlank相當於用肉眼來判斷有沒有東西，因此通常會用這個判斷字串（因為空白對我們沒意義）
		// 可以用在避免使用者未輸入
		System.out.printf("st3:%d,isBlank??%b\n", st3.length(), b3);

		// StringUtils.hasLength(變數名稱)：跟isEmpty的結果剛好相反(false才代表是空的，因為是判斷有無長度)
		// 兩者的差別：hasLength才可以判斷是否為null
		boolean b4 = StringUtils.hasLength(st3);
		// 不是直接用變數名稱去呼叫的理由：因為isEmpty是存在String類別裡，而hasLength是在StringUtils裡
		System.out.printf("st3:%d,hasLength??%b\n", st3.length(), b4);
		boolean b5 = StringUtils.hasLength(st5);
		System.out.printf("st5:是null長度印不出來,hasLength??%b\n", b5);
		// StringUtils.hasText(變數名稱)：判斷 null + isBlanck，通常都用這個
		boolean b6 = StringUtils.hasText(st5);
		System.out.printf("st5:是null長度印不出來,hasLength??%b\n", b6);

	}

	@Test // String的搜尋
	public void StringSearchTest() {
		String s1 = "小龍女楊過龍小龍";
		System.out.println(s1.contains("小")); // contains("搜尋內容")：判斷字串中是否存在搜尋內容
		System.out.println(s1.charAt(1));// charAt(索引位置)：回傳在索引位置上的字元(一樣從0開始)
		System.out.println(s1.indexOf("龍"));// indexOf("搜尋內容")：從位置0開始搜尋，回傳第一次出現的位置（叫做"index值"）
		System.out.println(s1.indexOf("欸"));// 搜尋不到會回傳-1，所以可以用在...
		System.out.println(s1.lastIndexOf("龍"));// lastIndexOf("搜尋內容")：與indexOf功能相同，只是從最右邊開始找起
		System.out.println(s1.indexOf("龍", 4));// indexOf("搜尋內容", 起始位置)：從起始位置開始搜尋
	}

	@Test // String的裁減
	public void StringCutTest() {
		String s1 = "小龍女楊過龍小龍";
		// substring(起始位置)：回傳起始位置以後的部分字串
		System.out.println(s1.substring(2));
		System.out.println(s1.substring(2, 5));// substring(起始位置,結束位置)；不包括尾巴(不包括結束位置的值)
		System.out.println(s1);
		s1 = s1.substring(2);// 要裝回結果，才會取代掉原本的值
		// trim()：去除頭和尾的space，但無法去除中間的space
		String s2 = " 小龍女 楊 過龍 小龍 ";
		System.out.println(s2.trim());
		// replace(被換內容, 換成內容)：把某一個字段全部換成另一個；可以用此方法，把所有某個字去除
		String s3 = "小龍女楊過龍小龍";
		System.out.println(s3.replace("龍", "Q"));
		System.out.println(s3.replace("小", "null"));// 要刪掉某個字：可以用null來取代某個字
		// concat(連接內容)：回傳 原字串＋連接內容
		System.out.println(s3.concat(s2));
		System.out.println(s3 + s2);// 就相當於s3+s2
		// replaceAll(正規表達字串, 換成內容)：也是把某一個字段全部換成另一個，差異在replaceAll可以是regex(正規表達字串)
	}

	@Test // String的轉換資料型態
	public void StringChangeTest() {
		String s1 = "小龍女與楊過龍小龍";
		// split(切割點)：回傳以值作為切斷劃分的多個字串片段，因此必須用String Array來儲存(相當於將String轉換成String Array)
		String[] ar1 = s1.split("龍");// 遇到"龍"就切
		System.out.println(Arrays.toString(ar1));
		String[] ar2 = s1.split("");// 用空字串""可以把每個字都各自存起來
		System.out.println(Arrays.toString(ar2));
		// 下面不太常用
		// String.join(連接內容, 字串陣列名稱)：將字串陣列的內容以輸入的連接內容直接加起來，不會有分隔
		System.out.println(String.join("+", ar1)); // 把陣列ar1，用+號連接
		// toCharArray()：將整個字串轉換成char Array(char的陣列是唯一一個可以直接印出來)
		System.out.println(s1.toCharArray());
		System.out.println(Arrays.toString(s1.toCharArray()));// 但要這樣印才是印出陣列的樣子
		// getChars(起點,終點,字元陣列名稱,陣列起點)：可擷取某段字串放入char Array(只有字元陣列才可以用這個方法)
		char[] ch = new char[3];
		s1.getChars(2, 5, s1.toCharArray(), 0);// 將字元陣列從起點到終點(不包括)，放進另一個陣列裡(放進去的起點:陣列起點(0))
		// String.valueOf(非字串的基本資料型態)：將非字串的基本資料型態內容轉成字串
		System.out.println(String.valueOf(90990));
		System.out.println(90990 + ""); // 轉字串更快的方法：直接加上一空字串""
		// Integer.valueOf("字串")與Integer.parseInt("字串")：將整數從String轉成Integer
		Integer t = Integer.valueOf("23");
		int g = Integer.parseInt("23");
	}

	@Test // String的比較內容值(重要!!)
	public void StringvsTest() {
		String a1 = "a";
		String a2 = "a";
		String a3 = new String("a");
		String a4 = "A";
		System.out.println("a1是否==a2:" + (a1 == a2));
		System.out.println("a2是否==a3:" + (a3 == a2));
		// a1的宣告方法會去String Pool找那一個字(所以a1跟a2都是去同一個記憶體位置的a)
		// 用new的方法，就等同創建一個新的記憶體位置(所以a3的記憶體位置跟他們不同)
		// ==是判斷記憶體位置是否相同

		// 所以字串的比較要用：.equals(字串)：才會進去字串裡比較內容是否相等(而不用==)
		System.out.println(a1.equals(a3));
		// equalsIgnoreCase(字串)：將兩個字串都轉換為大寫進行比較，相當於不管大小寫進行比較
		System.out.println(a1.equalsIgnoreCase(a4));
	}

	@Test //計算字串中某字有幾個
	public void ABCDETest() {
		Scanner sc=new Scanner(System.in);
		String line=sc.nextLine();
		this.AABB(line);
	}

	public void AABB(String line) {
		int A = this.count(line,"A");
		int B = this.count(line,"B");;
		int C = this.count(line,"C");;
		int D = this.count(line,"D");;
		System.out.printf("A有%d個,B有%d個,C有%d個,D有%d個\n", A, B, C, D);
		int A1 = this.method2(line,'A');
		System.out.println(A1);

	}
	
	public int count(String line, String target) {
		int t = 0;
		int res = 0;
		while (t < line.length()) {
			if (line.indexOf(target, t) != -1) {
				t = (line.indexOf(target, t) + 1);
				res++;
			} else {
				break;
			}
		}
		return res;
	
	}
//方法2	
	public int method2(String line,char target) {
		char[] tt=line.toCharArray();
		int sum=0;
		for(char temp:tt) {
			if(temp==target) {
			sum++;	
			}
		}
		return sum;	
	}
	
//方法3
	public void method3(String line) {
		int a=0;
		int b=0;
		int c=0;
		int d=0;
		String[] a1=line.split("");
		for(int n=0;n<a1.length;n++) {
			switch(a1[n]) {
			case"A":
				a++;
				break;
			case"B":
				b++;
				break;
			case"C":
				c++;
				break;
			case"D":
				d++;
				break;
			}
		}
		System.out.printf("A有%d個,B有%d個,C有%d個,D有%d個\n",a,b,c,d);	
	}

//方法5
	public void method5(String line) {
		int a=0;
		int i=0;
		while(line.indexOf("A",i)!=-1) {
			a++;
			i=line.indexOf("A",i)+1;
		}
	}
	
//方法6：replace
	public void methd6(String line) {
		String[] targetArr= {"A","B","C","D"};
		int[] countArr=new int[4];
		for(int i=0;i<targetArr.length;i++) {
		int old=line.length(); //這一輪剛開始時的長度
		line=line.replace(targetArr[i], ""); 
		int newest=line.length();
		countArr[i]=old-newest;
		}
	}
	
//方法4
	@Test //計算字串中某字有幾個 遞迴
	public void ABCDTest() {
		Scanner sc=new Scanner(System.in);
		String topic=sc.nextLine();
		int a=findSamChar(topic,"A",0,0);
	}
	public int findSamChar(String topic,String want,int findEnd,int start) {
		if(topic.indexOf(want,start)==-1) {
			return findEnd;
		}
		start=topic.indexOf(want,start+1);
		findEnd++;
		return findSamChar(topic,want,findEnd,start);
	}	
	
//方法5 搭配字元的ASCII表
	public void countAlphabet2(String intput) {		
		// 1. 設定陣列存放26個字母的「個數」
		int[] countArr = new int[26];
		/*	例如countArr[0]是A、[1]是B、[2]是C...索引[25]是Z
		 *	此時陣列中還沒有內容，後面會將「個數」放進陣列中
		 */
	
		// 2. 判斷字串是否為空
		if (intput.isBlank()) {
			System.out.println("輸入的字串為空，請重新輸入");
	
			// 3. 統計個數
		} else {
			for (int i = 0; i < intput.length(); i++) {
				// 3-1. 先將字串每個字轉為字元(char)類型，並轉為大寫，以便一個個判斷
				char letter = Character.toUpperCase(intput.charAt(i));
				// 3-2. 判斷每個字元(char)是否在A-Z的範圍中，不考慮其他值
				if (letter >= 'A' && letter <= 'Z') {
					countArr[letter - 'A']++;
					// 3-3. 若字元為A-Z的其中一個，該陣列(countArr)加一
	
					/* 	假設字元為'C'，那letter的值就是67(參考ASCII表)
					 *	-> 所以 [letter - 'A'] 就會是 67-65 = 2
					 *	-> 此時 countArr[2]++ 就會是 陣列的索引2的值+1
					 *	-> 而索引2其實就是C的位置
					 */
				}
			}
	
			// 4. 判斷完畢後，將陣列中的「個數」印出來
			for (int i = 0; i < 26; i++) { // 4-1. 陣列最多只會有26個索引(A-Z)
				if (countArr[i] > 0) { // 4-2. 判斷countArr是否有「個數」值
					System.out.println((char) (i + 'A') + "有" + countArr[i] + "個");
					
					// 4-3. 分解
					
					/*	(char) (i + 'A') -> 代表字母
					 *	當 i=0 且有「個數」值的話，此時 ( 0 + 65 ) = 65
					 *	前面(char)強轉為字元類型，所以(char)(65)就會是'A'
					 *	
					 *	countArr[i] -> 代表「個數」
					 *	假設個數為 2
					 *
					 *	結果就會是 -> A有2個
					 */
				}
			}
		}
	}

}
