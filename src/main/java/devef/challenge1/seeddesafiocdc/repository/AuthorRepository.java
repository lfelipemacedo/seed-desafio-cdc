package devef.challenge1.seeddesafiocdc.repository;

import devef.challenge1.seeddesafiocdc.entity.Author;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AuthorRepository extends JpaRepository<Author, Long> {
}
