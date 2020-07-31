package bt4;

import java.util.Scanner;

public class songuyento {
		
	   
	    public static void main(String[] args) {
	    	Scanner scanner = new Scanner(System.in);
	        System.out.print("Nhập n = ");
	        int n = Integer.parseInt(scanner.nextLine());
	        System.out.printf("các số nguyên tố nhỏ hơn %d là: ", n);
	        if (n >= 2) {
	            System.out.print(2);
	        }
	        for (int i = 3; i < n; i+=2) {
	            if (isPrimeNumber(i)) {
	                System.out.print(" " + i);
	            }
	        }
	    }
	    public static boolean isPrimeNumber(int n) {
	        
	        if (n < 2) {
	            return false;
	        }
	        for (int i = 2; i <= Math.sqrt(n); i++) {
	            if (n % i == 0) {
	                return false;
	            }
	        }
	        return true;
	    }
	}

