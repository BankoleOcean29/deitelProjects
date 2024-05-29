package chapterFour;

import java.util.ArrayList;
import java.util.List;

public class ListOfNames {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();

        for(String name : names) {
            System.out.println(name);
        }
    }

    public static String showFormattedNames(List<String> names) {
        String output = "";

        for (int i = 0; i < names.size(); i++){
            output += names.get(i);

            if (i < names.size() - 2) {
                output += ", ";
            }
            else  if (i == names.size() - 2) {
                output += " and ";
            }
        }

        return  output;

    }
}
