package brianpelinku.u5w1d4.runner;



import brianpelinku.u5w1d4.U5w1d4Application;
import brianpelinku.u5w1d4.entities.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Component;

@Component
public class MyRunner implements CommandLineRunner {

   /* @Autowired
    @Qualifier("tavolo1")
    private Tavolo tavolo;*/

    /*@Autowired
    private Ordine ordine;*/

    /*@Autowired
    private Menu menu;*/


    @Override
    public void run(String... args) throws Exception {

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(U5w1d4Application.class);


        /*tavolo.printTavolo();*/

        System.out.println("Ciao e benuvenuti \nRistoria Pizzorante se non vieni sei ignorante");
        /*menu.printMenu();*/

        /*Ordine ordine1 = new Ordine(3, this.tavolo);
        ordine1.aggiungiPizza(context.getBean("pizza_margherita", Pizza.class));
        ordine1.aggiungiPizza(context.getBean("pizza_prosciutto", Pizza.class));
        ordine1.aggiungiPizza(context.getBean("pizza_bufalotta", Pizza.class));
        ordine1.aggiungiBevanda(context.getBean("birra", Bevande.class));
        ordine1.aggiungiBevanda(context.getBean("vino", Bevande.class));
        ordine1.aggiungiBevanda(context.getBean("acqua_frizzante", Bevande.class));
        ordine1.printOrdine();*/

        //ordine.printOrdine();


    }


}
