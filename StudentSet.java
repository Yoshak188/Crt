import java.util.HashSet;
import java.util.Scanner;
class StudentSet {
    public static void main(String[] args) {
        HashSet<String>Students=new HashSet<>();
        Scanner sin=new Scanner(System.in);
        System.out.println("enter 5 student names:");
        for(int i=0;i<5;i++){
            String name=sin.nextLine();
            Students.add(name);
        }
        System.out.println(Students+ " ");
    }
}