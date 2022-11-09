package Baitaptuan1;

import java.util.Scanner;

public class Bai4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = 0;
        do{
            n = sc.nextInt();
        }
        while(n <= 0);
        
        while(n > 0){
            int x = n % 10;
            if (x == 1 || x == 4 || x == 9)
                System.out.print(x + " ");
            n /= 10;
        }
    }
}
