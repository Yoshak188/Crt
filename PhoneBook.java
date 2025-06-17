import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
public class PhoneBook {
    static HashMap<String, String> contact = new HashMap<>();
    public static void main(String[] args) {
        Scanner sin = new Scanner(System.in);
        int choice;
        do {
            System.out.println("\n--PhoneBook---");
            System.out.println("1.Add contacts");
			System.out.println("2.Search contact");
            System.out.println("3.Update contact");
            System.out.println("4.Delete contact");
            System.out.println("5.display contacts");
            System.out.println("6.exit");
            System.out.println("enter your choice");
            choice=sin.nextInt();
            sin.nextLine();  
            switch (choice){
                case 1:
                    addcontacts(sin);
                case 2:
                    searchcontact(sin);
				case 3:
                    updatecontact(sin);
				case 4:
                    deletecontact(sin);
				case 5:
                    displaycontacts();
                case 6:
                    System.out.println("Exiting program:");
                default:
                    System.out.println("Invalid choice try again:");
            }
        } while (choice!=6);
        sin.close();
    }
    static void addcontacts(Scanner sin) {
        System.out.print("Enter contact name:");
        String name=sin.nextLine();
        System.out.print("Enter phone number:");
        String phoneNumber=sin.nextLine();
        System.out.print("Enter email address:");
        String email=sin.nextLine();
        contact.put(name,phoneNumber+", " + email);
        System.out.println("Contact added successfully!");
    }
	static void searchcontact(Scanner sin){
        System.out.print("Enter the name to search: ");
        String name=sin.nextLine();
        if (contact.containsKey(name)){
            System.out.println("Found contact:" + name + ", " +contact.get(name));
        } else {
            System.out.println("Contact not found.");
        }
    }
	static void updatecontact(Scanner sin) {
        System.out.print("Enter the name to update: ");
        String name = sin.nextLine();
        if(contact.containsKey(name)){
            System.out.print("Enter new phone number: ");
            String phoneNumber = sin.nextLine();
            System.out.print("Enter new email address: ");
            String email = sin.nextLine();
            contact.put(name, phoneNumber + ", " + email);
            System.out.println("Contact updated successfully.");
        } else {
            System.out.println("Contact not found.");
        }
    }
	static void deletecontact(Scanner sin) {
        System.out.print("Enter the name to delete: ");
        String name = sin.nextLine();
        if (contact.containsKey(name)) {
            contact.remove(name);
            System.out.println("Contact deleted successfully.");
        } else {
            System.out.println("Contact not found.");
        }
    }
    static void displaycontacts(){
        if (contact.isEmpty()) {
            System.out.println("Phone book is empty");
        } else{
            System.out.println("\n--- All Contacts ---");
            for(Map.Entry<String,String>entry:contact.entrySet()){
                System.out.println("Name: " + entry.getKey() + ", Phone and Email: " + entry.getValue());
            }
        }
    }
}
