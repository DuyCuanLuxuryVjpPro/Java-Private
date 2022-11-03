package Baitaptuan2;

import java.util.Scanner;

public class Bai1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        int[] mp = new int[1000];
        
        for (int i = 0; i < n; i++){
            a[i] = sc.nextInt();
            mp[a[i]]++;
        }
        
        for (int i = 0; i < 1000; i++)
            if (mp[i] > 0) System.out.println(i + " : " + mp[i]);
    }
}
