package brianpelinku.u5w1d4.services;

import brianpelinku.u5w1d4.entities.Bevande;
import brianpelinku.u5w1d4.exceptions.ValidationException;
import brianpelinku.u5w1d4.repositories.BevandeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BevandeService {
    @Autowired
    private BevandeRepository bevandeRepository;

    public void saveBevanda(Bevande nuovaBevanda){

        if(bevandeRepository.existsByNome(nuovaBevanda.getNome())) throw new ValidationException("La bevanda " + nuovaBevanda.getNome() + " esiste già!");

        bevandeRepository.save(nuovaBevanda);

    }

//    public List<Bevande> findAll(){}

//    public Bevande findById(long bevandaId){}

    public void findByIdAndDelete(long userId){}

    public void findByIdAndUpdate(long bevandaId, Bevande updateBevanda){}

}
