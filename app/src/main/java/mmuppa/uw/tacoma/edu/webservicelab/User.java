package mmuppa.uw.tacoma.edu.webservicelab;

/**
 * Created by mmuppa on 10/23/2015.
 */

import java.util.*;
/**
 * Helper class for providing sample content for user interfaces created by
 * Android template wizards.
 * <p/>
 */
public class User {

    /**
     * An array of user items.
     */
    public static List<UserInfo> ITEMS = new ArrayList<UserInfo>();

    /**
     * A map of user items, by email.
     */
    public static Map<String, UserInfo> ITEM_MAP = new HashMap<String, UserInfo>();


    private static void addItem(UserInfo item) {
        ITEMS.add(item);
        ITEM_MAP.put(item.email, item);
    }

    /**
     * A dummy item representing a piece of content.
     */
    public static class UserInfo {
        public String email;
        public String pwd;

        public UserInfo(String email, String pwd) {
            this.email = email;
            this.pwd = pwd;
        }

        @Override
        public String toString() {
            return email;
        }
    }
}
