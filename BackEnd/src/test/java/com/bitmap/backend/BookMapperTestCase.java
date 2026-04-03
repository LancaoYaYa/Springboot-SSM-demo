package com.bitmap.backend;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
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
        book.setId(13);
        book.setName("test123456");
        book.setType("Type123");
        book.setDescription("Desc123");
        bookMapper.updateById(book);
    }

    @Test
    void testGetAll() {
        bookMapper.selectList(null);
    }

    @Test
    void testGetPage(){
    IPage page = new Page(2,5);
    bookMapper.selectPage(page,null);
        System.out.println(page.getCurrent());
        System.out.println(page.getSize());
        System.out.println(page.getTotal());
        System.out.println(page.getPages());
        System.out.println(page.getRecords());
    }

    @Test
    void testGetBy(){
        QueryWrapper<Book> qw = new QueryWrapper<>(); //封装查询条件对象
        qw.like("name","Spring");//查询条件
        bookMapper.selectList(qw);
    }

    @Test
    void testGetBy2(){
        String name = "1";
        LambdaQueryWrapper<Book> lqw = new LambdaQueryWrapper<>(); //封装查询条件对象
        lqw.like(Book::getName,name);//查询条件
        bookMapper.selectList(lqw);
    }
}
