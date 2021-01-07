public class BaseAdvertising {
    private int id;
    private int clicks;
    private int views;

    public BaseAdvertising(int id) {
        this.id = id;
    }

    public BaseAdvertising() {

    }

    public String describeMe() {
        return "this ia a Parent Of Ad and Advertiser class that handle methods and fields exist in both";
    }

    public int getClicks() {
        return clicks;

    }

    public int getViews() {
        return views;
    }

    public void incClicks() {
        clicks++;
    }

    public void incViews() {
        views++;
    }

}
