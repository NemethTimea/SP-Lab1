package ro.uvt.sabloane.models;

public interface Visitor {
    void visitBook(Book book);
    void visitAuthor(Author author);
    void visitSection(Section section);
    void visitTableOfContents(TableOfContents tableofcontents);
    void visitParagraph(Paragraph paragraph);
    void visitImageProxy(ImageProxy imageproxy);
    void visitImage(Image image);
    void visitTable(Table chapter);
}
