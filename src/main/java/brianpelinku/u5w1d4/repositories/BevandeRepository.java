package brianpelinku.u5w1d4.repositories;

import brianpelinku.u5w1d4.entities.Bevande;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BevandeRepository extends JpaRepository<Bevande, Long> {

    boolean existsByNome(String nome);

}
