package com.bitmap.backend;

import com.bitmap.backend.model.Book;
import com.bitmap.backend.service.impl.IBookService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class BookServiceTestCase {
    @Autowired
    private IBookService bookService;

    @Test
    void testSave(){
        Book book = new Book();
        book.setType("Type123123");
        book.setName("name123123");
        book.setDescription("desc123123");
        bookService.save(book);
    }
}
