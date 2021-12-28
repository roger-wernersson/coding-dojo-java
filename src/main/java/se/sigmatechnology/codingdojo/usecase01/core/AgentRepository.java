package se.sigmatechnology.codingdojo.usecase01.core;

public interface AgentRepository {

	Agent findByName(AgentName agentName);

	void store(Agent agent);
}
