package com.service;

import java.util.Scanner;
import com.Controller.Controller;
import com.entity.Book;

public class ViewBookService {
    public void display() {
        Scanner scanner = new Scanner(System.in);
        Controller controller = new Controller();

        System.out.print("Enter book ID: ");
        int id = scanner.nextInt();
        Book book = controller.viewBook(id);
        System.out.println(book != null ? book : "Book not found.");
        scanner.close();
    }
}
