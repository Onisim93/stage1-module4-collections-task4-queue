package com.epam.collections.queue;

import java.util.*;

public class PriorityQueueCreator {
    public PriorityQueue<String> createPriorityQueue(List<String> firstList, List<String> secondList) {
        PriorityQueue<String> result = new PriorityQueue<>((s1, s2) -> {
            boolean isLowerCaseS1 = Character.isLowerCase(s1.charAt(0));
            boolean isLowerCaseS2 = Character.isLowerCase(s2.charAt(0));

            if ((isLowerCaseS1 && isLowerCaseS2) || (!isLowerCaseS1 && !isLowerCaseS2)) return s2.compareTo(s1);
            return isLowerCaseS2 ? 1 : -1;
        });

        result.addAll(firstList);
        result.addAll(secondList);

        return result;

    }
}
