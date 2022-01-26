//Command & Singleton
package ro.uvt.sabloane.laboratory.Lab9;

import ro.uvt.sabloane.laboratory.Lab9.command.*;
import ro.uvt.sabloane.laboratory.Lab9.models.*;
import ro.uvt.sabloane.laboratory.Lab9.services.*;

public class Lab9 {
    public static void main(String[] args) throws Exception {
//        Book cap1 = new Book("Capitolul 21");
//        cap1.addAuthor(new Author("Ioan Barbu"));
//        cap1.add(new TOC("Cuprinsul Mare"));
//        Paragraph p1 = new Paragraph("Paragraph 10");
//        cap1.add(p1);
//        Paragraph p2 = new Paragraph("Paragraph 20");
//        p2.setAlignStrategy(new AlignCenter());
//        cap1.add(p2);
//        Paragraph p3 = new Paragraph("Paragraph 30");
//        p3.setAlignStrategy(new AlignRight());
//        cap1.add(p3);
//        cap1.add(new Paragraph("Paragraph 40"));
//        cap1.add(new ImageProxy("C:/url/mare/lung/ceva1.jpg"));
//        cap1.add(new Image("C:/bingo/super/lung/ceva2.png"));
//        cap1.add(new Table("Tabloul miracol"));
//        cap1.add(new Paragraph("Inca un text ar veni aici."));
//        new JSONFileExporter(
//            "nouJSON.json",
//            new BookSaveVisitor()
//        ).exportToJSON(cap1);
//        cap1.accept(new BookSaveVisitor());

        Command cmd_open = new OpenCommand();
        cmd_open.execute();
        Command cmd_calc_stat = new StatisticsCommand();
        cmd_calc_stat.execute();
        Command cmd_save = new SaveCommand(DocumentManager.getDocumentmanager().getBook());
        DocumentManager.getDocumentmanager().getBook().add(new Image("C:/path/url/bumm.jpg"));
        cmd_calc_stat.execute();
        cmd_save.execute();
        DocumentManager.getDocumentmanager().getBook().accept(new RenderContentVisitor());
    }
}
