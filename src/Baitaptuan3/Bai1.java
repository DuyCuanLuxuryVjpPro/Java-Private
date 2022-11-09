package Baitaptuan3;

import java.util.Scanner;

public class Bai1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        
        System.out.println(s);
        s = s.toLowerCase();
        
        int[] mp = new int[256];
        for (int i = 0; i < s.length(); i++)
            mp[(int)s.charAt(i)]++;
        
        for (int i = 'a'; i <= 'z'; i++)
            if (mp[i] > 0) System.out.println((char)i + " : " + mp[i]);
    }
}
