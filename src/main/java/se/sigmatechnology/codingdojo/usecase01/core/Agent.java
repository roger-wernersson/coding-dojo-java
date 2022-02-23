package se.sigmatechnology.codingdojo.usecase01.core;

import se.sigmatechnology.codingdojo.usecase01.usecases.Goal;

public interface Agent {

    Agent NONE = new NoAgent();

    Agent plusKnowledge(Secret secret);

    Knowledge knowledgeFromSubject(Subject subject);

    AgentName getName();

    Agent plusGoal(Goal goal);

    boolean hasGoal(Goal goal);
}
