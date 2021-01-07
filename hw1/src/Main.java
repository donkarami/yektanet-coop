public class Main {
    public static void main(String[] args) {
        BaseAdvertising baseAdvertising = new BaseAdvertising();
        Advertiser advertiser1 = new Advertiser(1, "name1");
        Advertiser advertiser2 = new Advertiser(2, "name2");
        Ad ad1 = new Ad(1, "title1", "img-url1", "link1", advertiser1);
        Ad ad2 = new Ad(2, "title2", "img-url2", "link2", advertiser2);
        System.out.println("describing of BaseAdvertising Class: " + baseAdvertising.describeMe());
        System.out.println("describing of Ad Class: " + ad2.describeMe());
        System.out.println("describing of Advertiser Class: " + advertiser1.describeMe());
        System.out.println("calling getName() method for advertiser2: " + advertiser2.getName());
        ad1.incViews();
        ad1.incViews();
        ad1.incViews();
        ad1.incViews();
        ad2.incViews();
        ad1.incClicks();
        ad1.incClicks();
        ad2.incClicks();
        advertiser2.setName("new name");
        System.out.println("calling getName() method for advertiser2: " + advertiser2.getName());
        System.out.println("number of clicks for ad1: " + ad1.getClicks());
        System.out.println("number of clicks for advertiser2: " + advertiser2.getClicks());
        System.out.println("number of total clicks for all advertisers: " + Advertiser.getTotalClicks());
        System.out.println("help method in Advertiser Class:\n" + Advertiser.help());

    }
}
