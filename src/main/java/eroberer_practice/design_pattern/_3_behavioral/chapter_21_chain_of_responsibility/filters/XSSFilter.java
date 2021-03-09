package eroberer_practice.design_pattern._3_behavioral.chapter_21_chain_of_responsibility.filters;

public class XSSFilter extends BaseFilter {

    @Override
    public void filter() {
        System.out.println("Cleaning scripting characters..");
    }
}
