package simple.spring.SimpleSpring.repository;

import org.springframework.data.repository.CrudRepository;

import simple.spring.SimpleSpring.domain.Publisher;

public interface PublisherRepository extends CrudRepository<Publisher, Long> {

}
