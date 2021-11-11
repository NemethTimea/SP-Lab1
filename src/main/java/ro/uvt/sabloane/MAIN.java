package ro.uvt.sabloane;

import ro.uvt.sabloane.models.*;
import ro.uvt.sabloane.services.BookStatistics;
import ro.uvt.sabloane.services.RenderContentVisitor;


public class MAIN {
        public static void main(String[] args) {
                Section cap1 = new Section("Capitolul 1");
                Paragraph p1 = new Paragraph("Paragraph 1");
                cap1.add(p1);
                Paragraph p2 = new Paragraph("Paragraph 2");
                cap1.add(p2);
                Paragraph p3 = new Paragraph("Paragraph 3");
                cap1.add(p3);
                Paragraph p4 = new Paragraph("Paragraph 4");
                cap1.add(p4);
                cap1.add(new ImageProxy("C:/Users/Nemeth Timea Sarah/Downloads/bmp.bmp"));
                cap1.add(new Image("C:/Users/Nemeth Timea Sarah/Downloads/valami2.jpg"));
                cap1.add(new Paragraph("Some text"));
                cap1.add(new Table("Table 1"));
                cap1.accept(new RenderContentVisitor());
                BookStatistics stats = new BookStatistics();
                cap1.accept(stats);
                stats.printStatistics();
        }
}