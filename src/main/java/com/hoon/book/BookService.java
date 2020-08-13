package com.hoon.book;

import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.Date;

@Service
public class BookService {

    private BookRepository bookRepository;

    public BookService(BookRepository bookRepository){
        this.bookRepository = bookRepository;
    }

    public Book save(Book book){
        book.setCreated(new Date());
        book.setBookStatus(BookStatus.DRAFT);
        return bookRepository.save(book);
    }

    //스프링 컨테이너에 등록된 빈들은 라이플사이클 인터페이스 지원
    @PostConstruct
    public void postConstruct(){
        System.out.println("==========================");
        System.out.println("BookService is constructed");
        System.out.println("==========================");
    }

}
