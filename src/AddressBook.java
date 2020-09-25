import java.util.LinkedList;
public class AddressBook {
    private LinkedList<BuddyInfo> book;

    public void addBuddy(BuddyInfo added){
        book.add(added);
    }

    public void removeBuddy (BuddyInfo removed){
        book.remove(removed);
    }

    public static void main(String[] args) {
        System.out.println("Address Book");
    }



}
