package com.bitmap.backend;

import com.bitmap.backend.mapper.BookMapper;
import com.bitmap.backend.model.Book;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class BookMapperTestCase {
    @Autowired
    private BookMapper bookMapper;

    @Test
    void testGetById() {
        System.out.println(bookMapper.selectById(1));
    }

    @Test
    void testSave() {
        Book book = new Book();
        book.setName("test123");
        book.setType("Type123");
        book.setDescription("Desc123");
        bookMapper.insert(book);
    }

    @Test
    void testDelect() {
        bookMapper.deleteById(16);
    }

    @Test
    void testUpdate() {
        Book book = new Book();
        book.setId(51);
        book.setName("test123456");
        book.setType("Type123");
        book.setDescription("Desc123");
        bookMapper.updateById(book);
    }

    @Test
    void testGetAll() {
        bookMapper.selectList(null);
    }
}
