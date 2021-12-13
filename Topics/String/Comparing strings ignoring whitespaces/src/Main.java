import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here

        Scanner sc = new Scanner(System.in);

        //System.out.println("Enter a String");
        String str1 = sc.nextLine();

        //System.out.println("Enter another String");
        String str2 = sc.nextLine();

        //boolean compare = str1.replaceAll(" ","").equals(str2.replaceAll(" ",""));

        //System.out.println("Are both Strings the same without whitespace?");
        System.out.println(str1.replaceAll(" ", "").equals(str2.replaceAll(" ", "")));
    }
}