import org.apache.commons.io.FileUtils;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class ItemInput {
    private static ArrayList<Items> items = new ArrayList<>();
    public static ArrayList<Items> getItems() {
        try {

            List<String> lines = FileUtils.readLines(new File("Items.txt"), "UTF-8");
            //System.out.println(lines);

            for (int i = 0; i < lines.size(); i++) {
                String line = lines.get(i);
                Items item = new Items();
                String[] itemData = line.split(",");
                int j = 0;
                item.setItemID(Integer.parseInt(itemData[j]));
                j++;
                item.setItemName(itemData[j]);
                j++;
                item.setItemDescription(itemData[j]);
                items.add(item);

            }

        }catch (Exception e) {
            System.out.println("Items.txt file not found");
            e.printStackTrace();
        }
        return items;

    }
}
