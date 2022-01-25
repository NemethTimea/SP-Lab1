package ro.uvt.sabloane.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import ro.uvt.sabloane.models.Author;
import ro.uvt.sabloane.models.TableOfContents;
import ro.uvt.sabloane.repositories.TOCRepository;

import java.util.List;

@RestController
@RequestMapping("/tocs")
public class TOCController {
    private final TOCRepository tocRepository;

    @Autowired
    public TOCController(TOCRepository tocRepository) {
        this.tocRepository = tocRepository;
    }

    @GetMapping("/getTOC")
    public ResponseEntity<List<TableOfContents>> getTOC() {
        List<TableOfContents> toc = null;
        toc = tocRepository.findAll();
        return new ResponseEntity<List<TableOfContents>>(toc, HttpStatus.OK);
    }

    @PostMapping("/addTOC")
    public ResponseEntity<TableOfContents> addTOC(@RequestBody TableOfContents toc) {
        TableOfContents toc1 = null;

        try {
            toc1 = tocRepository.save(toc);
        } catch (Exception ex) {
            ex.getMessage();
        }
        return new ResponseEntity<TableOfContents>(toc1, HttpStatus.OK);
    }
    @GetMapping("/error")
    public String error(){
        return "Error from TableOfContents-Controller!";
    }
}
