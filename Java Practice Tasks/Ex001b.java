public class Ex001b {
    public static void main(String[] args) {        
        // int to str:
        int x = 10;
        String x_str = String.valueOf(x);
        System.out.printf("now x is a String: %s%n", x_str);

        // double to int:
        double y = 5.8;
        int z = (int) y;
        System.out.printf("double y = %.2f -> int = %d%n", y, z);

        // str to int:
        String str = "12345";
        int num = Integer.parseInt(str);

        // str to double:
        String str2 = "20.5643";
        double num2 = Double.parseDouble(str2);
        System.out.println(num2);
    }
}