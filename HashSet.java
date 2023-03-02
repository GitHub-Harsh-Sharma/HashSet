import java.util.*;

class HS {
    public static void main(String args[]) {
        HashSet<String> hs = new HashSet<String>();
        hs.add("tanuj");
        hs.add("tushar");
        hs.add("tanuj");
        hs.add("Anshul");
        System.out.println("Hash set= " + hs);
        hs.remove("Anshul");
        Iterator it = hs.iterator();
        System.out.println("Elements using Iterator: ");
        while (it.hasNext()) {
            String s = (String) it.next();
            System.out.println(s);
        }
    }
}