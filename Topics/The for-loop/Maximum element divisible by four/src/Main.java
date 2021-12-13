import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here
        int max = 0;
        int elements = scanner.nextInt();
        for (int i=0; i < elements; i++){
            int element = scanner.nextInt();
            if (element % 4 == 0 && element > max){
                max = element;
            }
        }
        System.out.println(max);
    }
}