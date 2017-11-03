package pl.naczilku.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import pl.naczilku.model.Task;

@Repository
public interface TaskRepository extends JpaRepository<Task, Long> {

}
