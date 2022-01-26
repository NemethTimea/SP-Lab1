package ro.uvt.sabloane.laboratory.Lab9.command;

import ro.uvt.sabloane.laboratory.Lab9.models.Book;
import ro.uvt.sabloane.laboratory.Lab9.services.BookSaveVisitor;
import ro.uvt.sabloane.laboratory.Lab9.services.JSONFileExporter;

public class SaveCommand implements Command {
    Book attr_book;
    JSONFileExporter jsonFileExporter;

    public SaveCommand(Book book){
        attr_book = book;
        jsonFileExporter = new JSONFileExporter("nouJSON.json", new BookSaveVisitor());
    }

    @Override
    public void execute() {
        jsonFileExporter.exportToJSON(attr_book);
    }
}
