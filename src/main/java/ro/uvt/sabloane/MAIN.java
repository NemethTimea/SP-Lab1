package ro.uvt.sabloane;

public class MAIN {
        //        public static void main(String[] args) throws Exception {
//                Section cap1 = new Section("Capitolul 1");
//                Paragraph p1 = new Paragraph("Paragraph 1 aaaaa bbb cccc, ddd eeee fff ggg eeee hh");
//                cap1.add(p1);
//                Paragraph p2 = new Paragraph("Paragraph 2 aaaaa bbb cccc, ddd eeee fff ggg eeee hh");
//                cap1.add(p2);
//                Paragraph p3 = new Paragraph("Paragraph 3 aaaaa bbb cccc, ddd eeee fff ggg eeee hh");
//                cap1.add(p3);
//                Paragraph p4 = new Paragraph("Paragraph 4 aaaaa bbb cccc, ddd eeee fff ggg eeee hh");
//                cap1.add(p4);
//                System.out.println("Printing without Alignment");
//                System.out.println();
////                cap1.print();
//                System.out.println("Right: ");
//                p2.setAlignStrategy(new AlignRight());
//                p2.print();
//                System.out.println("Center: ");
//                p1.setAlignStrategy(new AlignCenter());
//                p1.print();
//                System.out.println("Left: ");
//                p3.setAlignStrategy(new AlignLeft());
//                p3.print();
//
//        }
        public static void main(String[] args) {
//                long startTime = System.currentTimeMillis();
                ImageProxy img1 = new ImageProxy("C:/Users/Nemeth Timea Sarah/Downloads/bmp.bmp");
                ImageProxy img2 = new ImageProxy("C:/Users/Nemeth Timea Sarah/Downloads/valami2.jpg");
//                ImageProxy img3 = new ImageProxy("C:/Users/Nemeth Timea Sarah/Downloads/png.png");
                Section playboyS1 = new Section("Front Cover");
                playboyS1.add(img1);
                Section playboyS2 = new Section("Summer Girls");
                playboyS2.add(img2);
//                playboyS2.add(img3);
                Book playboy = new Book("Playboy");

                playboy.add(playboyS1);
                playboy.add(playboyS2);
                playboy.print();

//                long endTime = System.currentTimeMillis();
//                System.out.println("Creation of the content took " + (endTime -
//                        startTime) + " milliseconds");
//                startTime = System.currentTimeMillis();
//                playboyS1.print();
//                playboyS2.print();
//                endTime = System.currentTimeMillis();
//                System.out.println("Printing of the section 1 and 2 took " + (endTime -
//                        startTime) + " milliseconds");
//                startTime = System.currentTimeMillis();
//                playboyS1.print();
//                endTime = System.currentTimeMillis();
//                System.out.println("Printing again the section 1 took " + (endTime -
//                        startTime) + " milliseconds");
//                startTime = System.currentTimeMillis();
//                playboyS1.print();
//                playboyS2.print();
//                endTime = System.currentTimeMillis();
//                System.out.println("Printing of the section 1 and 2 after loading took " + (endTime -
//                        startTime) + " milliseconds");
        }
}