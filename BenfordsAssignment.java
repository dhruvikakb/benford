import java.io.File;
import java.util.Scanner;

import java.io.FileNotFoundException;

class BenfordsAssignment{
    public static void main(String[] args)throws Exception{
        double one=0;
        double two=0;
        double three = 0;
        double four = 0; 
        double countAll = 0;
        double five = 0;
        double six = 0;
        double seven = 0;

        File sale = new File("sales.csv");
        Scanner scan = new Scanner(sale);

        while(scan.hasNext()){
            countAll++;
            String a = Character.toString(scan.next().charAt(4));

            if(a.equals("1")){
                one++;
            }
            if(a.equals("2")){
                two++;
            }
            if(a.equals("3")){
                three++;
            }
            if(a.equals("4")){
                four++;
            }
            if(a.equals("5")){
                five++;
            }
            if(a.equals("6")){
                six++;
            }
            if(a.equals("7")){
                seven++;
            }
        }
        System.out.println(one + " " + countAll);
        System.out.println(two + " " + countAll);
        System.out.println(three + " " + countAll);

        double fuck = countAll;
        double onePercent = one/fuck;
        double percent = onePercent * 100;
        System.out.println(percent);
    }
}
