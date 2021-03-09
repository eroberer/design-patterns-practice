package eroberer_practice.design_pattern._3_behavioral.chapter_21_chain_of_responsibility.filters;

public class AuthFilter extends BaseFilter {

    @Override
    public void filter() {
        System.out.println("Checking HTTP header...");
    }
}
