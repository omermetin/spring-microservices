package microservicesBoot;

import java.util.HashSet;
import java.util.Set;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

import microservicesBoot.dao.TeamDao;
import microservicesBoot.domain.Player;
import microservicesBoot.domain.Team;

@SpringBootApplication
public class MicroservicesBootApplication extends SpringBootServletInitializer {

	public static void main(String[] args) {
		SpringApplication.run(MicroservicesBootApplication.class, args);
	}
	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
		return builder.sources(MicroservicesBootApplication.class);
	}
	
	
	
	@PostConstruct
	public void init() {
		Set<Player> players = new HashSet<>();
		players.add(new Player("Omer Metin", "forvet"));
		players.add(new Player("Mimar Aslan", "defans"));
		
		Team team = new Team("Kocaeli", "KocaeliSpor", players);
		teamDao.save(team);
	}
	@Autowired(required=true)
	TeamDao teamDao;
}
