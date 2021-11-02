package ro.uvt.sabloane;

import java.util.ArrayList;
import java.util.List;

public class AlignCenter implements AlignStrategy{

    public void render(Paragraph paragraph, Context context){
        String text = paragraph.getText();
        Integer number_word_on_line = context.getNrWordOnLine();
        String[] text_splited = text.split(" ");
        String final_edited_text = "";
        List<String> new_text = new ArrayList<>();
        List<String> line = new ArrayList<>();
        int count = 0;
        line.add("   ");
        for (String word: text_splited){
            if (count == text_splited.length - 1){
                line.add(text_splited[count]);
                line.add("     ");
                new_text.add(String.join(" ",line));
            }
            if (count % number_word_on_line == 0){
                line.add("     \n");
                new_text.add(String.join(" ",line));
                line = new ArrayList<>();
                line.add("     ");
            }
            line.add(word);
            count++;
        }
        final_edited_text = String.join(" ",new_text);
        paragraph.setText(final_edited_text);
//        System.out.println(final_edited_text);
    }
}
