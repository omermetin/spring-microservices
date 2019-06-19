package microservicesBoot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import microservicesBoot.dao.TeamDao;
import microservicesBoot.domain.Team;

@RestController
public class WhateverIWant {
	
	@Autowired(required=true)
	TeamDao teamDao;
	
	@RequestMapping("/teams/{name}")
	public Team hiThere(@PathVariable String name) {
		return teamDao.findByName(name);
	}	
}
