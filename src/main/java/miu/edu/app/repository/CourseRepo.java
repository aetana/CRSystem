package miu.edu.app.repository;

import miu.edu.app.entity.Course;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseRepo extends JpaRepository<Course,Long> {
}
