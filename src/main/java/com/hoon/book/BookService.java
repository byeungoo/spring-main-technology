package com.hoon.book;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.Date;
import java.util.List;

@Service
public class BookService {

    private BookRepository bookRepository;

    public BookService(BookRepository bookRepository){
        this.bookRepository = bookRepository;
    }

    @Autowired(required = false) //optional 설정
    public void setBookRepository(BookRepository bookRepository){
        this.bookRepository = bookRepository;
    }

    @Autowired
    @Qualifier("myBookRepo")  //주입할 빈 이름 명시
    BookRepo bookRepo;

    @Autowired
    List<BookRepo> bookRepoList;  //해당 타입의 모든 빈 주입

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

    public void printBookRepo() {

        System.out.println(bookRepo.getClass());
    }
}
