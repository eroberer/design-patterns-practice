package eroberer_practice.design_pattern._1_creational.chapter_5_builder;

import eroberer_practice.design_pattern._1_creational.chapter_5_builder.builders.GoogleSiteMapBuilder;
import eroberer_practice.design_pattern._1_creational.chapter_5_builder.builders.HTMLSiteMapBuilder;
import eroberer_practice.design_pattern._1_creational.chapter_5_builder.builders.SiteMapBuilder;
import eroberer_practice.design_pattern._1_creational.chapter_5_builder.builders.SiteMapDirector;
import eroberer_practice.design_pattern._1_creational.chapter_5_builder.fluent_interface.PizzaBuilder;

import java.util.ArrayList;
import java.util.List;

public class Application {

    public static void main(String[] args) {
        List<String> urlList = new ArrayList<>();
        urlList.add("www.google.com");
        urlList.add("www.github.com");
        urlList.add("www.twitter.com");

        // Google SiteMap Builde
        SiteMapBuilder googleSiteMapBuilder = new GoogleSiteMapBuilder();

        SiteMapDirector siteMapDirector = new SiteMapDirector(googleSiteMapBuilder);
        siteMapDirector.construct(urlList);

        String googleSiteMap = googleSiteMapBuilder.getSiteMap();
        System.out.println(googleSiteMap);

        // HTML SiteMap Builder
        SiteMapBuilder htmlSiteMapBuilder = new HTMLSiteMapBuilder();

        SiteMapDirector siteMapDirector2 = new SiteMapDirector(htmlSiteMapBuilder);
        siteMapDirector2.construct(urlList);

        String htmlSiteMap = htmlSiteMapBuilder.getSiteMap();
        System.out.println(htmlSiteMap);


        // Fluent Interface

        PizzaBuilder pizza = PizzaBuilder.builder()
                .withCheese().withVegetable()
                .addSauce("tomato").addSauce("BBQ")
                .build();
    }
}
