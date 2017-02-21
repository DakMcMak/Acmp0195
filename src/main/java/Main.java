import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int length = scanner.nextInt();
        int width = scanner.nextInt();
        int height = scanner.nextInt();
        int enia;
        enia = length * width * height;
        enia = enia * 2;
        System.out.println(enia);
    }
}
