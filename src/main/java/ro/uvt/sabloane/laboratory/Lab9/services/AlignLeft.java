package ro.uvt.sabloane.laboratory.Lab9.services;

import ro.uvt.sabloane.laboratory.Lab9.models.Context;
import ro.uvt.sabloane.laboratory.Lab9.models.Paragraph;

import java.util.ArrayList;
import java.util.List;

public class AlignLeft implements AlignStrategy {
    public String left(String line, int nr_char_in_line){
        return String.format("%-" + nr_char_in_line + "s" , line);
    }

    public String render(Paragraph paragraph, Context context){
        String text = paragraph.getParagraph();
        Integer number_char_on_line = context.getNrWordOnLine();
        String[] text_splited = text.split(" ");
        String final_edited_text = "";
        List<String> new_text = new ArrayList<>();
        List<String> line = new ArrayList<>();
        int nr_char_in_line = 0;
        for (String word: text_splited){
            if (nr_char_in_line + word.length() < number_char_on_line){
                line.add(word);
                nr_char_in_line = nr_char_in_line + word.length();
            }
            else{
                new_text.add(left(String.join(" ",line) + "\n", number_char_on_line));
                line = new ArrayList<>();
                line.add(word);
                nr_char_in_line = word.length();
            }
        }
        if (line.size() > 0){
            new_text.add(left(String.join(" ",line), number_char_on_line));
        }
        final_edited_text = String.join(" ",new_text);
        return final_edited_text;
    }
}
