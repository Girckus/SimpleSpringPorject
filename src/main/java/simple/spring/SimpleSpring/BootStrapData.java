package simple.spring.SimpleSpring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import simple.spring.SimpleSpring.domain.Author;
import simple.spring.SimpleSpring.domain.Book;
import simple.spring.SimpleSpring.domain.Publisher;
import simple.spring.SimpleSpring.repository.AuthorRepository;
import simple.spring.SimpleSpring.repository.BookRepository;
import simple.spring.SimpleSpring.repository.PublisherRepository;

@Component
public class BootStrapData implements ApplicationRunner {

	@Autowired
	private AuthorRepository authorRepository;
	
	@Autowired
	private BookRepository bookRepository;
	
	@Autowired
	private PublisherRepository publisherRepository;
	
	public void run(ApplicationArguments args) throws Exception {
		
		Author author1 = new Author("Teste", "Testado");
		Author author2 = new Author("Testinho", "Testão");
		Author author3 = new Author("Testoso", "Testodo");
		
		Book book1 = new Book("Book 1", "1234");
		Book book2 = new Book("Book 2", "5678");
		
		Publisher publisher1 = new Publisher("Publisher", "address", "state", "city", "zip");
		
		publisherRepository.save(publisher1);
		
		book1.getAuthors().add(author1);
		book1.getAuthors().add(author2);
		book2.getAuthors().add(author3);
		author1.getBooks().add(book1);
		author2.getBooks().add(book1);
		author3.getBooks().add(book2);
		publisher1.getBooks().add(book1);
		publisher1.getBooks().add(book2);
		book1.setPublisher(publisher1);
		book2.setPublisher(publisher1);
		
		authorRepository.save(author1);
		authorRepository.save(author2);
		authorRepository.save(author3);
		
		bookRepository.save(book1);
		bookRepository.save(book2);
	}
	
}