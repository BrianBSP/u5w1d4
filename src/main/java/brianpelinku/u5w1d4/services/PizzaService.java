package brianpelinku.u5w1d4.services;

import brianpelinku.u5w1d4.entities.Pizza;
import brianpelinku.u5w1d4.exceptions.ValidationException;
import brianpelinku.u5w1d4.repositories.PizzaRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Slf4j
@Service
public class PizzaService {
    @Autowired
    private PizzaRepository pizzaRepository;

    public void savePizza(Pizza nuovaPizza){

        if (pizzaRepository.existsByNome(nuovaPizza.getNome())) throw new ValidationException("La pizza " + nuovaPizza.getNome() + " è già nel menu e nel DB!");


        pizzaRepository.save(nuovaPizza);

        log.info("Nuova pizza {} salvata con successo!", nuovaPizza.getNome());


    }
}
