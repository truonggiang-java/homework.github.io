package bt1;

import java.util.Scanner;

public class ptbac2 {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Phuong trinh co dang ax^{2}+bx+c=0 ");
		System.out.println("Nhap a: ");
		float a=Float.parseFloat(sc.nextLine());
		System.out.println("Nhap b: ");
		float b=Float.parseFloat(sc.nextLine());
		System.out.println("Nhap c: ");
		float c=Float.parseFloat(sc.nextLine());
		float delta=(b*b-4*a*c);
		if(delta>0) {
			System.out.println("Phuong trinh co 2 nghiem phan biet: ");
			System.out.printf("Nghiem 1: %.3f", (-b+Math.sqrt(delta))/(2*a));
			System.out.printf("Nghiem 2: %.3f", (-b-Math.sqrt(delta))/(2*a));
		}
		if(delta==0) {
			System.out.printf("Phuong trinh co nghiem kep: %.3f", -b/(2*a));
		}
		if(delta<0) {
			System.out.println("Phuong trinh vo nghiem");
		}
	}
}
