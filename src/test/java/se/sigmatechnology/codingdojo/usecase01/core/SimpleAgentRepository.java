package se.sigmatechnology.codingdojo.usecase01.core;

public class SimpleAgentRepository implements AgentRepository {

    private final Agent[] agents;

    public SimpleAgentRepository(Agent... agents) {
        this.agents = agents;
    }

    @Override
    public Agent findByName(AgentName agentName) {
        for(var agent : agents) {
            if (agent.getName().is(agentName)) {
                return agent;
            }
        }
        return Agent.NONE;
    }

    @Override
    public void store(Agent agent) {
        throw new RuntimeException("not implemented");
    }
}
