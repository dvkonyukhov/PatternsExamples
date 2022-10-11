package dkonyukhov.builder;

public class EnterpriceWebsiteBuilder extends WebsiteBuilder {
    @Override
    void buildName() {
        website.setName("Enterprice");
    }

    @Override
    void buildCms() {
        website.setCms(CMS.WORD_PRESS);
    }

    @Override
    void buildPrice() {
        website.setPrice(4000);
    }
}
