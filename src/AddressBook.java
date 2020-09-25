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
        BuddyInfo buddy = new BuddyInfo("Tom","Carleton","613");
        AddressBook addressBook = new AddressBook();
        addressBook.addBuddy(buddy);
        addressBook.removeBuddy(buddy);

    }



}
