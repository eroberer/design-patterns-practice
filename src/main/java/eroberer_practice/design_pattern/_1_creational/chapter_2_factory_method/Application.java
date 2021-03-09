package eroberer_practice.design_pattern._1_creational.chapter_2_factory_method;

import eroberer_practice.design_pattern._1_creational.chapter_2_factory_method.documents.Document;
import eroberer_practice.design_pattern._1_creational.chapter_2_factory_method.documents.DocumentFactory;

public class Application {

    public static void main(String[] args) {
        Document pdfDocument = DocumentFactory.createDocument("PDF");
        System.out.println(pdfDocument.read());

        Document wordDocument = DocumentFactory.createDocument("Word");
        System.out.println(wordDocument.read());
    }
}
