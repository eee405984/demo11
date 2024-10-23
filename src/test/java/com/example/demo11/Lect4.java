package com.example.demo11;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;

public class Lect4 {
	@Test
	public void arrayTest() {
		int[] arr = new int[5]; // 宣告長度為5的陣列；小寫的int是資料型態，預設值為0
		Integer[] arr2 = new Integer[7]; // 大寫的Integer是類別，沒有預設值，會是空的(null=裡面沒放東西)
		System.out.println(arr[0]);
		System.out.println(arr2[0]);
		int[] arr3 = { 1, 2, 3, 4, 5, 6, 7 };// 宣告同時賦予值
	}

	@Test
	public void avgWeather() {
		int[] arr = { 1, 3, 5, 7 };
		System.out.println(Arrays.toString(arr)); // 陣列變字串(用Arrays給的方法)：Arrays.toString(陣列名稱)
		double[] weather = { 30.3, 37.3, 35.2, 29.5 };
		System.out.println(this.avgWeather(weather));
	}

	@Test // 一週平均天氣
	public double avgWeather(double[] weatherData) {
		double sum = 0;
		for (int i = 0; i < weatherData.length; i++) {
			sum += weatherData[i];
		}
		double avg = sum / weatherData.length;
		return avg;
	}

	@Test // 分數平均
	public void gradesTest() {
		int[] grade = { 80, 80, 100, 50, 33 };
		this.gradeAvg(grade);
		this.arrayssort(grade);
	}

	public void gradeAvg(int[] gradeData) {
		System.out.println("所得評審分數：" + Arrays.toString(gradeData));
		int small = gradeData[0];
		int big = gradeData[0];
		double sum = 0;
		for (int n = 0; n < gradeData.length; n++) {
			if (small > gradeData[n]) {
				small = gradeData[n];
			}
			if (big < gradeData[n]) {
				big = gradeData[n];
			}
			sum += gradeData[n];
		}
		double avg = (sum - small - big) / (gradeData.length - 2);
		System.out.println("有效分數：" + avg);
	}

	// Arrays.sort()：幫陣列按大小排序好(由小到大)
	public void arrayssort(int[] gradeData) {
		Arrays.sort(gradeData);
		System.out.println(Arrays.toString(gradeData));
		int sum = 0;
		for (int e = 1; e < gradeData.length - 1; e++) {
			sum += gradeData[e];
		}
		double avg = sum / (gradeData.length - 2);
		System.out.println("有效分數：" + avg);
	}

	// List(Java裡面的List和陣列很像)

	@Test // 宣告List (資料型態只能放類別==大寫的!!)
	// List<資料型態> 名稱= new ArrayList<>(); 純粹宣告
	// List<資料型態> 名稱= new ArrayList<>(清單名稱); 宣告同時給值
	// 比較少用：Arrays.asList(資料1,資料2);跟List.of(資料1,資料2); 長度固定，無法增刪
	public void listTest() {
		List<Integer> list1 = Arrays.asList(1, 2);
		List<Integer> list2 = List.of(99, 100);
		System.out.println(list1.get(1)); // 清單名稱.get(n)：取得第n個值
		List<Character> list3 = new ArrayList<>(); // 新增類別ArrayList，記得import；Character是char全名
		List<Integer> list4 = new ArrayList<>(list2);
		System.out.println(list4.get(0));
		// System.out.println(list3.get(0)); 會出錯，因為list3目前長度為0(完全是null)
		// 除了陣列，大部分都是用名稱.來執行

		list3.add('t'); // 增刪：清單名稱.add(值)、清單名稱.remove(編號)
		list4.remove(0); // 把編號0(值:99)拿掉，後面的會往前補
		System.out.println(list4.size()); // 清單名稱.size()：取得清單長度
		System.out.println(list4.get(0));
		List<Double> templist = Arrays.asList(30.0, 26.5, 21.8); // 加入值的另一種方法
		templist.indexOf(30.0); // 清單名稱.indexOf(值)：取得值所在的索引位置(常跟remove一起用)
		templist.indexOf(24.0); // 沒有這個值，會回傳-1
		System.out.println(templist.contains(21.8));// 清單名稱.contains(值)：是否包含該值(是個boolean)
		templist.set(0,24.3);//清單名稱.set(編號,要換進去的資料); 更動List裡面的值
		System.out.println(templist.get(0));
	}

