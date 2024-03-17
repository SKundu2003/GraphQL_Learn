package com.graphQL.GraphQL_Learn.module;

import lombok.Data;

@Data
public class BooksDetails {
    private Long id;

    private String title;

    private String author;

    private String description;

    private Double price;

}
