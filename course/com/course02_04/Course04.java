package com.course02_04;

import java.util.Arrays;
import java.util.Scanner;

public class Course04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		// 1
//		int[] a1 = { 1, 2, 3, 1, 0, 3, 4 };
//		Arrays.sort(a1);
//		int a = a1[0];
//		for (int i = 1; i < a1.length; i++) {
//			if (a1[i] == a) {
//				System.out.println("�ظ�");
//				return;
//			} else {
//				a = a1[i];
//			}
//		}
//		System.out.println("���ظ�");

		// 2
		int[] a2 = { 1, 3, 4, 5, 0, 0, 6, 6, 0, 5, 4, 7, 6, 7, 0, 5 };
		int[] a3 = new int[12];
		int m = 0;
		for (int n = 0; n < a2.length; n++) {
			if (a2[n] != 0) {
				a3[m] = a2[n];
				System.out.print(a3[m] + " ");
				m++;
			} else {
				continue;
			}
		}
		System.out.println();

		// 3
		int[] a4 = { 5, 2, 3, 7, 9, 6, 8, 1, 4 };
		int sum = 0;
		Arrays.sort(a4);
		for (int j = 0; j < a4.length; j++) {
			sum += a4[j];
		}
		System.out.println("����������Ԫ�صĺ�Ϊ��" + sum);
		System.out.println("��Сֵ�ǣ�" + a4[0] + " ���ֵ�ǣ�" + a4[a4.length - 1]);

		// 4
		int sum1 = 0;
		int[] a5 = new int[5];
		System.out.println("������5��ѧ���ĳɼ���");
		for (int k = 0; k < 5; k++) {
			@SuppressWarnings("resource")
			Scanner s1 = new Scanner(System.in);
			a5[k] = s1.nextInt();
			sum1 += a5[k];
		}
		System.out.println("�ܳɼ�Ϊ��" + sum1);
		System.out.println("�ɼ���ƽ����Ϊ��" + sum1 / 5);
		Arrays.sort(a5);
		System.out.println("��ͳɼ�Ϊ��" + a5[0]);
		System.out.println("��߳ɼ�Ϊ��" + a5[a5.length - 1]);
	}

}
