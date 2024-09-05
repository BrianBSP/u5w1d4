package brianpelinku.u5w1d4.runner;

import brianpelinku.u5w1d4.U5w1d4Application;
import brianpelinku.u5w1d4.entities.*;
import brianpelinku.u5w1d4.services.BevandeService;
import brianpelinku.u5w1d4.services.PizzaService;
import brianpelinku.u5w1d4.services.ToppingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class MyRunner implements CommandLineRunner {

    @Autowired
    private BevandeService bevandeService;

    @Autowired
    private PizzaService pizzaService;

    @Autowired
    private ToppingService toppingService;


    @Override
    public void run(String... args) throws Exception {

        Bevande drink = new Bevande("birra weiss", 300, 5);
        bevandeService.saveBevanda(drink);

        Topping toppingMozzarella = new Topping("mozzarella", 200,1.5);
        Topping toppingPomodoro = new Topping("pomodoro", 250,1.5);

        toppingService.saveTopping(toppingMozzarella);
        toppingService.saveTopping(toppingPomodoro);

        List<Topping> toppingList = new ArrayList<>();
        toppingList.add(toppingMozzarella);
        toppingList.add(toppingPomodoro);

        Pizza pizzaMargherita = new Pizza("Pizza Margherita", toppingList);

        pizzaService.savePizza(pizzaMargherita);

        System.out.println("Ciao e benvenuti \nRistoria Pizzorante se non vieni sei ignorante");

    }


}
