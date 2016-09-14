package stringSamples;

import java.util.Scanner;

public class regexSplit {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        scan.close();

        s = s.replaceAll("^\\s+|\\s+$", "");

        if(s.length() == 0){
            System.out.println(s.length());
        }
        else{
            String[] splits = s.split("[^A-Za-z]+");

            System.out.println(splits.length);
            for(int i =0; i<splits.length; i++){
                System.out.println(splits[i]);
            }
        }

    }
}
