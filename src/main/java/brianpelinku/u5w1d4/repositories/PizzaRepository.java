package brianpelinku.u5w1d4.repositories;

import brianpelinku.u5w1d4.entities.Pizza;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PizzaRepository extends JpaRepository<Pizza,Long> {

    boolean existsByNome(String nome);
}
