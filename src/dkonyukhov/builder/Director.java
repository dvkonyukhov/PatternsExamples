package dkonyukhov.builder;

public class Director {
    WebsiteBuilder websiteBuilder;

    public void setWebsiteBuilder(WebsiteBuilder websiteBuilder){
        this.websiteBuilder = websiteBuilder;
    }

    Website buildWebsite(){
        websiteBuilder.createWebsite();
        websiteBuilder.buildName();
        websiteBuilder.buildPrice();
        websiteBuilder.buildCms();

        return websiteBuilder.getWebsite();
    }
}
