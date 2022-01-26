package ro.uvt.sabloane.laboratory.Lab9.command;

import ro.uvt.sabloane.laboratory.Lab9.models.Book;

public class DocumentManager {
    private Book book = null;
    private static DocumentManager documentmanager = null;
    public Book getBook(){
        return book;
    }
    public void setBook(Book nbook){
        book = nbook;
    }
    public static DocumentManager getDocumentmanager(){
        if(documentmanager == null){
            documentmanager = new DocumentManager();
        }
        return documentmanager;
    }
}
