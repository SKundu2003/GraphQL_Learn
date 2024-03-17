package com.graphQL.GraphQL_Learn.al.readAl;

import com.graphQL.GraphQL_Learn.module.BooksDetails;

import java.util.List;
import java.util.Optional;

public interface BooksReadAl {

    Optional<BooksDetails> getBookById(Long id);

    Optional<List<BooksDetails>> getAllBooks();
}
