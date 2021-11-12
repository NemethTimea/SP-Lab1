package ro.uvt.sabloane.models;

public interface Visitor<T> {
    T visitBook(Book book);
    T visitAuthor(Author author);
    T visitSection(Section section);
    T visitTableOfContents(TableOfContents tableofcontents);
    T visitParagraph(Paragraph paragraph);
    T visitImageProxy(ImageProxy imageproxy);
    T visitImage(Image image);
    T visitTable(Table chapter);
}
