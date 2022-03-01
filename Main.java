package java2hw.hw4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

public class Main {
    public static void main(String[] args) {
        String [] str = new String[10];
        str [0] = new String("cat");
        str [1] = new String("cat");
        str [2] = new String("dog");
        str [3] = new String("horse");
        str [4] = new String("pig");
        str [5] = new String("pig");
        str [6] = new String("pig");
        str [7] = new String("duck");
        str [8] = new String("chicken");
        str [9] = new String("lamb");

        WordList wordList = new WordList(str);
        wordList.doArrayWordList();

        doPhoneBook();
    }

    private static void doPhoneBook() {
        PhoneBook phoneBook = new PhoneBook();
        phoneBook.addElementPhoneBook("Ivanov","89990000000");
        phoneBook.addElementPhoneBook("Petrov","89991111111");
        phoneBook.addElementPhoneBook("Petrov","89992222222");
        phoneBook.addElementPhoneBook("Sidorov","89090909099");
        phoneBook.addElementPhoneBook("Alekseev","89090101010");
        phoneBook.addElementPhoneBook("Alekseev","89993333333");
        phoneBook.addElementPhoneBook("Alekseev","8999 33 33 333");

        System.out.println("Ivanov: " + phoneBook.getPhonesByName("Ivanov"));
        System.out.println("Petrov: " + phoneBook.getPhonesByName("Petrov"));
        System.out.println("Sidorov: " + phoneBook.getPhonesByName("Sidorov"));
        System.out.println("Alekseev: " + phoneBook.getPhonesByName("Alekseev"));
        System.out.println("Arbuzov: " + phoneBook.getPhonesByName("Arbuzov"));
    }
}
