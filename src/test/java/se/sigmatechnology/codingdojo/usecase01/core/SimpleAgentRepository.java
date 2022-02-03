package se.sigmatechnology.codingdojo.usecase01.core;

public class SimpleAgentRepository implements AgentRepository {

  private final Agent[] agents;

  public SimpleAgentRepository(Agent... agents) {
    this.agents = agents;
  }

  @Override
  public Agent findByName(AgentName agentName) {
    for (var agent : agents) {
      if (agent.getName().is(agentName)) {
        return agent;
      }
    }
    return Agent.NONE;
  }

  @Override
  public void store(Agent changedAgent) {

    for (var i = 0; i < agents.length; i++) {
      var storedName = agents[i].getName();
      if (storedName.is(changedAgent.getName())) {
        agents[i] = changedAgent;
        return;
      }
    }
    throw new RuntimeException("add not implemented");
  }
}
