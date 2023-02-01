import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> tree = new ArrayList<String>();
        tree.add("pine");
        tree.add("maple");
        tree.add("frasier fir");
        System.out.println(tree);
        System.out.println(tree.size());
        String test = tree.get(1);
        System.out.println(test);
        ArrayList<String> names = new ArrayList<String>();
        names.add("Ben");
        names.add("Andy");
        names.add("David");
        String[] moreNames = {"Crystal", "Monica", "Toby", "Nancy"};
        int namesAmt = names.size();
        int moreNamesAmt = moreNames.length;
        int thirdNameLength = names.get(2).length();
        int secondNameLength = moreNames[1].length();
        int lengths = namesAmt + moreNamesAmt + thirdNameLength + secondNameLength;
        System.out.println(lengths); //

    }
}
