package ro.uvt.sabloane.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import ro.uvt.sabloane.models.Author;
import ro.uvt.sabloane.models.Book;
import ro.uvt.sabloane.models.Paragraph;
import ro.uvt.sabloane.models.Subject;
import ro.uvt.sabloane.repositories.AuthorRepository;
import ro.uvt.sabloane.repositories.BookRepository;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/books")
public class BookController {
    private final BookRepository bookRepository;
    private final Subject subject;
    private final AuthorRepository authorRepository;

    @Autowired
    public BookController(BookRepository bookRepository, Subject subject, AuthorRepository authorRepository) {
        this.bookRepository = bookRepository;
        this.subject = subject;
        this.authorRepository = authorRepository;
    }

    @PostMapping()
    public Book post(@RequestBody PostBody postBody) {
        List<Author> authorList = postBody.authors.stream().map(name -> authorRepository.save(new Author(name))).collect(Collectors.toList());
        Book book = new Book(postBody.title);
        authorList.forEach(book::addAuthor);
        book.add(new Paragraph());
        Book book1 =  bookRepository.save(book);
        subject.add(book1);
        return book1;
    }
    public static class PostBody {
        public String title;
        public Collection<String> authors = new ArrayList<>();
    }

}