package ro.uvt.sabloane.services;

import ro.uvt.sabloane.models.*;

import javax.swing.*;
import java.awt.image.BufferedImage;

public class RenderContentVisitor implements Visitor {

    @Override
    public void visitBook(Book book) {
        System.out.println("Book: " + book.getTitle());
        for (Author a : book.getAuthors()){
            a.accept(this);
        }
        for (Element e : book.getElements()){
            ((Visitee)e).accept(this);
        }
    }

    @Override
    public void visitAuthor(Author author) {
        System.out.println("Author: " + author.getName() + " " + author.getSurname());
    }

    @Override
    public void visitSection(Section section) {
        for (Element e : section.getElements()){
            ((Visitee)e).accept(this);
        }
    }

    @Override
    public void visitTableOfContents(TableOfContents tableofcontents) {

    }

    @Override
    public void visitParagraph(Paragraph paragraph) {
        System.out.println(paragraph.getAlignStrategy().render(paragraph,paragraph.getContext()));
    }

    @Override
    public void visitImageProxy(ImageProxy imageproxy) {
        imageproxy.loadImage().accept(this);
    }

    @Override
    public void visitImage(Image image) {
        BufferedImage buffered_img = image.content().getBufferedImage();
        if (buffered_img != null){
            JLabel picLabel = new JLabel(new ImageIcon(buffered_img));
            JPanel jPanel = new JPanel();
            jPanel.add(picLabel);
            JFrame f = new JFrame();
            f.setSize(new Dimension(buffered_img.getWidth(), buffered_img.getHeight()));
            f.add(jPanel);
            f.setVisible(true);
        }
    }

    @Override
    public void visitTable(Table table) {
        System.out.println("Table with Title: " + table.getName());
    }
}
