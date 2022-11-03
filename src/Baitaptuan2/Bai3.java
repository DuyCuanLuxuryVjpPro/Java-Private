package Baitaptuan2;

import java.util.Scanner;

public class Bai3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n + 1];
        for (int i = 0; i < n; i++)
            a[i] = sc.nextInt();
        a[n] = -1;
        
        int res = 1;
        for (int i = 1, len = 1; i <= n; i++){
            if (a[i] > a[i - 1]) len++;
            else{
                if (res < len) res = len;
                len = 1;
            }
        }
        
        System.out.println(res);
    }
}
