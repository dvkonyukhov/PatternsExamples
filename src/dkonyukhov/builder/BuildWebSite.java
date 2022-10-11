package dkonyukhov.builder;

public class BuildWebSite {

    public static void main(String[] args) {

        Director director = new Director();
        director.setWebsiteBuilder(new LandingWebSiteBuilder());
        Website website1 = director.buildWebsite();

        System.out.println(website1);

        director.setWebsiteBuilder(new EnterpriceWebsiteBuilder());
        Website website2 = director.buildWebsite();

        System.out.println(website2);
    }
}
