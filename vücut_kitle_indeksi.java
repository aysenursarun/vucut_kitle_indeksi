package vücut_kitle_indeksi;

import java.util.Scanner;

public class vücut_kitle_indeksi {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		double boy, kilo;

		System.out.print("Lütfen boyunuzu (metre cinsinde) giriniz: ");
		boy = scan.nextDouble();

		System.out.print("Lütfen kilonuzu giriniz: ");
		kilo = scan.nextDouble();

		double indeks = kilo / (boy * boy);

		System.out.print("Vücut kitle indeksiniz: " + indeks);

	}

}
