package com.example.demo11;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;

public class Lect4 {
	@Test
	public void arrayTest() {
		int[] arr = new int[5]; // �ŧi���׬�5���}�C�F�p�g��int�O��ƫ��A�A�w�]�Ȭ�0
		Integer[] arr2 = new Integer[7]; // �j�g��Integer�O���O�A�S���w�]�ȡA�|�O�Ū�(null=�̭��S��F��)
		System.out.println(arr[0]);
		System.out.println(arr2[0]);
		int[] arr3 = { 1, 2, 3, 4, 5, 6, 7 };// �ŧi�P�ɽᤩ��
	}

	@Test
	public void avgWeather() {
		int[] arr = { 1, 3, 5, 7 };
		System.out.println(Arrays.toString(arr)); // �}�C�ܦr��(��Arrays������k)�GArrays.toString(�}�C�W��)
		double[] weather = { 30.3, 37.3, 35.2, 29.5 };
		System.out.println(this.avgWeather(weather));
	}

	@Test // �@�g�����Ѯ�
	public double avgWeather(double[] weatherData) {
		double sum = 0;
		for (int i = 0; i < weatherData.length; i++) {
			sum += weatherData[i];
		}
		double avg = sum / weatherData.length;
		return avg;
	}

	@Test // ���ƥ���
	public void gradesTest() {
		int[] grade = { 80, 80, 100, 50, 33 };
		this.gradeAvg(grade);
		this.arrayssort(grade);
	}

	public void gradeAvg(int[] gradeData) {
		System.out.println("�ұo���f���ơG" + Arrays.toString(gradeData));
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
		System.out.println("���Ĥ��ơG" + avg);
	}

	// Arrays.sort()�G���}�C���j�p�ƧǦn(�Ѥp��j)
	public void arrayssort(int[] gradeData) {
		Arrays.sort(gradeData);
		System.out.println(Arrays.toString(gradeData));
		int sum = 0;
		for (int e = 1; e < gradeData.length - 1; e++) {
			sum += gradeData[e];
		}
		double avg = sum / (gradeData.length - 2);
		System.out.println("���Ĥ��ơG" + avg);
	}

	// List(Java�̭���List�M�}�C�ܹ�)

	@Test // �ŧiList (��ƫ��A�u������O==�j�g��!!)
	// List<��ƫ��A> �W��= new ArrayList<>(); �º�ŧi
	// List<��ƫ��A> �W��= new ArrayList<>(�M��W��); �ŧi�P�ɵ���
	// ����֥ΡGArrays.asList(���1,���2);��List.of(���1,���2); ���שT�w�A�L�k�W�R
	public void listTest() {
		List<Integer> list1 = Arrays.asList(1, 2);
		List<Integer> list2 = List.of(99, 100);
		System.out.println(list1.get(1)); // �M��W��.get(n)�G���o��n�ӭ�
		List<Character> list3 = new ArrayList<>(); // �s�W���OArrayList�A�O�oimport�FCharacter�Ochar���W
		List<Integer> list4 = new ArrayList<>(list2);
		System.out.println(list4.get(0));
		// System.out.println(list3.get(0)); �|�X���A�]��list3�ثe���׬�0(�����Onull)
		// ���F�}�C�A�j�������O�ΦW��.�Ӱ���

		list3.add('t'); // �W�R�G�M��W��.add(��)�B�M��W��.remove(�s��)
		list4.remove(0); // ��s��0(��:99)�����A�᭱���|���e��
		System.out.println(list4.size()); // �M��W��.size()�G���o�M�����
		System.out.println(list4.get(0));
		List<Double> templist = Arrays.asList(30.0, 26.5, 21.8); // �[�J�Ȫ��t�@�ؤ�k
		templist.indexOf(30.0); // �M��W��.indexOf(��)�G���o�ȩҦb�����ަ�m(�`��remove�@�_��)
		templist.indexOf(24.0); // �S���o�ӭȡA�|�^��-1
		System.out.println(templist.contains(21.8));// �M��W��.contains(��)�G�O�_�]�t�ӭ�(�O��boolean)
		templist.set(0,24.3);//�M��W��.set(�s��,�n���i�h�����); ���List�̭�����
		System.out.println(templist.get(0));
	}

