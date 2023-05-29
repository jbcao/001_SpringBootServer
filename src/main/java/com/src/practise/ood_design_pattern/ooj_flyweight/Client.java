package com.src.practise.ood_design_pattern.ooj_flyweight;

public class Client {
    public static void main(String[] args) {
        WebSiteFactory factory  = new WebSiteFactory();

        WebSite webSite= factory.getWebSiteCategory("新闻");
        webSite.use(new User("tom"));

        WebSite webSite2 = factory.getWebSiteCategory("博客");
        webSite2.use(new User("timmy"));

        WebSite webSite3 = factory.getWebSiteCategory("博客");
        webSite3.use(new User("tidy"));

        System.out.println("网站分类共"+factory.getWebSizeCount());
    }
}
