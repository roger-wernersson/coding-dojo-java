package se.sigmatechnology.codingdojo.usecase01.core;

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
}
