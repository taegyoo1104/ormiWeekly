package week3;

import java.util.ArrayList;

public class AddressBook {
    private ArrayList<Contact> contacts;

    public AddressBook(ArrayList<Contact> contacts) {
        this.contacts = contacts;
    }

    public void addToBook(Contact contact) {
        contacts.add(contact);
    }

    public void displayContacts() {
        System.out.println();
        // arraylist안의 contact가 BusinessContact인지 PersonalContact인지 구분해서 따로 출력
        for(int i = 0; i < contacts.size(); i++) {
            if(contacts.get(i) instanceof BusinessContact) {
                System.out.println("이름: " + contacts.get(i).getName() + " 전화번호: " + contacts.get(i).getPhoneNumber() + " 회사명: " + ((BusinessContact) contacts.get(i)).getCompany());
            } else {
                System.out.println("이름: " + contacts.get(i).getName() + " 전화번호: " + contacts.get(i).getPhoneNumber() + " 관계: " + ((PersonalContact)contacts.get(i)).getRelationship());
            }
        }
        System.out.println();
    }

    public void searchContact(String name) {
        int count = -1;
        System.out.println();
        for(int i = 0; i < contacts.size(); i++) {
            // list안의 contact의 이름과 입력받은 이름이 같으면 양식에 맞게 출력
            if (contacts.get(i).getName().equals(name)) {
                // 이름의 존재여부 체크를 위한 변수
                count++;
                if(contacts.get(i) instanceof BusinessContact) {
                    System.out.println("이름: " + contacts.get(i).getName() + " 전화번호: " + contacts.get(i).getPhoneNumber() + " 회사명: " + ((BusinessContact) contacts.get(i)).getCompany());
                } else {
                    System.out.println("이름: " + contacts.get(i).getName() + " 전화번호: " + contacts.get(i).getPhoneNumber() + " 관계: " + ((PersonalContact)contacts.get(i)).getRelationship());
                }
            }
        }
        // 찾는 이름이 없으면 count가 -1이므로
        if (count == -1) {
            System.out.println("연락처를 찾을 수 없습니다.");
        }
        System.out.println();
    }
}
