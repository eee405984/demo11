package t;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

import org.junit.jupiter.api.Test;
import org.springframework.util.StringUtils;

public class OoTest {
// �������O(public class)�@java�{���u���@�ӡA�����M�{���ɮצW�٤@��

	@Test // ���P����ƫ��A
	public void llTest() {
		System.out.println(2000000000000L);
		// ��������ơA�{���w�]�����A�Oint�A�p�G�n���W�L20�������=����ơA�n�b�Ʀr�᭱�[L
		System.out.println(3.14159268);
		// �B�I�ơA�{���w�]�����A�Odouble(����ׯB�I�ơA��p��U15���)�A�p�G�n�����ׯB�I�ơA�n�b�Ʀr�᭱�[f
		System.out.println("kuha");
		System.out.println('a');
	}

	@Test // �ϥ��ܼ�(�B�J�G�ŧi�ܼ�_���w���_�ϥθ��)
	public void ooTest() {
		int x; // �ŧi�ܼƻy�k�i��ƫ��A �ܼƦW�١F�j�ŧi�@�Ӿ���ܼ�x�Ax���̭��N�u�����int���A�����
		x = 3; // ���w��Ƨ@�k1
		System.out.println(x);
		x = 40; // ����ܼ�x�̭��˪���ƥi�H�ܤ�(�b�᭱����Ʒ|�л\���e�����)
				// �`�N���~�g�kint x=3; int x=40;(�Ĥ@�ӷN���۾���ܼ�x�w�g�Q�ŧi�F)
		System.out.println(x);
		float n = 3.7489324732894F; // ���w��Ƨ@�k2(�P�ɫŧi�ܼƨë��w���) & �Ӧh��ƫ�[f�~�O�ŦXn����ƫ��A�A�~�i�H��in�̭�
		System.out.println(n);
		int h, j, k, l; // �i�H�@���ŧi�h���ܼơA�ܼƶ���,�j�}
	}

	@Test // �ƭȸ�ƫ��A������
	// �Ʀr���A�j�p�ƧǡG
	public void numchtest() {
		int n1 = 3;
		double n2 = n1;
		System.out.println(n2);// �d��p�ܤj�G�����ഫ�ܦ�3.0
		System.out.println(n1);// n1�٦b

		double n3;// �d��j�ܤp�A���[�W(��ƫ��A)���j���ഫ�A���Ʀr�i�ॢ�u
		n3 = 3.54;
		int n4 = (int) n3;// ��n3�@�j���ഫ��int�A�M��s���n4
		System.out.println(n4);
		System.out.println(n3);
		n3 = 24.55;
		System.out.println(n4); // n3�̩񪺪F���ܤF�An4�٨S��
		n4 = (int) n3;
		System.out.println(n4);// �A�۵��@���An4�̩񪺤~�|��
	}

	@Test // �r��P�Ʀr�����ഫ
	public void Stringchtest() {
		int q1 = Integer.parseInt("675");// �r���ഫ���Ʀr�GInteger.parseInt()
		System.out.println(q1);
		String q2 = "9.1";
		double q3 = Double.parseDouble(q2);
		System.out.println(q3);

		String q4;
		q4 = String.valueOf(23); // �Ʀr�ഫ���r��String.valueOf()
		System.out.println(q4);
		float q5 = 5.243F;
		q4 = String.valueOf(q5);
		System.out.println(q4);
	}

	@Test // ��N�B��
	public void plutest() {
		System.out.println(5 * 2);
		System.out.println(5 / 2);// ��ư��k(���䧡�����)�A�|�߱�p��
		double z;
		z = (double) (5 / 2);
		System.out.println(z); // ������ư��k5/2�A�A�N����2�j���ഫ��double�A�A��iz
		z = (double) 5 / 2; // ���N5�j���ഫ��double�A�A���B�I�ư��k5.0/2�A�A��iz
		System.out.println(z);
		System.out.println((int) (5 % 1.5)); // %=mod=���l��
	}

	@Test // ���w�B��(�ΨӱN��ƫ��w���ܼ�=�N��Ʀs��i�ܼƸ̭�)
	public void htset() {
		int x = 3;// ��3���w��ix��
		x = x + 1; // ��x���X��+1�A�A��^X��
		System.out.println(x);
		int y = 3;
		y += 1; // ��y���X��+1�A�A��^y��(�۷��x=x+1)
		y *= 2; // ��y���X��*2�A�A��^y��
		System.out.println(y);
	}

