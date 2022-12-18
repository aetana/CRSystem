package miu.edu.app.repository;

import miu.edu.app.entity.AcademicBlock;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AcademicRepo extends JpaRepository<AcademicBlock,Long> {
}
