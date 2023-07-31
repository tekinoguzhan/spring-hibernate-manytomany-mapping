package com.otekin.dev;

import com.otekin.dev.model.Author;
import com.otekin.dev.model.Book;
import com.otekin.dev.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.HashSet;
import java.util.Set;

@SpringBootApplication
public class Application implements CommandLineRunner {
	@Autowired
    BookRepository bookRepository;

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// Insert dummy datas
		Book book = new Book();
		Set<Author> authorList = new HashSet<>();
		Author author1 = new Author();
		author1.setFirstName("Oguz");
		author1.setLastName("tekin");
		authorList.add(author1);
		book.setAuthors(authorList);
		book.setIsbn("23423dfd");
		book.setPublisher("otekin");
		book.setTitle("Java");
		bookRepository.save(book);

	}
}
