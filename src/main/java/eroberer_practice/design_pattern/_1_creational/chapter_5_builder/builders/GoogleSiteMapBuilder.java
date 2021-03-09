package eroberer_practice.design_pattern._1_creational.chapter_5_builder.builders;

import java.util.ArrayList;
import java.util.List;

public class GoogleSiteMapBuilder implements SiteMapBuilder {

    private String header;
    private List<String> urls;
    private String footer;

    @Override
    public void buildHeader() {
        header = "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n"
                + "<urlset xmlns=\"http://www.sitemaps.org/schemas/sitemap/0.9\">\n";
    }

    @Override
    public void buildFooter() {
        footer = "</urlset>\n</xml>\n";
    }

    @Override
    public void buildPage(String url) {
        if (urls == null) {
            urls = new ArrayList<>();
        }
        urls.add("<url>\n<loc>" + url + "<url>\n<loc>");
    }

    @Override
    public String getSiteMap() {
        StringBuffer body = new StringBuffer();
        for (String url : urls) {
            body.append(url);
        }
        return header + body.toString() + footer;
    }
}
