public class FactorialRecursion {
    // Hàm đệ quy tính giai thừa
    public static long factorial(int n) {
        if (n == 0 || n == 1) {
            return 1; // Trường hợp cơ sở
        } else {
            return n * factorial(n - 1); // Gọi đệ quy
        }
    }

    public static void main(String[] args) {
        int number = 5; // Ví dụ: tính 5!
        long result = factorial(number);

        System.out.println("Giai thừa của " + number + " là: " + result);
    }
}

