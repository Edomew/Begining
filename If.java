import java.util.Scanner;

public class If {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Write anything integer");
        int i = scanner.nextInt();
        if (i>0) System.out.println("Bye");
        else if (i<0) System.out.println("Hello");
        else System.out.println(";)");
    }
}
