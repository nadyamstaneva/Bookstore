package bg.smg.model;


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.println("Моля въведете име на книга:"); //print

        Scanner sc = new Scanner(System.in); //def
        String bookName = sc.nextLine(); //read

        System.out.println(bookName);
    }
}
