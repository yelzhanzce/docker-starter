import java.util.Scanner;

public class DockerRun {
    public static void main(String[] args) {
        System.out.println("Enter your name: ");

        Scanner scan = new Scanner(System.in);

        String name = scan.nextLine();
        
        System.out.println("Your name is " + name);

        scan.close();
    }
}