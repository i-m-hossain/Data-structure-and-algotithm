package org.example;

public class LearningStaticClass {
    private int num = 10;
    private static String name = "imran";

    // Only innerClasses can be static
    public static class InnerClass {
        private int nestedVar = 30;

        public static void main(String[] arg) {
            InnerClass ic = new InnerClass();
            System.out.println("Nested variable: " + ic.nestedVar);
        }
    }


}
