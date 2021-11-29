package se.sigmatechnology.codingdojo.usecase01.core;

public interface AgentRepository {

	Agent findByName(String agentName);

	void store(Agent agent);
}
