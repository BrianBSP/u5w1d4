package brianpelinku.u5w1d4.services;

import brianpelinku.u5w1d4.entities.Topping;
import brianpelinku.u5w1d4.exceptions.ValidationException;
import brianpelinku.u5w1d4.repositories.ToppingRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class ToppingService {
    @Autowired
    private ToppingRepository toppingRepository;

    public void saveTopping(Topping nuovoTopping){

        if(toppingRepository.existsByNome(nuovoTopping.getNome())) throw new ValidationException("Il Topping " + nuovoTopping.getNome() + " è già presente nel menu e nel DB!");

        toppingRepository.save(nuovoTopping);

        log.info("Il Topping {} é stato salvato correttamente!", nuovoTopping.getNome());
    }
}
