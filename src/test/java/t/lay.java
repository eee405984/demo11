package t;

import static org.mockito.ArgumentMatchers.argThat;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.DisabledIfSystemProperties;
import java.util.Scanner;

public class lay {

	@Test //呼叫方法同時傳入方法的參數資料
	public void tj(){
		lay.hello("r");  //呼叫方法 類別名稱.方法名稱(並傳入該方法的參數內的資料)
	}
	static void hello(String m) { //定義方法hello並另外定義一個方法參數m
		System.out.println(m); //方法的程式區塊
	}
	
	@Test //一個方法內定義多個參數
	public void talking() {
		lay.con("甲","我是甲");
		lay.con("乙","你好");
	}
	static void con(String name,String said) {
		System.out.println(name + ":"+said);
	}
	
	@Test //方法的回傳值
	public void returntest() {
		int po=lay.dd(3,6); //宣告一個變數po來存放呼叫方法dd得到的回傳值
		System.out.println(po);
	}
	static int dd(int na,int nb) {
		return na+nb; //static 回傳值的資料型態 名稱(參數資料型態 名稱){return 想回傳的資料}
	}
}

