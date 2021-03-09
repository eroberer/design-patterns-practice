package eroberer_practice.design_pattern._3_behavioral.chapter_21_chain_of_responsibility;

import eroberer_practice.design_pattern._3_behavioral.chapter_21_chain_of_responsibility.filters.AuthFilter;
import eroberer_practice.design_pattern._3_behavioral.chapter_21_chain_of_responsibility.filters.Filter;
import eroberer_practice.design_pattern._3_behavioral.chapter_21_chain_of_responsibility.filters.XSSFilter;

public class Application {

    public static void main(String[] args) {
        Filter filter = new XSSFilter();

        filter
                .linkFilter(new AuthFilter())
                .linkFilter(new XSSFilter());

        filter.doFilter();
    }
}
