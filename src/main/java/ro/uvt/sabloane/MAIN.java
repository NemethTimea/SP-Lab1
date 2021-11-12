package ro.uvt.sabloane;

import ro.uvt.sabloane.models.*;
import ro.uvt.sabloane.services.BookSaveVisitor;
import ro.uvt.sabloane.services.BookStatistics;
import ro.uvt.sabloane.services.JSONFileExporter;
import ro.uvt.sabloane.services.RenderContentVisitor;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;


public class MAIN {
        public static void main(String[] args) {
                Book book = new Book("Titlul povestii deschise");
                book.addAuthor(new Author("Stoian", "Ionica"));
                book.addAuthor(new Author("Mircea", "Daniel"));
                book.addAuthor(new Author("Ion", "Barbu"));
                book.addAuthor(new Author("Andreea", "Dumitru"));
                Table table = new Table("Tabloul miracol");
                ImageProxy imgproxy = new ImageProxy("acel/url/lung/care/face_minuni.img");
                book.add(table);
                book.add(imgproxy);
                Paragraph p1 = new Paragraph("Paragraph 1");
                book.add(p1);
                Paragraph p2 = new Paragraph("Paragraph 2");
                book.add(p2);
                Paragraph p3 = new Paragraph("Paragraph 3");
                book.add(p3);
                Paragraph p4 = new Paragraph("Paragraph 4");
                book.add(p4);
                Collection<Author> authors = new LinkedList<Author>();
                book.add(new ImageProxy("C:/Users/Nemeth Timea Sarah/Downloads/bmp.bmp"));
                book.add(new Image("C:/Users/Nemeth Timea Sarah/Downloads/valami2.jpg"));
                book.add(new Paragraph("Some text"));
                book.add(new Table("Table 1"));
//                cap1.accept(new RenderContentVisitor());
//                BookStatistics stats = new BookStatistics();
//                cap1.accept(stats);
//                stats.printStatistics();
                new JSONFileExporter(
                        "JSON_Magic.json",
                        new BookSaveVisitor()
                ).exportToJSON(book);
        }
}