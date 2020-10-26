package com.liugddx.service;

import com.liugddx.dao.BookRepository;
import com.liugddx.domain.BookBean;
import com.liugddx.service.inter.IBookService;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

/**
 * <p>@ClassName BookServiceImpl</p>
 * <p>@description TODO</p>
 *
 * @author liugddx
 * @version 1.0
 * @date 2020/10/26 21:10
 */
@Service("blogService")
public class BookServiceImpl implements IBookService {
    @Autowired
    @Qualifier("bookRepository")
    private BookRepository bookRepository;


    @Override
    public Optional<BookBean> findById(String id) {
        //CrudRepository中的方法
        return bookRepository.findById(id);
    }

    @Override
    public BookBean save(BookBean blog) {
        return bookRepository.save(blog);
    }

    @Override
    public void delete(BookBean blog) {
        bookRepository.delete(blog);
    }

    @Override
    public Optional<BookBean> findOne(String id) {
        return bookRepository.findById(id);
    }

    @Override
    public List<BookBean> findAll() {
        return (List<BookBean>) bookRepository.findAll();
    }

    @Override
    public Page<BookBean> findByAuthor(String author, PageRequest pageRequest) {
        return bookRepository.findByAuthor(author,pageRequest);
    }

    @Override
    public Page<BookBean> findByTitle(String title, PageRequest pageRequest) {
        return bookRepository.findByTitle(title,pageRequest);
    }
}
