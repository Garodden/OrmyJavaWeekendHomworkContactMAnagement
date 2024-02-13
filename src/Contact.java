import java.util.Scanner;

public abstract class Contact {
    protected String name;
    protected String phoneNumber;

    public Contact(String name, String p){
        this.name = name;
        this.phoneNumber = p;
    }

    public String getName(){
        return name;
    }
    public abstract void displayContactInformation();
}
