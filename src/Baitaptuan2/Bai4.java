package Baitaptuan2;

import java.util.Scanner;

public class Bai4 {
    public static boolean isSuperPrime(int x){
        for (int i = 2; i*i <= x; i++)
            if (x % i == 0) return false;
        
        while(x > 0){
            int tmp = x % 10;
            if (tmp != 2 && tmp != 3 && tmp != 5 && tmp != 7)
                return false;
            x /= 10;
        }
        return true;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++)
            a[i] = sc.nextInt();
        
        boolean check = false;
        for (int i = 0; i < n; i++)
            if (isSuperPrime(a[i])){
                System.out.print(a[i] + " ");
                check = true;
            }
        
        if (!check) System.out.println("NO");
    }
}
