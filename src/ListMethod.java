import java.util.List;

public class ListMethod
{
    public static void main(String[] args) {
        List<String> friend = List.of("ramesh","dev","rahul","suresh","dev");

// list ko print karta hai
        System.out.println(friend);

        //  .size method list ki size print karta hai
        System.out.println(friend.size());

//.contain("element name") method me jo contain pass karo bo check kar ke true / false me output dati hai
        System.out.println(friend.contains("rahul" ));

// .get(imdex value ) method me jo index value pass karo ushka element name print karta hai
        System.out.println(friend.get(0));

//.getFirst() method list ka first element print karta hai
        System.out.println(friend.getFirst());

//.getLast() method list ka last element print karta nhai
        System.out.println(friend.getLast());

//.getClass() method list ki class type print karta hai
        System.out.println(friend.getClass());

//.indexof("element name") method element ki index value print karti hai
        System.out.println(friend.indexOf("dev"));

//.isEmpty() method list empty ho to print true,otherwise print false
        System.out.println(friend.isEmpty());

//.lastIndexOf("list store element name") method list ke last se index find kar ke ,index value print karega
        System.out.println(friend.lastIndexOf("dev"));

//.reverse() method list ko reverse karke print kar dati hai
        System.out.println(friend.reversed());
    }
}