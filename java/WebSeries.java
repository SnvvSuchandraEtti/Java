import java.util.*;
public class WebSeries {
    public static void main(String[] args) {
        String[][] characters = {{"Bruce", "clent", "robin"}, {"jonas", "martha", "steve"}, {"raj", "anthony", "robert"}};
        for (String[] eachSeries : characters) {
            for (String character : eachSeries) {
                System.out.print(character + " ");
            }
            System.out.println();
        }
    }
}
