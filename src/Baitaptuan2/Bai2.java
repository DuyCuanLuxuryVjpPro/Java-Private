package Baitaptuan2;

import java.util.Scanner;
import java.util.Arrays;

public class Bai2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        int[] a = new int[n];
        int[] mp = new int[1000];
        
        for (int i = 0; i < n; i++){
            a[i] = sc.nextInt();
            mp[a[i]]++;
        }
        Arrays.sort(a);
        boolean check = false;
        for (int i = 1; i < a[n - 1]; i++)
            if (mp[i] == 0){
                System.out.print(i + " ");
                check = true;
            }
        
        if (!check) System.out.println("YES");
    }
}
