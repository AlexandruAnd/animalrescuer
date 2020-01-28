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
        pet1.setFavoriteActivity("running");
        pet1.setAge(2);
        pet1.setFavoriteFood("milk");
        pet1.setHealthLevel(8);
        pet1.setHungerLevel(7);
        pet1.setMoodLevel(6);
        pet1.setName("Lessie");

        System.out.println("Numele este: " + pet1.getName());

        Owner owner1 = new Owner();
        owner1.setAvailableMoney(350.25);
        owner1.setName("Alex");



        Food dogFood = new Food();
        dogFood.setName("Dog Food");

        Food food = new Food(dogFood);
        food.setExpirationDate(LocalDate.now().plusDays(30));
        food.setName("Dog Food");
        food.setFoodPrice(18.5);
        food.setStock(138);

        System.out.println( "data exp : " + food.getExpirationDate());

        Vet vet1 = new Vet();
        vet1.setSpecialization("Doctor");
        vet1.setName("Jon");

        System.out.println("Numele veterinarului este : " + vet1.getName());

        Activity activity1 = new Activity();
        activity1.setName("running");

        System.out.println("Activitatea este : " + activity1.getName());



    }
}
