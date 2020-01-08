import java.util.Scanner;

public class BeginChat {

    public String[] begin(){

        Scanner sc = new Scanner(System.in);
        String[] names = new String[2];

        System.out.println("Person 1 please enter your name:");
        names[0] = sc.nextLine();

        System.out.println("Person 2 please enter your name:");
        names[1] = sc.nextLine();

        return names;

    }
}
