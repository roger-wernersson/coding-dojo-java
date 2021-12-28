package se.sigmatechnology.codingdojo.usecase01.core;

public interface Agent {

    Agent NONE = new NoAgent();

    Agent plusKnowledge(Secret secret);

    Knowledge knowledgeFromSubject(Subject subject);

    AgentName getName();
}
