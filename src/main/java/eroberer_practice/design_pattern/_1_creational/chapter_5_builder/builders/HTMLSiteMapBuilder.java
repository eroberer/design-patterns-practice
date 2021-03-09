package eroberer_practice.design_pattern._1_creational.chapter_5_builder.builders;

import java.util.ArrayList;
import java.util.List;

public class HTMLSiteMapBuilder implements SiteMapBuilder {

    private String header;
    private String footer;
    private List<String> urls;

    public void buildHeader() {
        header = "<ul class=\"sitemap\">\n";
    }

    public void buildFooter() {
        footer = "</ul>\n";
    }

    @Override
    public void buildPage(String url) {
        if (urls == null) {
            urls = new ArrayList<>();
        }
        urls.add("<url>\n<loc>" + url + "<url>\n<loc>");
    }

    public String getSiteMap() {
        StringBuffer body = new StringBuffer();
        for (String url : urls) {
            body.append(url);
        }
        return header + body + footer;
    }
}
