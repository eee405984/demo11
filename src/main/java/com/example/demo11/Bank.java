package com.example.demo11;

public class Bank {
	// 宣告屬性
	private String branch = "TTA 分行"; // 分行名稱
	// 賦予branch新的預設值，而不是程式本身的預設值null

	private String user;// 用戶名稱

	private int balance;// 餘額

	//預設建構方法：方法的存取權限 類別名稱(){}
	//                 public      Bank
	//預設建構方法-->就是沒有參數的建構方法
	//當類別中沒有建立帶有參數的建構方法時，沒有參數的建構方法就是預設建構方法，其省略不寫也可以使用
	//類別中有建立帶有參數的建構方法時，沒有參數的建構方法就不再是預設建構方法，沒寫就不能使用
	public Bank() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	//帶有參數的建構方法，實作內容等同於 setXXX方法(有設定變數初始值)，實際作用在於減少程式碼的行數
	public Bank(String branch, String user, int balance) {
		super();
		this.branch = branch;
		this.user = user;
		this.balance = balance;
	}



	// 建立屬性的存(get)取(set)方法
	//一般方法：方法的存取權限 回傳值資料型態 方法名稱(參數資料型態 參數變數名稱){方法的實作內容};
	//            public         String    getBranch
	public String getBranch() {
		return branch;
	}

	public void setBranch(String branch) {
		this.branch = branch;
	}

	public String getUser() {
		return user;
	}

	public void setUser(String user) {
		this.user = user;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}

	// 方法：存款
	public void deposit(int amount) {
		System.out.println("存款前餘額：" + balance);
		// 判斷amount是否為正數
		if (amount < 0) {
			System.out.println("存款金額不能為負數，存款失敗");
			System.out.println("餘額：" + balance);
			return;
		}
		balance += amount;
		System.out.println("存款後餘額：" + balance);
	}

	// 方法：提款
	public void withdraw(int amount) {
		System.out.println("提款前餘額：" + balance);
		// 排除amount為負數
		if (amount <= 0) {
			System.out.println("提款金額須為正數，提款失敗");
			System.out.println("餘額：" + balance);
			return;
		}
		// 排除餘額不夠
		if (amount > balance) {
			System.out.println("餘額不足，提款失敗");
			System.out.println("餘額：" + balance);
			return;
		}
		balance -= amount;
		System.out.println("提款後餘額：" + balance);
	}

	// 形參為類別的情況
	public void bankAddress(Bank bank) {
		System.out.println(bank.getBalance());
		System.out.println(bank.getUser());
	}

	// 回傳型態為類別的情況
	public Bank bankReurnAddress() {
		return new Bank();
	}

	// 可變參數
	public void changedparameter111(String tilte, String branch, String user) {
	}
	public void changedparameter2(String... aaa) {
		String tilte = aaa[0];
		String branch = aaa[1];
		String user = aaa[2];
	}
	
	//static關鍵字，靜態方法
	public static void staticMethod() {
		System.out.println("123");
	}

}
