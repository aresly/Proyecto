package com.example.library.util;

import org.springframework.stereotype.Component;

import com.example.library.model.Book;
import com.example.library.service.BookService;

import jakarta.annotation.PostConstruct;

@Component
public class BookFiller {
    private final BookService bookService;

    public BookFiller(BookService bookService){
        this.bookService = bookService;
    }

    @PostConstruct
    public void init(){
        Book book1 = new Book("Libro 1","Libro 1", "Autor 1");
        bookService.addBook(book1);
        try{Thread.sleep(1000);}catch(InterruptedException e){}
    
        Book book2 = new Book("Libro 2","Libro 2", "Autor 2");
        bookService.addBook(book2);
        try{Thread.sleep(1000);}catch(InterruptedException e){}

        Book book3 = new Book("Libro 3","Libro 3", "Autor 3");
        bookService.addBook(book3);        



    }
}
