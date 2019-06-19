package microservicesBoot.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import microservicesBoot.domain.Team;

@RepositoryRestResource(path="teams")
public interface TeamDao extends CrudRepository<Team, Long> {
	
	List<Team> findAll();
	
	Team findByName(String name);
}
