package com.graphQL.GraphQL_Learn.al.writeAl;

import com.graphQL.GraphQL_Learn.module.BooksDetails;
import com.graphQL.GraphQL_Learn.request.CreateBookRequest;

import java.util.Optional;

public interface BooksWriteAl {

    Optional<BooksDetails> createBook(CreateBookRequest booksDetails);
}
