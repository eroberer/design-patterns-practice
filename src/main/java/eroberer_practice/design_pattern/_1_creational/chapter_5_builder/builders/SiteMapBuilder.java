package eroberer_practice.design_pattern._1_creational.chapter_5_builder.builders;

public interface SiteMapBuilder {

    void buildHeader();

    void buildFooter();

    void buildPage(String url);

    String getSiteMap();
}
