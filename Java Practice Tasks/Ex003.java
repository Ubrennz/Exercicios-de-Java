public class Ex003 {
    public static void main(String[] args) {
        // str to int
        String count1 = "100";
        int num1 = Integer.parseInt(count1);
        System.out.printf("str = %s, int = %d%n", count1, num1);

        // str to double
        String count2 = "43.76";
        double num2 = Double.parseDouble(count2);
        System.out.printf("str = %s, double = %.2f%n", count2, num2);

        // int to double
        int x1 = 45;
        double y1 = (double) x1;
        System.out.printf("int = %d, double = %.2f%n", x1, y1);

        // double to int
        double y2 = 5.6785;
        int x2 = (int) y2;
        System.out.printf("double = %.4f, int = %d%n", y2, x2);

        // int to str
        int x3 = 54;
        String z3 = String.valueOf(x3);
        System.out.printf("int = %d, str = %s%n", x3, z3);

        // double to str
        double y4 = 3.7463;
        String z4 = String.valueOf(y4);
        System.out.printf("double = %.4f, str = %s%n", y4, z4);

    }
}