	@Test
	public void ytest() {
		boolean B;
		B = 5 <= 2;// ����B��
		System.out.println(B);
		B = 5 != 2;
		System.out.println(B);
		B = "ftyfsdadiasdui" == "shfk"; // �]�i�H�����r��O�_�۵�
		System.out.println(B);

		int u = 4;// �椸�B��
		u++;
		System.out.println(u);
		boolean y = !true;
		System.out.println(y);

		// �޿�B��
		boolean b = true && false;
		boolean bb = true || false;
		System.out.println(b);
		System.out.println(bb);
	}

	@Test
	public void hwiu() {
		System.out.println("name\tage");
	}

	// �p��r�X�{�X��
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
		System.out.println("�п�J�T��ƪ����");
		Scanner s = new Scanner(System.in);
		int number = s.nextInt();
		int hun = number / 100;
		int ten = number / 10 % 10;
		int one = number % 10;
		System.out.printf("�Ӧ�Ƭ�%d�Q��Ƭ�%d�ʦ�Ƭ�%d", hun, ten, one);
	}

	@Test // P36 11min
	public void number6() {
		Scanner s = new Scanner(System.in);
		System.out.println("�п�J�Ĥ@�Ӿ��");
		int n1 = s.nextInt();
		System.out.println("�п�J�ĤG�Ӿ��");
		int n2 = s.nextInt();
		boolean resault = n1 == 6 || n2 == 6 || (n1 + n2) % 6 == 0;
		System.out.println(resault);
	}

	@Test // �T����F��
	public void ternaryOperatorTest() {
		// �D��ӼƬO�_�۵�
		Scanner s = new Scanner(System.in);
		System.out.println("�п�J�Ĥ@�Ӽ�");
		double n1 = s.nextDouble();
		System.out.println("�п�J�ĤG�Ӽ�");
		double n2 = s.nextDouble();
		System.out.println(n1 == n2 ? "�ۦP" : "���ۦP");

		// �D�T�̤��̤j
		int a = 2;
		int b = 5;
		int c = 231;
		System.out.println((a > b ? a : b) > c ? (a > b ? a : b) : c);
	}

	@Test //
	public void noodleTest() {
		Scanner s = new Scanner(System.in);
		System.out.println("���ѷQ�Y������");
		String want = s.nextLine();
		if (StringUtils.hasText(want)) {
			if (want == "���{����" || want == "�Z�~������" || want == "�_�ʬ�����") {
				System.out.println("���ߦY" + s);
			} else {
				System.out.println("���ߦY�w��");
			}
		} else {
			System.out.println("�ֻ���");
		}

	}

	@Test
	public void whatSportToday() {
		Scanner s = new Scanner(System.in);
		System.out.println("���ѬP���X?");
		String day = s.nextLine();
		switch (day) {
		case "�@":
			System.out.println("�]�B");
			break;
		case "�G":
			System.out.println("��a");
			break;
		case "�T":
			System.out.println("�C��");
			break;
		case "�|":
			System.out.println("�]�B");
			break;
		case "��":
			System.out.println("�]�B");
			break;
		case "��":
			System.out.println("�]�B");
			break;
		case "��":
			System.out.println("�]�B");
			break;
		default:
			System.out.println("�S���o�ӬP��");
		}
	}

	@Test // �D1~100�Ҧ������ƩM
	public void uidhiuwf() {
		int sum = 0;
		for (int n = 1; n < 101; n++) {
			if (n % 2 == 0) {
				sum += n;
			}
		}
	}

	@Test // ��J��ӼƦr�A�D��ӼƦr���i�Q3�㰣�S�i�Q5�㰣���Ʀr���X��
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
		System.out.println(count + "��");
	}

	@Test // �P�_�O�_���^���(P48)
	public void palindromeTest() {
		Scanner s = new Scanner(System.in);
		int number= s.nextInt();//�Ҧp�G1234	
		int copy=number;
		//�n��o�@�ӤϹL�Ӫ���
		int upsidedown=0;
		//���T�w�`�����ơA�ҥH��while
		//�������a��(��()�̭�)���T�w�A�i�H���ŵ�				
		while(number!=0) {
			//���o�Ӧ�ơA�Ҧp�G�Ĥ@���`�����o4
			int ge=number%10;
			//�����Ӧ�ơA��number���ȥh���Ӧ�ơA�Ҧp�G1234/10=123
			number/=10;
			//����o���Ʀr�[�쵲�G���̥k��A�Ҧp�G�ĤG���`���ɡA�N��o��3�[�쥻�Ӫ���4���̥k��
			upsidedown=upsidedown*10+ge;
			//�̫�while()�̭��n��?�b�ܪ��Onumber�A��number�̫�|�ѤU0(�]���Ӧ��/10=0)
		}
		if(upsidedown==copy) {
			System.out.println("true");
		}else {
			System.out.println("false");
		}
	}
	
	@Test //�D�өM�l��(���ΰ�)
	public void modmodTest() {
		Scanner s=new Scanner(System.in);
		int n1=s.nextInt();
		int n2=s.nextInt();
		int count=0;
		while(n2<=n1) {
			n1-=n2;
			count++;
		}
		System.out.printf("�Ӭ�%2d�l�Ƭ�%2d",count,n1);
	}
	
	@Test //���L7
	public void skipSevenGame() {
		for(int n=1;n<=100;n++) {
			if(n%7==0||n%10==7||n/10%10==7) {
				continue;
			}
			System.out.println(n);
		}
	}
	
	@Test //�D�����
	public void sqrtTest() {
		Scanner s=new Scanner(System.in);
		System.out.println("�п�J�@�Ӥj��2�����");
		int x=s.nextInt();
		while(x<=2) {			
			System.out.println("��J�Ȥp�󵥩�2�A�Э��s�ƤJ");
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
	
	@Test//�D���
	public void dsfkdsfh() {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
//		int t=2;
//		for(;t<n;t++) {
//			if(n%t==0) {
//				System.out.println("���O���");
//				break;
//			}
//		}
//		if(t==n) {
//			System.out.println("�O���");
//		}
		
		//�]�i�H��boolean�s�x��ص��G
		boolean result=true; //���w�]�����
		for(int t=2;t<=Math.sqrt(n);t++) {
			//�]��<=n������ڪ��z�ѡG²�ƹB��
			//�]���p�Gn=a*b�Aa��b�����@�Ӥ�n������ڤp�ά۵�(�p�G��ӳ��j�󥭤�ڡA�ۭ�����n�j)
			if(n%t==0) {
				result=false;
			}
		}
		if(result=false) {
			System.out.println("���O���");
		}else {
			System.out.println("�O���");
		}
	}
	

	@Test//�q�Ʀr
	public void getNumberGame() {
		Random r=new Random();
		int answer=r.nextInt(1,101); //�]�Y���]��
		int upper=100;
		int lower=1;
		int count=1;
		while(true) {
			System.out.printf("%2d~%2d���вq�@�ӼƦr",lower,upper);
			Scanner s=new Scanner(System.in);
			int guess=s.nextInt();
			if(guess>upper||guess<lower) {
				System.out.println("�Ʀr���b�d��");
			}else if(guess==answer){
				System.out.println("���߲q��A�@�q�F"+count+"��");
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
		for(int n=1;n<arr1.length;n++) { //n�q1�}�l�A��ִ`������
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
		System.out.printf("�`�X��%3d�A�����Ȭ�%3f�A��%d�ӼƦr�p�󥭧���",sum,avg,count);
	}
	
	@Test //�洫�}�C���Ʀr
	public void P60Test() {
		int[] arr1= {1,2,3,4,5};
		int[] arr2=new int[arr1.length];
		for(int n=0;n<arr1.length;n++) {
			arr2[n]=arr1[arr1.length-n-1];
		}
		System.out.println(Arrays.toString(arr2));
		
		//�z�L����ܼ�
		int[]arr3= {1,2,3,4,5};
		//for�j��@���h�ӭȪ��g�k
		for(int i=0,j=arr3.length-1;i<j;i++,j--) {
			int nu=arr3[i];
			arr3[i]=arr3[j];
			arr3[j]=nu;
		}
		System.out.println(Arrays.toString(arr3));		
	}
	
	@Test//�H�����ð}�C���
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
		
		//��k2�G�C�Ӧ�m����Ƴ��H����O����m����ƴ���m
		int[] arr2= {1,2,3,4,5};
		Random r=new Random(); //���`���~������n
		for(int g=0;g<arr2.length;g++) {
			int d=r.nextInt(arr2.length);
			int temp=arr2[g];
			arr2[g]=arr2[d];
			arr2[d]=temp;
			}
	}
	
	@Test //�}�C�����s��
	public void ArraysAddress() {
		int[] arr1= {1,2,3,4,5};
		int[] arr2=arr1; //��arr1���a�}�Ƚƻs���Farr2�A��̫��V�鷺�s�����P�@�Ӥp�Ŷ�
		arr2[0]=33;
		System.out.println(arr1[0]);
	}

	
	
}
