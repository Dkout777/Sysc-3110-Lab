public class BuddyInfo {
    private String name;


    private String address;

    private String number;

    public BuddyInfo(){

    }
    public BuddyInfo(String name, String address, String number){
    }


    public String getAddress() {
        return address;
    }


    public String getNumber() {
        return number;
    }

    public String getName() {
        return name;
    }



    public static void main(String[] args) {
        BuddyInfo buddy = new BuddyInfo();
        buddy.name = "Homer";
        AddressBook book = new AddressBook();
        book.addBuddy(buddy);
        System.out.println("Hello World! ");
        System.out.println("Hello "+ buddy.getName());
    }
}
