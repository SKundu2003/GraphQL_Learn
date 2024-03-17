package com.graphQL.GraphQL_Learn.repositories;

import com.graphQL.GraphQL_Learn.enity.BooksEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BooksRepository extends JpaRepository<BooksEntity, Long> {

}
