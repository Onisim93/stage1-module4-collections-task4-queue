package com.epam.collections.queue;

import java.util.*;

public class DishOrderDeterminer {
    public List<Integer> determineDishOrder(int numberOfDishes, int everyDishNumberToEat) {
        List<Integer> result = new ArrayList<>();
        Deque<Integer> dishes = new ArrayDeque<>();

        for (int i=numberOfDishes; i>0;i--) {
            dishes.offerFirst(i);
        }

        int counter = everyDishNumberToEat * numberOfDishes + numberOfDishes;

        while (counter > numberOfDishes) {
            if (counter % everyDishNumberToEat == 0) {
                result.add(dishes.poll());
            }
            else {
                if (dishes.size() > 1) {
                    int i = dishes.poll();
                    dishes.offer(i);
                }
            }
            counter--;
        }

        return result;
    }
}
