package eroberer_practice.design_pattern._3_behavioral.chapter_16_iterator;

public class Application {

    public static void main(String[] args) {

        List nameList = new ArrayList();
        nameList.add("Kayra Han");
        nameList.add("Erlik Han");

        Iterator iterator = nameList.getIterator();

        while (iterator.hasNext()) {
            String name = (String) iterator.next();
            System.out.println(name);
        }
    }
}
