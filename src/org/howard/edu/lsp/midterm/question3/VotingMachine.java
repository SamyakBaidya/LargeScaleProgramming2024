package org.howard.edu.lsp.midterm.question3;

import java.util.HashMap;
import java.util.Map;

/**
 * A simple voting machine that tracks candidates and their votes.
 * 
 * @version 1.0
 */
public class VotingMachine {

    private Map<String, Integer> candidates = new HashMap<>();

    /**
     * Adds a candidate to the voting machine.
     * 
     * @param name The name of the candidate.
     */
    public void addCandidate(String name) {
        candidates.put(name, 0);
    }

    /**
     * Casts a vote for a candidate.
     * 
     * @param name The name of the candidate.
     */
    public void castVote(String name) {
        if (candidates.containsKey(name)) {
            candidates.put(name, candidates.get(name) + 1);
        }
    }

    /**
     * Returns a string representation of the candidates and their votes.
     * 
     * @return A string showing the votes received by each candidate.
     */
    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        for (Map.Entry<String, Integer> entry : candidates.entrySet()) {
            result.append(entry.getKey()).append(": ").append(entry.getValue()).append(" votes\n");
        }
        return result.toString();
    }
}
