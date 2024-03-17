package com.graphQL.GraphQL_Learn.controller;

import com.graphQL.GraphQL_Learn.module.BooksDetails;
import com.graphQL.GraphQL_Learn.request.CreateBookRequest;
import com.graphQL.GraphQL_Learn.service.BooksService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class BooksController {

    private final BooksService booksService;

    @Autowired
    public BooksController(BooksService booksService) {
        this.booksService = booksService;
    }


    @QueryMapping("getAllBooks")
//    @GetMapping("/get/all/books")
    public List<BooksDetails> getAllBooks() {
        return booksService.getAllBooks().get();
    }

    @QueryMapping("getBookById")
//    @GetMapping("/get/{id}/book")
    public BooksDetails getBookById(@Argument Long id){
        return booksService.getBookById(id).get();
    }


    //we are not using this method in our project because we are using graphql to get the data--->>> data will not not come using @PathVariable
//    @GetMapping("/get/{id}/book")
//    public ResponseEntity<?> getBookById(@PathVariable("id") Long id){
//        return ResponseEntity.ok(booksService.getBookById(id));
//    }

//    @PostMapping("/add/book")
    @MutationMapping("addBook")
    public BooksDetails addBook(@Argument CreateBookRequest createBookRequest){
        return booksService.createBook(createBookRequest).get();
    }
}
