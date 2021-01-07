import java.util.ArrayList;

public class Advertiser extends BaseAdvertising {
    private static ArrayList<Advertiser> advertisers = new ArrayList<>();
    private String name;

    public Advertiser(int id, String name) {
        super(id);
        this.name = name;
        advertisers.add(this);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static String help() {
        return "getName() : returns name of Advertiser\n" +
                "setName() : sets name of Advertiser\n" +
                "getTotalClicks() : returns total number of Clicks\n" +
                "getClicks() : returns number of clicks for current advertiser\n" +
                "getViews() : returns number of views for current advertiser\n" +
                "incClicks() : increases number of clicks\n" +
                "incViews() : increases number of views\n" +
                "describeMe() : describes the duty of current class\n";
    }

    public static int getTotalClicks() {
        int totalClicks = 0;
        for (Advertiser advertiser : advertisers) {
            totalClicks += advertiser.getClicks();
        }
        return totalClicks;
    }

    @Override
    public String describeMe() {
        return "this is a Advertiser class that manages Advertisers";
    }
}
