package ro.uvt.sabloane.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import ro.uvt.sabloane.models.Author;
import ro.uvt.sabloane.models.Table;
import ro.uvt.sabloane.repositories.TableRepository;

import java.util.List;

@RestController
@RequestMapping("/tables")
public class TableController {

    private final TableRepository tableRepository;

    @Autowired
    public TableController(TableRepository tableRepository) {
        this.tableRepository = tableRepository;
    }

    @GetMapping("/getTables")
    public ResponseEntity<List<Table>> getTable() {
        List<Table> tables = null;
        tables = tableRepository.findAll();
        return new ResponseEntity<List<Table>>(tables, HttpStatus.OK);
    }

    @PostMapping("/addTable")
    public ResponseEntity<Table> addTable(@RequestBody Table table) {
        Table table1 = null;

        try {
            table1 = tableRepository.save(table);
        } catch (Exception ex) {
            ex.getMessage();
        }
        return new ResponseEntity<Table>(table1, HttpStatus.OK);
    }

    @GetMapping("/error")
    public String error(){
        return "Error from Table-Controller!";
    }
}
