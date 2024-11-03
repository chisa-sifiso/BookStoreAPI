package tut.library.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tut.library.model.Book;
import tut.library.repository.BookRepository;

import java.util.List;
import java.util.Optional;

@Service
public class BookService {
    private final BookRepository bookRepository;
@Autowired
    public BookService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public List<Book> getAllBooks(){
    return bookRepository.findAll();
    }

    public Optional<Book> getBookById(Long id){
    return bookRepository.findById(id);
    }
    public void addBook(Book b){
    bookRepository.save(b);
    }
    public void deleteBook(Long id) {
        bookRepository.deleteById(id);
    }
}
