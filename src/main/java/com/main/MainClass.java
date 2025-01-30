package com.main;

import java.util.Scanner;

import com.service.AddBookService;
import com.service.DeleteBookService;
import com.service.UpdateBookService;
import com.service.ViewAllBookService;
import com.service.ViewBookService;

public class MainClass {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n--- Book Management ---");
            System.out.println("1. Add Book");
            System.out.println("2. View Book");
            System.out.println("3. View All Books");
            System.out.println("4. Update Book");
            System.out.println("5. Delete Book");
            System.out.println("0. Exit");
            System.out.print("Enter choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    new AddBookService().display();
                    break;
                case 2:
                    new ViewBookService().display();
                    break;
                case 3:
                    new ViewAllBookService().display();
                    break;
                case 4:
                    new UpdateBookService().display();
                    break;
                case 5:
                    new DeleteBookService().display();
                    break;
                case 0:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice.");
            }
        } while (choice != 0);

        scanner.close();
    }
}
