package com.graphQL.GraphQL_Learn.al.writeAl.impl;

import com.graphQL.GraphQL_Learn.al.writeAl.BooksWriteAl;
import com.graphQL.GraphQL_Learn.enity.BooksEntity;
import com.graphQL.GraphQL_Learn.module.BooksDetails;
import com.graphQL.GraphQL_Learn.repositories.BooksRepository;
import com.graphQL.GraphQL_Learn.request.CreateBookRequest;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public class BooksWriteAlImpl implements BooksWriteAl {
    private static final ModelMapper MODEL_MAPPER = new ModelMapper();

    private final BooksRepository booksRepository;

    @Autowired
    public BooksWriteAlImpl(BooksRepository booksRepository) {
        this.booksRepository = booksRepository;
    }

    @Override
    public Optional<BooksDetails> createBook(CreateBookRequest booksDetails) {
        BooksEntity booksEntity = MODEL_MAPPER.map(booksDetails, BooksEntity.class);
        booksEntity = booksRepository.save(booksEntity);

        return Optional.of(MODEL_MAPPER.map(booksEntity, BooksDetails.class));
    }
}
