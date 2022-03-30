package Bai5;

public class RunMain {
    public static boolean isPrime(int n) {
    	for (int i = 2; i * i <= n; i++) 
    		if (n % i == 0)
    			return false;
    	return n > 1;
    }
    public static boolean isPrime(long n) {
    	for (int i = 2; i * i <= n; i++) 
    		if (n % i == 0)
    			return false;
    	return n > 1;
    }
    public static boolean isPrime(float n) {
        if(n == (int)n) {
            for (int i = 2; i * i <= n; i++) 
                if (n % i == 0) 
                    return false;
            return n > 1;
        }else
            return false;
    }
    public static boolean isPrime(double n) {
    	if(n == (int)n) {
            for (int i = 2; i * i <= n; i++) 
                if (n % i == 0) 
                    return false;
            return n > 1;
        }else
            return false;
    }

    public static void main(String[] args) {
    	System.out.println("*------* int *------*");
    	System.out.println(isPrime(5));
    	System.out.println(isPrime(7));
    	System.out.println("*------* long *------*");
    	System.out.println(isPrime(13l));
    	System.out.println(isPrime(9l));
    	System.out.println("*------* float *------*");
    	System.out.println(isPrime(6.7f));
    	System.out.println(isPrime(7.0f));
    	System.out.println("*------* double *------*");
    	System.out.println(isPrime(7.7));
    	System.out.println(isPrime(7.0));
    }
}