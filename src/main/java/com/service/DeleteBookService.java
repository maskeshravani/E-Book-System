package com.service;

import java.util.Scanner;
import com.Controller.Controller;

public class DeleteBookService {
    public void display() {
        Scanner scanner = new Scanner(System.in);
        Controller controller = new Controller();

        System.out.print("Enter book ID to delete: ");
        int id = scanner.nextInt();

        boolean isDeleted = controller.deleteBook(id);
        System.out.println(isDeleted ? "Book deleted successfully!" : "Book not found.");
    }
}
