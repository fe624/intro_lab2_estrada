import java.util.Scanner;

public class fibonaccilab {
    public static int fibonacci(int n) {
        if (n < 0) {
            return -1;
    }
    int a = 0;
    int b = 1;
    int c = 0;
    
    if (n == 0) {
        return a;
    } 
    else if (n == 1) {
        return b;
    }

    for (int i = 2; i <= n; i++) {
        c = a + b;
        a = b;
        b = c;
    }
    return c;
}
public static void main(String[] args) {
    Scanner scnr = new Scanner(System.in);
    int startNum;
    startNum = scnr.nextInt();
    System.out.println("fibonacci(" + startNum + ") is " + fibonacci(startNum));
   }
}