	/*
	 * ������O new ArrayList ? �]��list�Ointerface()����Ʈ榡�A�G��S�������@(��ڪ��ާ@�B�J)�A�L�k�Q�Ы�
	 * ==>���O����class�Binterface�BEnum�A�䤤interface�O���өw�q�����O�A�̭����������@
	 * �`�Q���Ӽg�U�ؤ�k���W�١A�H��K�޲z(�A��class�h��@�G�i�H��implements�bclass���˵������Ǥ�k�|���Q��@)
	 * ���t�@�Ӭ��t�A����interface�A���w������@ �p�G�չ� new List�|�ɭP���~ �����򤣨ϥ�ArrayList�Ӹ� new
	 * ArrayList�����G ? (1)�]��ArrayList�O��@List�̭��w�q�n����k�A�GArrayList�i�H�Q�����OList���@��
	 * �GList���|��ArrayList���ƥ������A�i�H�˶iArrayList ==>�u�n�O��@ interface
	 * �����O(class)�A���i�H��interface�@����e��(�ܼ�)����ƫ��A
	 * (2)�]��interface�i�H�Q�h�����O��@�A���interface�ӻ��A���P��@���O�L���@��
	 * �ӹ藍�P��@(class)�ӻ��A���������۳q�A�G�S����k�˶i�����̭�
	 * �]���ĥ�interface�@���e������ƫ��A�A�i�H���˦U���U�˪���@���O(class)
	 */

	@Test // ��List�D�����šA�M��
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
		// �M���Gfor(�ܼƫ��A �ܼƦW�١G���M�����M��ΰ}�C){//�{���D��}
		// item�N�N��List�̭����C�ӭ�=�۷��weatherList.get(n)
		// �C�@��item�N�O�N���n�ӭ�
		for (Double item : weatherList) {
			System.out.println(item);
			summ += item; 
			// �M���b����{���e�A�N�|�]�w�n���ޭȪ��d��F�]���b�B�@�L�{���A����h�ק�List������(����W�R)
			// �U����lambda�]���@�˪�����
		}
		System.out.println(summ / weatherList.size());
		return 0.0;
	}

	@Test // lambda�g�k
	public void lambdaTest() {
		List<Double> templist = Arrays.asList(30.0, 26.5, 21.8);
		this.lambdaWeaList(templist);
	}

	public void lambdaWeaList(List<Double> weatherList) {
		// lambda�g�k�G�M��W��.forEach(�ܼƦW�� -> {//�{���D��})
		weatherList.forEach(item -> {
			System.out.println(item);
			// sum+=item;���~ lambda�g�k������O���঳�ϰ��ܼƦb�̭�(���঳sum)�A�ҥH���ள�ӨD�`�M
			// �ϰ��ܼƫ��D�����󳣯�Ϊ��ܼ�(��ӳ��i�H�Ϊ��Ҧp�Gpi)
			// �A�X�ϥήɾ��G�Q�n�Τ@�վ�C�ӭ�
			item++;// �C�ӭȳ��[�@(�ä��|������^List�̭�)			
			System.out.println(item);
			// lambda�g�k�]����h�ק�List������(����W�R)
		});
		System.out.println(weatherList);
	}

	@Test // �H�����ͤ@�ե|��ơA�B�C�@�ӼƦr�����o�ۦP
	public void randomNumber() {
		System.out.println(this.number());
	}

	public String number() { // �^��String�ӫDint�G�]���i��O0�}�Y
		List<Integer> n = new ArrayList<>();
		while (n.size() < 4) { // ����׬O4���ɭԡA�N���n�A�]�@��
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
