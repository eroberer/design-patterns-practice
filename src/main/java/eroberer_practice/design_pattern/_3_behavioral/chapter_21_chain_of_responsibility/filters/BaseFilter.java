package eroberer_practice.design_pattern._3_behavioral.chapter_21_chain_of_responsibility.filters;

public abstract class BaseFilter implements Filter {

    private Filter nextFilter;


    @Override
    public Filter linkFilter(Filter filter) {
        return this.nextFilter = filter;
    }

    @Override
    public void doFilter() {
        System.out.println("/----- RUN FILTER -----/");
        filter();
        System.out.println("/----- FINISH FILTER -----/");
        System.out.println();

        if (nextFilter != null) {
            nextFilter.doFilter();
        }
    }

    public abstract void filter();
}
