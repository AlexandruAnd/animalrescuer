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
        pet1.age = 2;
        pet1.favoriteActivity = "running";
        pet1.favoriteFood = "milk";
        pet1.healthLevel = 8;
        pet1.hungerLevel = 7;
        pet1.moodLevel = 6;
        pet1.pet_name = "Lessie";

        System.out.println("Numele este: " + pet1.pet_name);

        Owner owner1 = new Owner();
        owner1.availableMoney = 350.25;
        owner1.ownerName = "Alex";

        Food food1 = new Food();
        food1.expirationDate = LocalDate.now().plusDays(30);
        food1.foodName = "Dog Food";
        food1.foodPrice = 18.5;
        food1.stock = 138;

        System.out.println( "data exp : " + food1.expirationDate);

        Vet vet1 = new Vet();
        vet1.specialization = "Doctor";
        vet1.vetName = "Jon";

        System.out.println("Numele veterinarului este : " + vet1.vetName);

        Activity activity1 = new Activity();
        activity1.activityName = "running";

        System.out.println("Activitatea este : " + activity1.activityName);



    }
}
