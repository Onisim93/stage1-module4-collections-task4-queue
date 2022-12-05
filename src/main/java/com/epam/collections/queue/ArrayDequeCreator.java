package com.epam.collections.queue;

import java.util.ArrayDeque;
import java.util.Objects;
import java.util.PriorityQueue;
import java.util.Queue;

public class ArrayDequeCreator extends PriorityQueue<String> {
    public ArrayDeque<Integer> createArrayDeque(Queue<Integer> firstQueue, Queue<Integer> secondQueue) {
        ArrayDeque<Integer> result = new ArrayDeque<>();
        result.offer(Objects.requireNonNull(firstQueue.poll()));
        result.offer(Objects.requireNonNull(firstQueue.poll()));
        result.offer(Objects.requireNonNull(secondQueue.poll()));
        result.offer(Objects.requireNonNull(secondQueue.poll()));


        while (firstQueue.size() > 0 || secondQueue.size() > 0) {
            firstQueue.offer(result.pollLast());
            result.offer(Objects.requireNonNull(firstQueue.poll()));
            result.offer(Objects.requireNonNull(firstQueue.poll()));

            secondQueue.offer(result.pollLast());
            result.offer(Objects.requireNonNull(secondQueue.poll()));
            result.offer(Objects.requireNonNull(secondQueue.poll()));

        }

        return result;
    }
}
