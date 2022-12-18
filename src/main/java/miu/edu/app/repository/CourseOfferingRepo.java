package miu.edu.app.repository;

import miu.edu.app.entity.CourseOffering;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseOfferingRepo extends JpaRepository<CourseOffering,Long> {
}
