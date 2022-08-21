package exersice01_;

public class Utility {
    public static String titleProcess(String title) {
        if(title == null || title.length() < 15) {
            return title;
        }

        return title.substring(0, 15) + "...";
    }
}
