package com.graphQL.GraphQL_Learn.service.impl;

import com.graphQL.GraphQL_Learn.al.readAl.BooksReadAl;
import com.graphQL.GraphQL_Learn.al.writeAl.BooksWriteAl;
import com.graphQL.GraphQL_Learn.module.BooksDetails;
import com.graphQL.GraphQL_Learn.request.CreateBookRequest;
import com.graphQL.GraphQL_Learn.service.BooksService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public class BooksServiceImpl implements BooksService {

    private final BooksReadAl booksReadAl;

    private final BooksWriteAl booksWriteAl;

    @Autowired
    public BooksServiceImpl(BooksReadAl booksReadAl, BooksWriteAl booksWriteAl) {
        this.booksReadAl = booksReadAl;
        this.booksWriteAl = booksWriteAl;
    }


    @Override
    public Optional<BooksDetails> createBook(CreateBookRequest booksDetails) {
        return booksWriteAl.createBook(booksDetails);
    }

    @Override
    public Optional<BooksDetails> getBookById(Long id) {
        return booksReadAl.getBookById(id);
    }

    @Override
    public Optional<List<BooksDetails>> getAllBooks() {
        return booksReadAl.getAllBooks();
    }
}
