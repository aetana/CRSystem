package miu.edu.app.repository;

import miu.edu.app.entity.RegistrationEvent;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RegistrationEventRepo extends JpaRepository<RegistrationEvent,Long> {
}
