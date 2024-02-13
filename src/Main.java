import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        AdressBook addressBook = new AdressBook();

        int decision = 0;
        String name, phone, etc;
        boolean loop = true;
        while(loop) {
            System.out.println("\n1. 비즈니스 연락처 추가");
            System.out.println("2. 개인 연락처 추가");
            System.out.println("3. 연락처 출력");
            System.out.println("4. 연락처 검색");
            System.out.println("5. 종료");
            System.out.print("메뉴를 선택해주세요:");
            try {
                decision = scan.nextInt();
                if (decision<1||decision>5){
                    throw new InputMismatchException();
                }
            }
            catch(InputMismatchException e){
                System.out.println("올바른 메뉴를 골라주세요!");
                scan.nextLine();
                continue;
            }

            switch(decision) {
                case 1 -> {
                    System.out.print("이름을 입력하세요: ");
                    name = scan.next();
                    System.out.print("전화번호를 입력하세요: ");
                    phone = scan.next();
                    System.out.print("회사명를 입력하세요:");
                    etc = scan.next();
                    addressBook.addContactList(new PersonalContact(name, phone, etc));
                }
                case 2 -> {
                    System.out.print("이름을 입력하세요: ");
                    name = scan.next();
                    System.out.print("전화번호를 입력하세요: ");
                    phone = scan.next();
                    System.out.print("관계을 입력하세요:");
                    etc = scan.next();
                    addressBook.addContactList(new PersonalContact(name, phone, etc));
                }
                case 3 -> addressBook.displayContacts();

                case 4 -> {
                    System.out.print("검색할 이름을 입력하세요: ");
                    addressBook.searchContact(scan.next());
                }
                case 5 -> {
                    loop = false;
                }
            }
        }
    }
}