import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        Human humanOne = new Human();
        String sex;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input your sex.");
        sex = scanner.nextLine();
        switch (sex.toLowerCase()){
            case "man":
                humanOne.sex = 'm';
                break;
            case "women":
                humanOne.sex = 'w';
                break;
            default:
                humanOne.sex = 'f';
        }
        humanOne.hello();
    }
}
class Human{
    char sex;
    void hello(){
        if (sex=='m'){
            System.out.println("I'm mega-brutality man!");
        } else if (sex=='w'){
            System.out.println("I'm girl:)");
        } else {
            System.out.println("I'm not want say");
        }
    }
}