package com.arichafamily.java;

import java.util.Scanner;

/**
 * Created by Bosnia on 14/02/2017.
 */
public class LibraryMenu {

    Library library = new Library();

    public void Start(){
        Scanner in = new Scanner(System.in);
        int yourChoice = -1;
        while (yourChoice != 5) {
            System.out.println("Enter your choice: " +
                    "\n1) Add a book" +
                    "\n2) View all books" +
                    "\n3) View all books by author" +
                    "\n4) View all books by title" +
                    "\n5) Exit"
            );
            yourChoice = in.nextInt();

            if (yourChoice == 1) {
                library.addBook();
            }
            else if (yourChoice == 2){

            }
            else if (yourChoice == 3){

            }
            else if (yourChoice == 4){

            }
        }
    }
}
