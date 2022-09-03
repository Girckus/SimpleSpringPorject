package simple.spring.SimpleSpring.repository;

import org.springframework.data.repository.CrudRepository;

import simple.spring.SimpleSpring.domain.Book;

public interface BookRepository extends CrudRepository<Book, Long> {

}
