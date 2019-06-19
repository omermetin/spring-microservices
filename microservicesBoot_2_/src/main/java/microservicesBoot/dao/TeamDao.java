package microservicesBoot.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import microservicesBoot.domain.Team;

@RestController
@RequestMapping(value="/teams")
public interface TeamDao extends CrudRepository<Team, Long> {
	
	List<Team> findAll();
	
	Team findByName(String name);
}
