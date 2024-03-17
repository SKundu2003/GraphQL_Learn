package com.graphQL.GraphQL_Learn;

import com.graphQL.GraphQL_Learn.enity.BooksEntity;
import com.graphQL.GraphQL_Learn.request.CreateBookRequest;
import com.graphQL.GraphQL_Learn.service.BooksService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GraphQlLearnApplication {

	//to insert data into the database using CommandLineRunner

//		implements CommandLineRunner {


//	@Autowired
//	private BooksService bookService;


	public static void main(String[] args) {
		SpringApplication.run(GraphQlLearnApplication.class, args);
	}

//	@Override
//	public void run(String... args) throws Exception {
//		for (int i = 0; i < 4; i++) {
//			CreateBookRequest book = new CreateBookRequest();
//			book.setDescription("Book " + i + " Description");
//			book.setAuthor("Author " + i);
//			book.setTitle("Book " + i);
//			book.setPrice(100.00 + i);
//			bookService.createBook(book);
//		}
//
//	}
}
