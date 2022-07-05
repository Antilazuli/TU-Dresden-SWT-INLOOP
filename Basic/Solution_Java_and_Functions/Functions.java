public class Functions {
    public static int factorial(int n) {
        int a = 1;
        for(int i = n; i >= 1; i--){
            a *= i;
        }
        return a;
    }
    public static void main(String[] args) {
    System.out.println("The factorial of 5 is:");
    System.out.println(factorial(5));
    }
}
