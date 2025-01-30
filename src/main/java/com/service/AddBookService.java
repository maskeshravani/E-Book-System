package com.service;

import java.util.Scanner;
import com.Controller.Controller;

public class AddBookService {
    public void display() {
        Scanner scanner = new Scanner(System.in);
        Controller controller = new Controller();

        System.out.print("Enter title: ");
        String title = scanner.nextLine();
        System.out.print("Enter author: ");
        String author = scanner.nextLine();
        System.out.print("Enter price: ");
        double price = scanner.nextDouble();

        controller.createBook(title, author, price);
        System.out.println("Book added successfully!");
    }
}
