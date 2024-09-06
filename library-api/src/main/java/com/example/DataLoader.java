package com.example;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import repository.BookRepository;

import java.awt.print.Book;

@Configuration
public class DataLoader {

    @Bean
    public CommandLineRunner loadData(BookRepository bookRepository) {
        return args -> {
            bookRepository.save(new Book(null, "1984", "George Orwell", "978-0451524935", "1949-06-08", 9.99));
            bookRepository.save(new Book(null, "To Kill a Mockingbird", "Harper Lee", "978-0060935467", "1960-07-11", 7.99));
            bookRepository.save(new Book(null, "The Great Gatsby", "F. Scott Fitzgerald", "978-0743273565", "1925-04-10", 10.99));
        };
    }
}
