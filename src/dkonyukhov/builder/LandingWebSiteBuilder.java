package dkonyukhov.builder;

public class LandingWebSiteBuilder extends WebsiteBuilder{
    @Override
    void buildName() {
        website.setName("Landing");
    }

    @Override
    void buildCms() {
        website.setCms(CMS.JOOMLA);
    }

    @Override
    void buildPrice() {
        website.setPrice(1000);
    }
}
