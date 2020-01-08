import java.util.Scanner;

public class App {


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        boolean endChat = false;

        String[] names = new BeginChat().begin();


        Person person1 = new Person(names[0]);
        Person person2 = new Person(names[1]);

        do{
            System.out.println("Are you " + person1.getName() + " (type 1) \n or " + person2.getName() + " (type 2) \n or type end to exit chat.");
            switch (sc.nextLine()){
                case "1":
                    System.out.println(person1.getName() + ":");
                    String message1 = sc.nextLine();
                    person1.setLastMessage(message1);
                    new Analize(message1);
                    break;
                case "2":
                    System.out.println(person2.getName() + ":");
                    String message2 = sc.nextLine();
                    person2.setLastMessage(message2);
                    new Analize(message2);
                    break;
                case "end":
                    endChat = true;
                    break;
                default: System.out.println("Command not recognised.");
            }
        }while(!endChat);
    }
}
