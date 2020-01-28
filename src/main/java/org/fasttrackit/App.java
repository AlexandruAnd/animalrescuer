package org.fasttrackit;

import java.time.LocalDate;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Welcome to the Game" );

        Pet pet1 = new Pet();
        pet1.favoriteActivity = "running";
        pet1.favoriteFood = "milk";
        pet1.healthLevel = 8;
        pet1.hungerLevel = 7;
        pet1.moodLevel = 6;
        pet1.name = "Lessie";

        System.out.println("Numele este: " + pet1.name);

        Owner owner1 = new Owner();
        owner1.availableMoney = 350.25;
        owner1.name = "Alex";



        Food dogFood = new Food();
        dogFood.name = "Dog Food";

        Food food = new Food(dogFood);
        food.expirationDate = LocalDate.now().plusDays(30);
        food.name = "Dog Food";
        food.foodPrice = 18.5;
        food.stock = 138;

        System.out.println( "data exp : " + food.expirationDate);

        Vet vet1 = new Vet();
        vet1.specialization = "Doctor";
        vet1.name = "Jon";

        System.out.println("Numele veterinarului este : " + vet1.name);

        Activity activity1 = new Activity();
        activity1.name = "running";

        System.out.println("Activitatea este : " + activity1.name);



    }
}
