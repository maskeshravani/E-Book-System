package com.service;

import java.util.Scanner;
import com.Controller.Controller;

public class UpdateBookService {
    public void display() {
        Scanner scanner = new Scanner(System.in);
        Controller controller = new Controller();

        System.out.print("Enter book ID to update: ");
        int id = scanner.nextInt();
        scanner.nextLine(); // Consume newline
        System.out.print("Enter new title: ");
        String title = scanner.nextLine();
        System.out.print("Enter new author: ");
        String author = scanner.nextLine();
        System.out.print("Enter new price: ");
        double price = scanner.nextDouble();

        boolean isUpdated = controller.editBook(id, title, author, price);
        System.out.println(isUpdated ? "Book updated successfully!" : "Book not found.");
    }
}
