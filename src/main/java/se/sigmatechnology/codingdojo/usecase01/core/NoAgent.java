package se.sigmatechnology.codingdojo.usecase01.core;

import se.sigmatechnology.codingdojo.usecase01.usecases.Goal;

public class NoAgent implements Agent {

    @Override
    public Agent plusKnowledge(Secret secret) {
        return this;
    }

    @Override
    public Knowledge knowledgeFromSubject(Subject subject) {
        return Knowledge.NONE;
    }

    @Override
    public AgentName getName() {
        return AgentName.NONE;
    }

    @Override
    public Agent plusGoal(Goal goal) {
        return this;
    }

    @Override
    public boolean hasGoal(Goal goal) {
        return false;
    }
}
