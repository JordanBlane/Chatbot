import java.util.ArrayList;

public class Person {

    private String name;
    private String lastMessage;
    private ArrayList<String> messageHistory = new ArrayList<>();

    //constructor
    public Person(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    //message setter
    public String setLastMessage(String message) {

        messageHistory.add(lastMessage);
        this.lastMessage = message;

        return this.lastMessage;
    }

    public String getLastMessage(){
        return this.lastMessage;
    }
}
