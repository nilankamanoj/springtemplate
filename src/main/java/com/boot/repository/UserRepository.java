package src.main.java.com.boot.repository;


import org.springframework.data.repository.CrudRepository;
import src.main.java.com.boot.model.User;

// This will be AUTO IMPLEMENTED by Spring into a Bean called userRepository
// CRUD refers Create, Read, Update, Delete

public interface UserRepository extends CrudRepository<User, Long> {

}