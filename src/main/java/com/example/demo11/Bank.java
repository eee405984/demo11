package com.example.demo11;

public class Bank {
	// �ŧi�ݩ�
	private String branch = "TTA ����"; // ����W��
	// �ᤩbranch�s���w�]�ȡA�Ӥ��O�{���������w�]��null

	private String user;// �Τ�W��

	private int balance;// �l�B

	//�w�]�غc��k�G��k���s���v�� ���O�W��(){}
	//                 public      Bank
	//�w�]�غc��k-->�N�O�S���Ѽƪ��غc��k
	//�����O���S���إ߱a���Ѽƪ��غc��k�ɡA�S���Ѽƪ��غc��k�N�O�w�]�غc��k�A��ٲ����g�]�i�H�ϥ�
	//���O�����إ߱a���Ѽƪ��غc��k�ɡA�S���Ѽƪ��غc��k�N���A�O�w�]�غc��k�A�S�g�N����ϥ�
	public Bank() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	//�a���Ѽƪ��غc��k�A��@���e���P�� setXXX��k(���]�w�ܼƪ�l��)�A��ڧ@�Φb���ֵ{���X�����
	public Bank(String branch, String user, int balance) {
		super();
		this.branch = branch;
		this.user = user;
		this.balance = balance;
	}



	// �إ��ݩʪ��s(get)��(set)��k
	//�@���k�G��k���s���v�� �^�ǭȸ�ƫ��A ��k�W��(�ѼƸ�ƫ��A �Ѽ��ܼƦW��){��k����@���e};
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

	// ��k�G�s��
	public void deposit(int amount) {
		System.out.println("�s�ګe�l�B�G" + balance);
		// �P�_amount�O�_������
		if (amount < 0) {
			System.out.println("�s�ڪ��B���ର�t�ơA�s�ڥ���");
			System.out.println("�l�B�G" + balance);
			return;
		}
		balance += amount;
		System.out.println("�s�ګ�l�B�G" + balance);
	}

	// ��k�G����
	public void withdraw(int amount) {
		System.out.println("���ګe�l�B�G" + balance);
		// �ư�amount���t��
		if (amount <= 0) {
			System.out.println("���ڪ��B�������ơA���ڥ���");
			System.out.println("�l�B�G" + balance);
			return;
		}
		// �ư��l�B����
		if (amount > balance) {
			System.out.println("�l�B�����A���ڥ���");
			System.out.println("�l�B�G" + balance);
			return;
		}
		balance -= amount;
		System.out.println("���ګ�l�B�G" + balance);
	}

	// �ΰѬ����O�����p
	public void bankAddress(Bank bank) {
		System.out.println(bank.getBalance());
		System.out.println(bank.getUser());
	}

	// �^�ǫ��A�����O�����p
	public Bank bankReurnAddress() {
		return new Bank();
	}

	// �i�ܰѼ�
	public void changedparameter111(String tilte, String branch, String user) {
	}
	public void changedparameter2(String... aaa) {
		String tilte = aaa[0];
		String branch = aaa[1];
		String user = aaa[2];
	}
	
	//static����r�A�R�A��k
	public static void staticMethod() {
		System.out.println("123");
	}

}
