package me.sit.dev.io_object;
import java.util.*;
import java.io.*;

public class IO_Object {
    private static final String PATH = "src/main/resources/text.txt";

    public static void main(String[] args) {
        Account ac1 = new Account(1, "Bomb");
        System.out.println(ac1);
        ac1.deposit(400);
        ac1.deposit(400);
        ac1.deposit(400);
        Account ac2 = new Account(2, "Bomb_1");
        System.out.println(ac2);
        ac2.deposit(100);
        ac2.deposit(200);
        ac2.deposit(300);

        WriteObjectFile(ac1, ac2);
        ReadObjectFile();

    }

    public static void WriteObjectFile(Account acc, Account acc2) {
        System.out.println("-> Write object");
        try (FileOutputStream fo = new FileOutputStream(PATH);
             ObjectOutputStream oos = new ObjectOutputStream(fo);) {
            oos.writeObject(acc);
            oos.writeObject(acc2);
            System.out.println("write successfully");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void ReadObjectFile() {
        System.out.println("-> Read object");
        List<Account> accountsList = new ArrayList<>();
        try (FileInputStream fi = new FileInputStream(PATH);
             ObjectInputStream ois = new ObjectInputStream(fi)) {
            while (true) {
                try {
                    Account account = (Account) ois.readObject();
                    accountsList.add(account);
                } catch (Exception e) {
                    break;
                }
            }
            System.out.println("content: " + accountsList);
            System.out.println("read successfully");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
