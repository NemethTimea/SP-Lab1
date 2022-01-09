package ro.uvt.sabloane.commands;
import ro.uvt.sabloane.models.Book;

public class DocumentManager {
    private static Book book = null;
    private static DocumentManager documentmanager = null;

    public static Book getBook(){
        return book;
    }
    public static void setBook(Book nbook){
        book = nbook;
    }
    public static DocumentManager getDocumentmanager(){
        if(documentmanager == null){
            documentmanager = new DocumentManager();
        }
        return documentmanager;
    }
}
