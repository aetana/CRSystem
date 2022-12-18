package miu.edu.app.repository;

import miu.edu.app.entity.Registration;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RegistrationRepo extends JpaRepository<Registration,Long> {
}
