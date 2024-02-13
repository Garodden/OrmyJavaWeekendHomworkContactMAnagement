public class BusinessContact extends Contact{
    String company;

    public BusinessContact(String name, String phoneNumber,String company){
        super(name,phoneNumber);
        this.company=company;
    }

    @Override
    public void displayContactInformation() {
        System.out.println("이름: " + name +
                ", 전화번호: " + phoneNumber+
                ", 회사명: "+ company);
    }
}
