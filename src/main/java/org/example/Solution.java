package org.example;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

class Solution {
    public String reverseVowels(String s) {
        StringBuilder s1 = new StringBuilder(s);
        HashMap vowels = new HashMap();
        vowels.put("a", "a");
        vowels.put("e", "e");
        vowels.put("i", "i");
        vowels.put("o", "o");
        vowels.put("u", "u");
        int i = 0;
        ArrayList<Character> v = new ArrayList<>();
        while (i < s.length()) {
            if (vowels.get(s.charAt(i)).equals(s.charAt(i))) {
                v.add(s.charAt(i));
            }
            i++;
        }
        for (int j = 0; j < s.length(); j++) {
            if (vowels.get(s.charAt(i)).equals(s.charAt(i))) {
//                s1.charAt(i)=;
                s1.insert(i, v.get(v.size() - 1 - i));
            }
        }
        return s1.toString();
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        String res = sol.reverseVowels("hello");
        System.out.println(res);
    }
}
