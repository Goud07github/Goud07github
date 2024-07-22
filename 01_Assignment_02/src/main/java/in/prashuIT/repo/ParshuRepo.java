package in.prashuIT.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import in.prashuIT.entity.Parshu;

public interface ParshuRepo extends JpaRepository<Parshu, Integer>{
	
}
