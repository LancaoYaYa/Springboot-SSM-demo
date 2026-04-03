package com.bitmap.backend.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.bitmap.backend.mapper.BookMapper;
import com.bitmap.backend.model.Book;
import com.bitmap.backend.service.impl.IBookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class IBookServiceImpl implements IBookService {
    @Autowired
    private BookMapper bookMapper;

    @Override
    public Boolean save(Book book){
        return bookMapper.insert(book) > 0;
    }

    @Override
    public Boolean update(Book book){
        return bookMapper.updateById(book) > 0;
    }

    @Override
    public Boolean delete(int id){
        return bookMapper.deleteById(id) > 0;
    }

    @Override
    public Book getById(int id){
        return bookMapper.selectById(id);
    }

    @Override
    public List<Book> getAll(){
        return bookMapper.selectList(null);
    }

    @Override
    public IPage<Book> getPage(int currentPage, int pageSize){
        IPage page = new Page(currentPage,pageSize);
        bookMapper.selectPage(page,null);
        return page;
    }
}
