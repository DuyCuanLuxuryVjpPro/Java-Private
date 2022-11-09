package Baitaptuan3;

import java.util.Scanner;

public class Bai5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        
        int ans = 0, i = 0;
        for (; i < s.length() - 1; i++)
            if (s.charAt(i) == 'I' && s.charAt(i + 1) == 'V'){
                ans += 4;
                i++;
            }
            else if (s.charAt(i) == 'I' && s.charAt(i + 1) == 'X'){
                ans += 9;
                i++;
            }
            else if (s.charAt(i) == 'X' && s.charAt(i + 1) == 'L'){
                ans += 40;
                i++;
            }
            else if (s.charAt(i) == 'X' && s.charAt(i + 1) == 'C'){
                ans += 90;
                i++;
            }
            else if (s.charAt(i) == 'C' && s.charAt(i + 1) == 'D'){
                ans += 400;
                i++;
            }
            else if (s.charAt(i) == 'C' && s.charAt(i + 1) == 'M'){
                ans += 900;
                i++;
            }
            else if (s.charAt(i) == 'I') ans++;
            else if (s.charAt(i) == 'V') ans += 5;
            else if (s.charAt(i) == 'L') ans += 50;
            else if (s.charAt(i) == 'C') ans += 100;
            else if (s.charAt(i) == 'D') ans += 500;
            else if (s.charAt(i) == 'M') ans += 1000;
        
        if (i < s.length()){
            if (s.charAt(i) == 'I') ans++;
            if (s.charAt(i) == 'V') ans += 5;
            if (s.charAt(i) == 'L') ans += 50;
            if (s.charAt(i) == 'C') ans += 100;
            if (s.charAt(i) == 'D') ans += 500;
            if (s.charAt(i) == 'M') ans += 1000;
        }
        
        System.out.println(ans);
    }
}
