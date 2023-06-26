package com.epam.mjc.collections.combined;

import java.util.*;

public class DeveloperProjectFinder {
    public List<String> findDeveloperProject(Map<String, Set<String>> projects, String developer) {
        List<String> resultDeveloper = new ArrayList<>();
        for (Map.Entry<String, Set<String>> entry : projects.entrySet()) {
            String project = entry.getKey();
            Set<String> developers = entry.getValue();
            if (developers.contains(developer)) {
                resultDeveloper.add(project);
            }
        }

        resultDeveloper.sort((p1, p2) -> {
            int lengthComparison = Integer.compare(p2.length(), p1.length());
            if (lengthComparison != 0) {
                return lengthComparison;
            }
            return p2.compareTo(p1);
        });
        return resultDeveloper;
    }
}
