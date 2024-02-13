import java.util.List;
import java.util.Scanner;

public class PersonalContact extends Contact {
    protected String relationship;
    public PersonalContact(String name, String phoneNumber,String relationship){
        super(name,phoneNumber);
        this.relationship=relationship;
    }

    @Override
    public void displayContactInformation() {
        System.out.println("이름: " + name +
                ", 전화번호: " + phoneNumber+
                ", 관계: "+ relationship);
    }

}
