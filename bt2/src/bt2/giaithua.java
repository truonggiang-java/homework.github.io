package bt2;

import java.util.Scanner;

public class giaithua {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("nhap so: ");
		int n=Integer.parseInt(sc.nextLine());
		int g=1;
		for(int i=1;i<=n;i++){
			g*=i;
		}
		System.out.println(g);
	}
}
