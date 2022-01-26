package ro.uvt.sabloane.laboratory.Lab9.command;

import ro.uvt.sabloane.laboratory.Lab9.services.BookStatistics;

public class StatisticsCommand implements Command {
    @Override
    public void execute() {
        BookStatistics bookStatisticsVisitor = new BookStatistics();
        bookStatisticsVisitor.visitBook(DocumentManager.getDocumentmanager().getBook());
        bookStatisticsVisitor.printStatistics();
    }
}
