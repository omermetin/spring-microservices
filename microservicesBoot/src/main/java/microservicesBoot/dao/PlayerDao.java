package microservicesBoot.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import microservicesBoot.domain.Player;

@RepositoryRestResource(path="players")
public interface PlayerDao extends CrudRepository<Player, Long> {

}
