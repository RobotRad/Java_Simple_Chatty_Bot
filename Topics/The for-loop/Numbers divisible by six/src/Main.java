import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here
        int nelements = scanner.nextInt();
        int sum = 0;
        for (; nelements > 0; nelements--) {
            int element = scanner.nextInt();
            if (element % 6 == 0) {
                sum += element;
            }
        }
        System.out.println(sum);
    }
}