package se.sigmatechnology.codingdojo.usecase01.usecases;

import se.sigmatechnology.codingdojo.usecase01.core.Agent;
import se.sigmatechnology.codingdojo.usecase01.core.AgentName;
import se.sigmatechnology.codingdojo.usecase01.core.AgentRepository;

public class InstructAgent {

  private final AgentName agentName;
  private final Goal goal;

  public InstructAgent(AgentName name, Goal goal) {
    this.agentName = name;
    this.goal = goal;
  }

  public void execute(AgentRepository repo) {
    Agent agent = repo.findByName(agentName);

    agent = agent.plusGoal(goal);

    repo.store(agent);
  }
}
