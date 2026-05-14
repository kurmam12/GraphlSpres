package com.de.le.graphlspres.controls;

import com.de.le.graphlspres.entity.Books;
import com.de.le.graphlspres.repo.BooksRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class BooksController {

    @Autowired
    private BooksRepo booksRepo;

    @QueryMapping
    public Books getBookById(@Argument long id){
       return  booksRepo.findById(id).orElse(null);

    }
}
