import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String n = scanner.nextLine();
        System.out.println(countX(n));
    }

    private static int countX(String string) {
        if (string.length() == 0){
            return 0;
        }
        if (string.charAt(0) == 'x') {
            return 1 + countX(string.substring(1));
        } else {
            return countX(string.substring(1));
        }
    }
}