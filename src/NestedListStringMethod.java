public class NestedListStringMethod
{
    public static void main(String[] args) {
        String name="ramakant";

// print string
        System.out.println(name);

//.equal("any contain") method contain same hai to print karega true otherwisee false
        System.out.println(name.equals("dev"));


        //String otherName=name.toUpperCase();

//.length() method string ki length print karegi
        System.out.println(name.length());

//.toUpperCase() method string ko capital alphabate me convert kar dagi
        System.out.println(name.toUpperCase());

//.toLowerCase() method string ko small alphabate me convert kar dagi
        System.out.println(name.toLowerCase());

//.charAt(int indexvalue) method jo index value pass ki hai ushka alphabate print kar degi
        System.out.println(name.charAt(2));

        //System.out.println(name.concat(otherName));

//.startWith("alphabate") method ,method me pass alphabate se string start hai to true print kar degi otherwise false
        System.out.println(name.startsWith("s"));

//.indexOf("character") method ,methos me pass alphabate ki index value print kar dega
        System.out.println(name.indexOf("a"));

//.lastIndexOf("character") method string me last se check karega or pass alphabate ki index value print kar degi
        System.out.println(name.lastIndexOf("m"));

        System.out.println(name.intern());
//.repeat(int number) string ko kitna baar print karna hai
        System.out.println(name.repeat(3));

//ye sabhi method given string ko print kar deti hai
        System.out.println(name.strip());
        System.out.println(name.intern());

        System.out.println(name.stripIndent());

        System.out.println(name.stripLeading());

        System.out.println(name.toString());
        System.out.println(name.trim());
    }
}