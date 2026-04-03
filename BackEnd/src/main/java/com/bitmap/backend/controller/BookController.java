package com.bitmap.backend.controller;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.bitmap.backend.model.Book;
import com.bitmap.backend.model.Res;
import com.bitmap.backend.service.impl.IBookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/book")
public class BookController {
    @Autowired
    private IBookService bookService;

    @GetMapping
    public List<Book> getAll(){
        return bookService.getAll();
    }

    @PostMapping
    public Res save(@RequestBody Book book){
        Boolean flag = bookService.save(book);
        return new Res(flag,null);
    }

    @PutMapping
    public Res update(@RequestBody Book book){
        Boolean flag = bookService.update(book);
        return new Res(flag,null);
    }

    @DeleteMapping("{id}")
    public Res delete(@PathVariable int id){
        Boolean flag = bookService.delete(id);
        return new Res(flag,null);
    }

    @GetMapping("{id}")
    public Res getById(@PathVariable int id){
        Book book = bookService.getById(id);
        return new Res(true,book);
    }

    @GetMapping("{currentPage}/{pageSize}")
    public Res getPage(@PathVariable int currentPage, @PathVariable int pageSize){
        IPage<Book> page = bookService.getPage(currentPage, pageSize);
        return new Res(true,page);
    }
}
