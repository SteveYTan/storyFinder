package team29.storyfinder.models;

/**
 * Created by Leca on 11/30/16.
 */
//DerpData.java
import java.util.ArrayList;
import java.util.List;

/**
 * This class is a dummy data source, used to simulate the kind of input you might recieve from a
 * Database or Web source.
 * Created by Ryan on 01/03/2016.
 */
public class DerpData {
    private static final String[] titles  = {"Nothingness cannot be defined", "The softest thing cannot be snapped",
            "be like water, my friend."} ;
    private static final int[] icons = {android.R.drawable.ic_popup_reminder, android.R.drawable.ic_menu_add,
            android.R.drawable.ic_menu_delete};

    private static final String[] descriptions = {
            "Lorem ipsum dolor sit amet, consectetur adipiscing elit",
            "Sed ut perspiciatis unde omnis iste natus error sit voluptatem accusantium doloremqu"+
                    "e laudantium, totam rem aperiam, eaque ipsa quae ab illo inventore veritatis et " +
                    " quasi architecto beatae vitae dicta sunt explicabo.",
            "At vero eos et accusamus et iusto odio dignissimos ducimus qui blanditiis praesentium voluptatum deleniti atque corrupti quos dolores et quas molestias excepturi sint occaecati cupiditate non provident, similique sunt in culpa qui officia deserunt mollitia animi, id est laborum et dolorum fuga. Et harum quidem rerum facilis est et expedita distinctio",
            "Itaque earum rerum hic tenetur a sapiente delectus",

    };

    public static List<listItem> getListData() {
        List<listItem> data = new ArrayList<>();

        //Repeat process 4 times, so that we have enough data to demonstrate a scrollable
        //RecyclerView
        for (int x = 0; x < 4; x++) {
            //create ListItem with dummy data, then add them to our List
            for (int i = 0; i < titles.length && i < icons.length; i++) {
                listItem item = new listItem();
                item.setImageResId(icons[i]);
                item.setDescription(descriptions[i]);
                item.setTitle(titles[i]);
                data.add(item);
            }
        }
        return data;
    }
}