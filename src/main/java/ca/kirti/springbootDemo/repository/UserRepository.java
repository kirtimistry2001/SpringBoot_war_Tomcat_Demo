package ca.kirti.springbootDemo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ca.kirti.springbootDemo.entity.User;

@Repository
public interface UserRepository  extends JpaRepository<User, Integer>{

}
