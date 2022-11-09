package Baitaptuan3;

import java.util.Scanner;

public class Bai2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        String s2 = sc.nextLine();
        
        int ans = 0;
        for (int i = 0; i < s2.length(); i++)
            for (int j = i + 1; j <= s2.length(); j++)
                if (s1.indexOf(s2.substring(i, j)) != -1)
                    ans = Math.max(ans, j - i);
        
        System.out.println(ans);
    }
}
