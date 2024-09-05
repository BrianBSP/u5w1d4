package brianpelinku.u5w1d4.repositories;

import brianpelinku.u5w1d4.entities.Topping;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ToppingRepository extends JpaRepository<Topping,Long> {


    boolean existsByNome(String nome);
}
