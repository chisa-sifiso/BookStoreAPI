package tut.library.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tut.library.model.Book;

@Repository
public interface BookRepository extends JpaRepository<Book,Long> {
}
