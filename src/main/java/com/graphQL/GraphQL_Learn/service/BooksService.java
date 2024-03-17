package com.graphQL.GraphQL_Learn.service;

import com.graphQL.GraphQL_Learn.module.BooksDetails;
import com.graphQL.GraphQL_Learn.request.CreateBookRequest;

import java.util.List;
import java.util.Optional;

public interface BooksService {

    //create Book
    Optional<BooksDetails> createBook(CreateBookRequest booksDetails);

    //get Book by id
    Optional<BooksDetails> getBookById(Long id);

    //get all Books
    Optional<List<BooksDetails>> getAllBooks();
}
