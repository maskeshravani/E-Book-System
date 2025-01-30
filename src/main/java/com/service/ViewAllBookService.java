package com.service;

import com.Controller.Controller;

public class ViewAllBookService {
    public void display() {
        Controller controller = new Controller();

        System.out.println("\n--- All Books ---");
        controller.viewAllBooks().forEach(System.out::println);
    }
}
