import java.util.*;

public class AdressBook{
    private List<Contact> contacts;


    public AdressBook(){
        contacts = new ArrayList<Contact>();
    }
    public void displayContacts() {
        if(contacts.isEmpty())
            System.out.println("연락처가 비어있습니다.");
        else
            for (Contact i : contacts)
                i.displayContactInformation();

    }

    public void searchContact(String name){
        boolean flag = false;
        for(Contact i : contacts){
            if(Objects.equals(i.getName(), name)){
                flag = true;
                i.displayContactInformation();
            }
        }

        if(!flag){
            System.out.println("연락처를 찾을 수 없습니다. ");
        }
    }

    public void addContactList(Contact contact){
        contacts.add(contact);
    }

}
