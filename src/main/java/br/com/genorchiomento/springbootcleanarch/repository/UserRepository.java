package br.com.genorchiomento.springbootcleanarch.repository;

import br.com.genorchiomento.springbootcleanarch.model.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Long> {

}
