package org.example;

class Test {
    public boolean isSubsequence(String s, String t) {
        int j = 0;
        for (int i = 0; i < t.length() && j < s.length(); i++) {
            if (t.charAt(i) == s.charAt(j)) {
                j++;
            }
        }
        return j == s.length();
    }

    public static void main(String[] args) {
        Test test = new Test();
        boolean num = test.isSubsequence("b", "abc");
        System.out.println(num);
    }
}
