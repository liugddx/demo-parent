package com.liugddx.dao;

import com.liugddx.domain.BookBean;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

/**
 * <p>@ClassName BookRepository</p>
 * <p>@description TODO</p>
 *
 * @author liugddx
 * @version 1.0
 * @date 2020/10/26 21:09
 */
public interface BookRepository extends ElasticsearchRepository<BookBean, String> {

    //Optional<BookBean> findById(String id);

    Page<BookBean> findByAuthor(String author, Pageable pageable);

    Page<BookBean> findByTitle(String title, Pageable pageable);

}
