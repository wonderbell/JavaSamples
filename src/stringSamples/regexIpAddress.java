package stringSamples;

import java.util.Scanner;

public class regexIpAddress {
    public static void main(String []args)
    {
        Scanner in = new Scanner(System.in);
        while(in.hasNext())
        {
            String IP = in.next();
            System.out.println(IP.matches(new myRegex().pattern));
        }

    }
}

class myRegex{
    public String pattern;

    public myRegex(){
        pattern = "(" +
                    "(" +
                        "([01]?[0-9]?[0-9])|(2[0-4][0-9])|(25[0-5])" +
                    ")[.]" +
                    "){3}" +
                "([01]?[0-9]?[0-9])|(2[0-4][0-9])|(25[0-5])";

    }
}
