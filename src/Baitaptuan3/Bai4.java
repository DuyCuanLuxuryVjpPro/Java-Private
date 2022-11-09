package Baitaptuan3;

import java.util.Scanner;

public class Bai4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = ((sc.nextLine()).trim()).toLowerCase();
        
        String ans = "";
        for (int i = 0; i < s.length(); i++){
            if (s.charAt(i) == ' ' && ans.length() > 0 && ans.charAt(ans.length() - 1) != ' ')
                ans = ans.concat(s.substring(i, i + 1));
            if ('a' <= s.charAt(i) && s.charAt(i) <= 'z' && ans.length() > 0 && ans.charAt(ans.length() - 1) != ' ')
                ans = ans.concat(s.substring(i, i + 1));
            if ('a' <= s.charAt(i) && s.charAt(i) <= 'z' && (ans.length() == 0 || ans.charAt(ans.length() - 1) == ' '))
                ans = ans.concat(s.substring(i, i + 1).toUpperCase());
        }
        
        System.out.println(ans);
    }
}
