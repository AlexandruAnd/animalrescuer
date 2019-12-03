package org.fasttrackit;

import java.time.LocalDate;

public class Food {

    String name;
    double foodPrice;
    int stock;
    LocalDate expirationDate;
   private Food food;

    public Food(Food food) {
        this.food = food;
    }


    public Food() {

    }
}
