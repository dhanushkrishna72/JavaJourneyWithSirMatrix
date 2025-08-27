package ApnaCollege.lec2.Strings;

import java.util.*;

public class Strings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // String name = sc.nextLine();
        // System.out.println("Hello " + name + "!\nHave a nice day..!!");
        
        // String name1 = "tony";
        // String newName = name + name1;//Concatination
        // System.out.println(newName);

        // // compare
        // System.out.println(name.compareTo(name1));

        String mySentence = "I am TonyStark";
        String sentence = mySentence.substring(0, mySentence.length());
        System.out.println(sentence);
    }

}
