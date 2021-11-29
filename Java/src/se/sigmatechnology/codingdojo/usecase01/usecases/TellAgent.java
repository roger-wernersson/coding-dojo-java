package se.sigmatechnology.codingdojo.usecase01.usecases;

import se.sigmatechnology.codingdojo.usecase01.core.Agent;
import se.sigmatechnology.codingdojo.usecase01.core.AgentRepository;
import se.sigmatechnology.codingdojo.usecase01.core.Secret;

/**
 * Use Case
 * @author rwe
 *
 */
public class TellAgent {

	private final String agentName;
	private final Secret secret;
	
	public TellAgent(String agentName, Secret secret) {
		this.agentName = agentName;
		this.secret = secret;
	}
	
	public void execute(AgentRepository repo) {
		Agent agent = repo.findByName(agentName);
		
		agent = agent.plusKnowledge(secret);
		
		repo.store(agent);
	}
}
