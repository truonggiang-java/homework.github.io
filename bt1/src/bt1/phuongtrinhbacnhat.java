package bt1;

import java.util.Scanner;

public class phuongtrinhbacnhat {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Nhap so a");
		float a=Float.parseFloat(sc.nextLine());
		System.out.println("Nhap so b");
		float b=Float.parseFloat(sc.nextLine());
		float result=-b/a;
		System.out.println("Ket qua phuong trinh bac 1 la: " +result);
	}
}
