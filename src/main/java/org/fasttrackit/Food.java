package org.fasttrackit;

import java.time.LocalDate;

public class Food {

    String foodName;
    double foodPrice;
    int stock;
    LocalDate expirationDate = LocalDate.now().plusDays(30);
}
