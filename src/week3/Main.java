package week3;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        AddressBook addressBook = new AddressBook(new ArrayList<>());
        Scanner sc = new Scanner(System.in);

        // 5가 입력되기 전에는 프로그램이 종료되지 않게
        boolean flag = true;
        while(flag) {
            indexOfProgram();
            int command = sc.nextInt();

            switch (command) {
                case 1:
                    addressBook.addToBook(addBusinessContact());
                    break;
                case 2:
                    addressBook.addToBook(addPersonalContact());
                    break;
                case 3:
                    addressBook.displayContacts();
                    break;
                case 4:
                    System.out.print("검색할 이름을 입력하세요: ");
                    sc.nextLine(); // 개행문자 제거
                    String name = sc.nextLine();
                    addressBook.searchContact(name);
                    break;
                case 5:
                    // flag를 false로 만들어서 무한루프 종료
                    System.out.println("프로그램을 종료합니다.");
                    flag = false;
                    break;
                default:
                    System.out.println();
                    System.out.println("1~5 사이의 숫자를 입력해주세요. \n" );
            }
        }
    }
    // 프로그램의 맨 첫 화면
    public static void indexOfProgram() {
        System.out.println("1. 비즈니스 연락처 추가");
        System.out.println("2. 개인 연락처 추가");
        System.out.println("3. 연락처 출력");
        System.out.println("4. 연락처 검색");
        System.out.println("5. 종료");
        System.out.print("메뉴를 선택해주세요: ");
    }
    // 비지니스 연락처 추가
    public static BusinessContact addBusinessContact() {
        Scanner sc = new Scanner(System.in);
        BusinessContact bc;

        System.out.println();
        System.out.print("이름을 입력하세요: ");
        String name = sc.nextLine();
        System.out.print("전화번호를 입력하세요: ");
        String phoneNumber = sc.nextLine();
        System.out.print("회사명을 입력하세요: ");
        String company = sc.nextLine();
        System.out.println();
        bc = new BusinessContact(name, phoneNumber, company);

        return bc;
    }
    // 개인 연락처 추가
    public static PersonalContact addPersonalContact() {
        Scanner sc = new Scanner(System.in);
        PersonalContact pc;

        System.out.println();
        System.out.print("이름을 입력하세요: ");
        String name = sc.nextLine();
        System.out.print("전화번호를 입력하세요: ");
        String phoneNumber = sc.nextLine();
        System.out.print("관계를 입력하세요: ");
        String relationship = sc.nextLine();
        System.out.println();
        pc = new PersonalContact(name, phoneNumber, relationship);

        return pc;
    }

}
