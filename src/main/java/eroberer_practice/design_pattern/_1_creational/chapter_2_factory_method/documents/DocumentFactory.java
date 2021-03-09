package eroberer_practice.design_pattern._1_creational.chapter_2_factory_method.documents;

public class DocumentFactory {

    public static Document createDocument(String documentType) {
        if ("PDF".equals(documentType)) {
            return new PDF();
        } else if ("Word".equals(documentType)) {
            return new Word();
        } else {
            throw new RuntimeException("Undefined Document Type!");
        }
    }
}
