import java.util.ArrayList;
public class AddressBook {
    private ArrayList<BuddyInfo> book;
    public AddressBook(){
        book = new ArrayList<>();
    }

    public void addBuddy(BuddyInfo added){
        if(added != null) {
            book.add(added);
        }

    }
    public void branchTest(){
        System.out.println("Test Successful");
    }
    public void branchTestTwo(){
        System.out.println("Test2 Successful");
    }



    public void removeBuddy (int index){
        book.remove(index);
    }

    public static void main(String[] args) {
        BuddyInfo buddy = new BuddyInfo("Test","Carleton","613");
        AddressBook addressBook = new AddressBook();
        addressBook.addBuddy(buddy);
        addressBook.removeBuddy(0);
        //Added Text from Git

    }



}
