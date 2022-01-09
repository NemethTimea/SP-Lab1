package ro.uvt.sabloane.commands;

import lombok.RequiredArgsConstructor;
import ro.uvt.sabloane.models.*;
@RequiredArgsConstructor

public class CreateSampleBookCommand implements Command{
    private final String bookName;
    private Book book;

    public Book getResult(){
        return book;
    }

    @Override
    public void execute() {
        book = new Book(bookName);
        Author rpGheo = new Author("Radu Pavel", "Gheo");
        book.addAuthor(rpGheo);
        Section cap1 = new Section("Capitolul 1");
        Section cap11 = new Section("Capitolul 1.1");
        Section cap111 = new Section("Capitolul 1.1.1");
        Section cap1111 = new Section("Subchapter 1.1.1.1");
        book.add(new Paragraph("Multumesc celor care ..."));
        book.add(cap1);
        cap1.add(new Paragraph("Moto capitol"));
        cap1.add(cap11);
        cap11.add(new Paragraph("Text from subchapter 1.1"));
    }
}
