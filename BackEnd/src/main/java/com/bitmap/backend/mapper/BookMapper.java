package com.bitmap.backend.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.bitmap.backend.model.Book;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface BookMapper extends BaseMapper<Book> {

}
