import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class CreateArray {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        List<String> p =new ArrayList<>();
        System.out.println(p);

        p.add("milk");
        System.out.println(p);

        p.add("egg");
        p.add("bread");
        System.out.println(p);
    }
}