package com.bitmap.backend.service.impl;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.bitmap.backend.model.Book;

import java.util.List;

public interface BookService {
    Boolean save(Book book);
    Boolean update(Book book);
    Boolean delete(Book book);
    Book getById(int id);
    List<Book> getAll();
    IPage<Book> getPage(int currentPage, int pageSize);
}
