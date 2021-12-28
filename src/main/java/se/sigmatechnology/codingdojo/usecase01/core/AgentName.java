package se.sigmatechnology.codingdojo.usecase01.core;

public class AgentName {

    public static final AgentName NONE = new NoAgentName();
    private final String text;

    public AgentName(String text) {
        this.text = text;
    }

    public boolean is(AgentName other) {
        return text.equals(other.text);
    }
}
