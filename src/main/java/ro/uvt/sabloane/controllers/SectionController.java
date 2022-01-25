package ro.uvt.sabloane.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import ro.uvt.sabloane.models.Author;
import ro.uvt.sabloane.models.Section;
import ro.uvt.sabloane.repositories.SectionRepository;

import java.util.List;

@RestController
@RequestMapping("/sections")
public class SectionController {

    private final SectionRepository sectionRepository;

    @Autowired
    public SectionController(SectionRepository sectionRepository) {
        this.sectionRepository = sectionRepository;
    }

    @GetMapping("/getSections")
    public ResponseEntity<List<Section>> getSections() {
        List<Section> sections = null;
        sections = sectionRepository.findAll();
        return new ResponseEntity<List<Section>>(sections, HttpStatus.OK);
    }

    @PostMapping("/addSection")
    public ResponseEntity<Section> addSection(@RequestBody Section section) {
        Section section1 = null;

        try {
            section1 = sectionRepository.save(section);
        } catch (Exception ex) {
            ex.getMessage();
        }
        return new ResponseEntity<Section>(section1, HttpStatus.OK);
    }
}
