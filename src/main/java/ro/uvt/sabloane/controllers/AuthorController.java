package ro.uvt.sabloane.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import ro.uvt.sabloane.models.Author;
import ro.uvt.sabloane.repositories.AuthorRepository;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/authors")
public class AuthorController {

    private final AuthorRepository authorRepository;

    @Autowired
    public AuthorController(AuthorRepository authorRepository) {
        this.authorRepository = authorRepository;
    }

    @GetMapping("/getAuthors")
    public ResponseEntity<List<Author>> getAuthors() {
        List<Author> authors = null;
        authors = authorRepository.findAll();
        return new ResponseEntity<List<Author>>(authors, HttpStatus.OK);
    }

    @PostMapping("/addNewAuthor")
    public ResponseEntity<Author> addAuthor(@RequestBody Author author) {
        Author author1 = null;

        try {
            author1 = authorRepository.save(author);
        } catch (Exception ex) {
            ex.getMessage();
        }
        return new ResponseEntity<Author>(author1, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Author> getAuthorById(@PathVariable Integer id) {
        Optional<Author> author = authorRepository.findById(id);
        return author.map(a ->
                new ResponseEntity(a, HttpStatus.OK) ).orElse(new ResponseEntity(HttpStatus.NOT_FOUND));
    }

    @GetMapping("/error")
    public String error(){
        return "Error from Section-Controller!";
    }
}
