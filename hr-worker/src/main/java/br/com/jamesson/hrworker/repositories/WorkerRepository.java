package br.com.jamesson.hrworker.repositories;

import br.com.jamesson.hrworker.entities.Worker;
import org.springframework.data.jpa.repository.JpaRepository;

public interface WorkerRepository extends JpaRepository<Worker, Long> {

}
