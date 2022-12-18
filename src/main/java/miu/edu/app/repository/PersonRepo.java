package miu.edu.app.repository;

import miu.edu.app.entity.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRepo extends JpaRepository<Person,Long> {
}
