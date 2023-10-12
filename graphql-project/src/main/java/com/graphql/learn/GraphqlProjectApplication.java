package com.graphql.learn;

import com.graphql.learn.entities.Book;
import com.graphql.learn.services.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GraphqlProjectApplication implements CommandLineRunner{

	@Autowired
	private BookService bookService;

	public static void main(String[] args) {
		SpringApplication.run(GraphqlProjectApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Book b1=new Book();
		b1.setTitle("Think Like a Monk");
		b1.setDesc("Self Help");
		b1.setPages(250);
		b1.setPrice(1200);
		b1.setAuthor("Jay Shetty");

		Book b2=new Book();
		b2.setTitle("Atomic Habits");
		b2.setDesc("Time Management");
		b2.setPages(200);
		b2.setPrice(1000);
		b2.setAuthor("James Clear");

		Book b3=new Book();
		b3.setTitle("Do Epic Shit");
		b3.setDesc("Career");
		b3.setPages(150);
		b3.setPrice(700);
		b3.setAuthor("Ankur Warikoo");

		this.bookService.create(b1);
		this.bookService.create(b2);
		this.bookService.create(b3);


	}
}
