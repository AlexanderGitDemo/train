import java.io.Console;
import java.util.Scanner;

import javax.naming.directory.InvalidAttributeIdentifierException;

// import jdk.internal.util.xml.impl.Input;

public class Task1 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		// 1
		// int a = 100;
		// int b = 0;
		// while (b <= 100) {
		// System.out.println(b);
		// b += 1;
		// }
		// --------------------------------------
		// 2
		// int a = 100;
		// int b = 0;
		// while (a >= 0) {
		// System.out.println(a);
		// a -= 1;
		// }
		// --------------------------------------
		// 3
		// int a = input.nextInt();
		// int b = input.nextInt();
		// int c = a + 1;
		// while (c < b) {
		// if (c % 2 == 0) {
		// System.out.print(c + " ");
		// }
		// c = c + 1;
		// }
		// --------------------------------------
		// 4
		// int a = input.nextInt();
		// int b = input.nextInt();
		// int c = a + 1;
		// int d = b - 1;
		// while (c <= d) {
		// if (c % 3 == 0 || c % 7 == 0 && c % 5 != 0) {
		// System.out.println(c);
		// }
		// c += 1;

		// }
		// --------------------------------------
		// 5
		// int n = input.nextInt();
		// double mass[] = new double[n];
		// int index = 0;
		// double nuli = 0;
		// double otric = 0;
		// double poloj = 0;
		// while (n > index) {

		// mass[index] = input.nextDouble();
		// index = index + 1;
		// }

		// index = n - n;
		// while (index < n) {
		// if (mass[index] == 0) {
		// nuli = nuli + 1;
		// }
		// if (mass[index] % 2 == 0 && mass[index] != 0) {
		// poloj = poloj + 1;
		// }
		// if (mass[index] % 2 != 0) {
		// otric = otric + 1;
		// }
		// index = index + 1;

		// }
		// System.out.println("nuli " + nuli);
		// System.out.println("poloj " + poloj);
		// System.out.println("otric " + otric);
		// --------------------------------------
		// 6
		// int n = 3524578;
		// int a = -1;
		// int b = 1;
		// int summ = 0;
		// while (summ < n) {
		// summ = a + b;
		// System.out.println(summ + " ");
		// a = b;
		// b = summ;
		// }
		// --------------------------------------
		// 7
		// int a = input.nextInt();
		// int b = input.nextInt();
		// int summ = 0;
		// if (a < b) {
		// while (a <= b) {
		// if (a % 11 == 0) {
		// System.out.println(a);
		// if (a < 100) {
		// summ = summ + a;
		// }
		// }
		// a = a + 1;
		// }
		// } else {
		// System.out.println("error");
		// }
		// System.out.println(summ);
		// --------------------------------------
		// 8
		// int a = input.nextInt();
		// int b = 0;
		// while (b <= a) {
		// if (b % 2 != 0 && b % 3 != 0 && b % 5 != 0) {
		// System.out.println(b);
		// }
		// b = b + 1;
		// }
		// --------------------------------------
		// 9
		// int a = input.nextInt();
		// int b = input.nextInt();
		// int summ = 0;
		// if (a < b) {
		// while (a < b) {
		// if (a % 2 != 0) {
		// summ = (summ + a * a);
		// }
		// a += 1;
		// }

		// } else {
		// System.out.println("error");
		// }
		// System.out.println(summ);
		// --------------------------------------
		// 10
		// int n = input.nextInt();
		// String[] massive = new String[n];
		// int index = 0;
		// while (n > index) {
		// massive[index] = input.next();
		// index = index + 1;
		// }
		// index = n - n;
		// while (index < n) {
		// System.out.print(" " + massive[index]);
		// index = index + 1;
		// }
		// --------------------------------------
		// 11
		// double x1, x2, a, b, c, D;
		// a = input.nextInt();
		// b = input.nextInt();
		// c = input.nextInt();
		// if (a != 0) {
		// D = b * b - 4 * a * c;

		// if (D > 0) {
		// x1 = (-b + Math.sqrt(D)) / (2 * a);
		// x2 = (-b - Math.sqrt(D)) / (2 * a);
		// System.out.println(x1 + " " + x2);
		// }
		// if (D == 0) {
		// x1 = (-b + Math.sqrt(D)) / (2 * a);
		// System.out.println("odin koren " + x1);
		// }
		// if (D < 0) {
		// System.out.println("cornei net");
		// }

		// } else {
		// System.out.println("ne kvadrat uravnenie");
		// }
		// 12
		// ???
		// --------------------------------------
		// 13
		// int est = input.nextInt();
		// int otrez = est;
		// while (est > 0) {
		// System.out.println("Skolko otrez");
		// otrez = input.nextInt();

		// if (otrez > 1) {
		// est = est - otrez;
		// System.out.println("ostatok " + est);

		// } else {
		// System.out.println("Niz9");
		// }
		// }
		// --------------------------------------
		// 14
		// int n = input.nextInt();
		// double[] massive = new double[n];
		// int index = 0;
		// while (n > index) {
		// massive[index] = input.nextDouble();
		// index = index + 1;
		// }
		// index = n - 1;
		// while (index >= 0) {
		// System.out.println(massive[index]);
		// index = index - 1;
		// }
		// --------------------------------------
		// 15
		// int n = input.nextInt();
		// int mass[] = new int[n];
		// int i = 0;
		// int bolsh;
		// int mensh;
		// while (i < n) {
		// mass[i] = input.nextInt();
		// i += 1;
		// }
		// i = n - n;
		// mensh = mass[0];
		// bolsh = mass[0];
		// while (i < n) {
		// if (mass[i] > bolsh) {
		// bolsh = mass[i];
		// }
		// if (mass[i] < mensh) {

		// mensh = mass[i];
		// }
		// i += 1;
		// }
		// System.out.println("mensh " + mensh);
		// System.out.println("bolsh " + bolsh);
		// --------------------------------------
		// 16
		// int massSize = 100;
		// int[] massive = new int[massSize];
		// int i = 0;
		// int from = 0;
		// int to = 7;
		// int lastNum;
		// while (i < massSize) {
		// lastNum = from;
		// while (lastNum <= to && i < massSize) {
		// massive[i] = lastNum;
		// lastNum = lastNum + 1;
		// i += 1;
		// }
		// }
		// i = 0;
		// while (i < massSize) {
		// System.out.println(massive[i]);
		// i += 1;
		// }
		// --------------------------------------
		// 17
		// int n = input.nextInt();
		// int[] first = new int[n];
		// int[] second = new int[n];
		// int i = 0;
		// int iChet = 0;
		// int iNeChet = 0;
		// while (i < n) {
		// int value = input.nextInt();
		// if (value % 2 == 0) {
		// first[iChet] = value;
		// iChet += 1;
		// } else {
		// second[iNeChet] = value;
		// iNeChet += 1;
		// }
		// i += 1;
		// }
		// i = 0;
		// while (i < n) {
		// System.out.print(" Chet " + first[i]);
		// i += 1;
		// }
		// i = 0;
		// System.out.println();
		// while (i < n) {
		// System.out.print(" NeChet " + second[i]);
		// i += 1;
		// }
		// --------------------------------------
		// 19
		// int kol = input.nextInt();
		// int[] mass = new int[kol];
		// int i = 0;
		// int summ = 0;
		// while (i < kol) {
		// mass[i] = input.nextInt();
		// summ = summ + mass[i];
		// i += 1;
		// }
		// summ = summ / kol;
		// System.out.println(summ);
		// --------------------------------------
		//18
		// int kol = input.nextInt();
		// int[] mass = new int[kol];
		// int i = 0;
		// int summ = 0;
		// int ostatok;
		// String pust = "pust";
		// while (i < kol) {
		// mass[i] = input.nextInt();
		// summ = summ + mass[i];

		// i += 1;
		// }
		// i = i - i;
		// int max = 0;
		// int initialInt = -1;
		// int min = initialInt;
		// while (i < kol) {
		// if (mass[i] > max) {
		// max = mass[i];
		// }
		// if (mass[i] % 6 == 0 && (min > mass[i] || min == initialInt)) {
		// min = mass[i];
		// } else {

		// }
		// i += 1;
		// }
		// summ = summ % i;

		// if (mass.length <= 1) {
		// System.out.println("net 2 i predposl");
		// } else {
		// System.out.println("2 znach " + mass[1]);
		// System.out.println("pred posl " + (mass[mass.length - 2]));
		// }
		// if (mass.length < summ) {
		// System.out.println("elementa net");
		// } else {
		// System.out.println(" elem po ostatku " + mass[summ]);
		// }
		// System.out.println("max " + max);
		// if (min != initialInt) {
		// System.out.println("Min (kratn 6):" + min);
		// } else {
		// System.out.println("V posledovatelnosti net chisel kotorue kranu 6");
		// }
		// --------------------------------------
		
	}
}
