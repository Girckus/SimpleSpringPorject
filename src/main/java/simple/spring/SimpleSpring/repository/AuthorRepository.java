package simple.spring.SimpleSpring.repository;

import org.springframework.data.repository.CrudRepository;

import simple.spring.SimpleSpring.domain.Author;

public interface AuthorRepository extends CrudRepository<Author, Long> {

}
