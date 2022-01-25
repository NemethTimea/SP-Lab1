package ro.uvt.sabloane.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import ro.uvt.sabloane.models.Paragraph;
import ro.uvt.sabloane.repositories.ParagraphRepository;

import java.util.List;

@RestController
@RequestMapping("/paragraphs")
public class ParagraphController {

    private final ParagraphRepository paragraphrepo;

    @Autowired
    public ParagraphController(ParagraphRepository paragraphrepo) {
        this.paragraphrepo = paragraphrepo;
    }

    @GetMapping("/getParagraphs")
    public ResponseEntity<List<Paragraph>>getParagraphs() {
        List<Paragraph> paragraphs = null;
        paragraphs = paragraphrepo.findAll();
        return new ResponseEntity<List<Paragraph>>(paragraphs, HttpStatus.OK);
    }

    @PostMapping("/addParagraph")
    public ResponseEntity<Paragraph> addParagraph(@RequestBody Paragraph paragraph) {
        Paragraph paragraph1 = null;

        try {
            paragraph1 = paragraphrepo.save(paragraph);
        } catch (Exception ex) {
            ex.getMessage();
        }
        return new ResponseEntity<Paragraph>(paragraph1, HttpStatus.OK);
    }

    @GetMapping("/error")
    public String error(){
        return "Error from Paragraph-Controller!";
    }
}
