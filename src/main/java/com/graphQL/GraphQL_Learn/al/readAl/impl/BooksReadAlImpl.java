package com.graphQL.GraphQL_Learn.al.readAl.impl;

import com.graphQL.GraphQL_Learn.al.readAl.BooksReadAl;
import com.graphQL.GraphQL_Learn.enity.BooksEntity;
import com.graphQL.GraphQL_Learn.module.BooksDetails;
import com.graphQL.GraphQL_Learn.repositories.BooksRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Component
public class BooksReadAlImpl implements BooksReadAl{
    private static final ModelMapper MODEL_MAPPER = new ModelMapper();

    private final BooksRepository booksRepository;

    @Autowired
    public BooksReadAlImpl(BooksRepository booksRepository) {
        this.booksRepository = booksRepository;
    }


    @Override
    public Optional<BooksDetails> getBookById(Long id) {
        return Optional.ofNullable(booksRepository.findById(id).map(booksDetails -> MODEL_MAPPER.map(booksDetails, BooksDetails.class)).orElse(null));
    }

    @Override
    public Optional<List<BooksDetails>> getAllBooks() {
        List<BooksDetails> booksDetails = new ArrayList<>();
        booksRepository.findAll().forEach(booksEntity -> booksDetails.add(MODEL_MAPPER.map(booksEntity, BooksDetails.class)));
        return Optional.of(booksDetails);
    }
}
