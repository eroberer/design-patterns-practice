package eroberer_practice.design_pattern._3_behavioral.chapter_21_chain_of_responsibility.filters;

public interface Filter {

    Filter linkFilter(Filter filter);

    void doFilter();
}
