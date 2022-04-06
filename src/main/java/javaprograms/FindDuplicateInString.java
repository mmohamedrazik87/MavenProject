package javaprograms;

import java.util.Collections;

public class FindDuplicateInString {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        String st = "Good Dood is Good to good is Done to Dood";
        int count;
        String finalString = st.toLowerCase();
        String[] split = finalString.split(" ");
        for (int i = 0; i < split.length; i++) {
            count = 1;
            for (int j = i + 1; j < split.length; j++) {

                if (split[i].equals(split[j])) {
                    count++;
                    split[j] = "0";

                }
            }
            if (count > 1 && split[i] != "0") {

                System.out.println(split[i] + " is a duplicate word");

            }

        }

    }

}
