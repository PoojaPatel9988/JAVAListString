import java.util.ArrayList;
import java.util.Scanner;

public class List
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);

        java.util.List<String> shopingList = new ArrayList<>();


        System.out.println(shopingList);

        shopingList.add("milk");
        shopingList.add("clothes");
        shopingList.add("toys");
        System.out.println(shopingList);

        shopingList.remove("milk");
        System.out.println(shopingList);

        String item=shopingList.get(0);
        System.out.println(item);
    }
}