	/*
	 * 為什麼是 new ArrayList ? 因為list是interface()的資料格式，故其沒有任何實作(實際的操作步驟)，無法被創建
	 * ==>類別分成class、interface、Enum，其中interface是拿來定義的類別，裡面完全不能實作
	 * 常被拿來寫各種方法的名稱，以方便管理(再到class去實作：可以用implements在class中檢視有哪些方法尚未被實作)
	 * 有另一個派系，不用interface，喜歡直接實作 如果試圖 new List會導致錯誤 為什麼不使用ArrayList來裝 new
	 * ArrayList的結果 ? (1)因為ArrayList是實作List裡面定義好的方法，故ArrayList可以被視為是List的一種
	 * 故List不會對ArrayList有排斥反應，可以裝進ArrayList ==>只要是實作 interface
	 * 的類別(class)，都可以用interface作為其容器(變數)的資料型態
	 * (2)因為interface可以被多個類別實作，對於interface來說，不同實作都是他的一種
	 * 而對不同實作(class)來說，彼此互不相通，故沒有辦法裝進彼此裡面
	 * 因此採用interface作為容器的資料型態，可以盛裝各式各樣的實作類別(class)
	 */

	@Test // 用List求平均溫，遍歷
	public void avgWeatherList() {
		List<Double> templist = Arrays.asList(30.0, 26.5, 21.8);
		this.avgWeaList(templist);
	}

	public double avgWeaList(List<Double> weatherList) {
		double sum = 0;
		for (int n = 0; n < weatherList.size(); n++) {
			sum += weatherList.get(n);
		}
		System.out.println(sum / weatherList.size());
		
		double summ = 0;
		// 遍歷：for(變數型態 變數名稱：欲遍歷的清單或陣列){//程式主體}
		// item就代表List裡面的每個值=相當於weatherList.get(n)
		// 每一圈item就是代表第n個值
		for (Double item : weatherList) {
			System.out.println(item);
			summ += item; 
			// 遍歷在執行程式前，就會設定好索引值的範圍；因此在運作過程中，不能去修改List的長度(不能增刪)
			// 下面的lambda也有一樣的限制
		}
		System.out.println(summ / weatherList.size());
		return 0.0;
	}

	@Test // lambda寫法
	public void lambdaTest() {
		List<Double> templist = Arrays.asList(30.0, 26.5, 21.8);
		this.lambdaWeaList(templist);
	}

	public void lambdaWeaList(List<Double> weatherList) {
		// lambda寫法：清單名稱.forEach(變數名稱 -> {//程式主體})
		weatherList.forEach(item -> {
			System.out.println(item);
			// sum+=item;錯誤 lambda寫法的限制是不能有區域變數在裡面(不能有sum)，所以不能拿來求總和
			// 區域變數指非整份文件都能用的變數(整個都可以用的例如：pi)
			// 適合使用時機：想要統一調整每個值
			item++;// 每個值都加一(並不會直接放回List裡面)			
			System.out.println(item);
			// lambda寫法也不能去修改List的長度(不能增刪)
		});
		System.out.println(weatherList);
	}

	@Test // 隨機產生一組四位數，且每一個數字都不得相同
	public void randomNumber() {
		System.out.println(this.number());
	}

	public String number() { // 回傳String而非int：因為可能是0開頭
		List<Integer> n = new ArrayList<>();
		while (n.size() < 4) { // 當長度是4的時候，就不要再跑一次
			int y = (int) (Math.random() * (10) + 0);
			if (n.contains(y)) {
				continue;
			} else {
				n.add(y);
			}
		}
		return n.toString();
	}
	
}
