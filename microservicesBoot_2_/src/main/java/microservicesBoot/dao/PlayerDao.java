package microservicesBoot.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import microservicesBoot.domain.Player;

@RestController
@RequestMapping(value="/players")
public interface PlayerDao extends CrudRepository<Player, Long> {

}
