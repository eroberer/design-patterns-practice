package eroberer_practice.design_pattern._1_creational.chapter_5_builder.builders;

import java.util.List;

public class SiteMapDirector {

    private final SiteMapBuilder siteMapBuilder;

    public SiteMapDirector(SiteMapBuilder siteMapBuilder) {
        this.siteMapBuilder = siteMapBuilder;
    }

    public void construct(List<String> urlList) {
        siteMapBuilder.buildHeader();

        for (String url : urlList) {
            siteMapBuilder.buildPage(url);
        }

        siteMapBuilder.buildFooter();
    }
}
