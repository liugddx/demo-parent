package com.liugddx.controller;

import com.liugddx.domain.BookBean;
import com.liugddx.service.inter.IBookService;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>@ClassName ElasticController</p>
 * <p>@description TODO</p>
 *
 * @author liugddx
 * @version 1.0
 * @date 2020/10/26 21:11
 */
@RestController
public class ElasticController {
    @Autowired
    private IBookService bookService;

    @RequestMapping("/book/{id}")
    @ResponseBody
    public BookBean getBookById(@PathVariable String id){
        Optional<BookBean> opt =bookService.findById(id);
        BookBean book=opt.get();
        System.out.println(book);
        return book;
    }

    @RequestMapping("/save")
    @ResponseBody
    public void Save(){
        BookBean book=new BookBean("1","ES入门教程","liugddx","2020-10-27");
        System.out.println(book);
        bookService.save(book);
    }
}
