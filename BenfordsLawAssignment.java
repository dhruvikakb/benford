/*
 * Date: 
 * Name: 
 * Teacher: 
 * Description: 
 *   
 */ 
import java.io.File;
import java.util.Scanner;

import java.io.FileNotFoundException;

class BenfordJava {
    public static void man(String[] args)throws Exception {

        //Set vairables to 0 once created 

        double one =0;
        double two=0;
        double three = 0;
        double four = 0; 
        double five = 0;
        double six = 0;
        double seven = 0;
        double eight = 0;
        double nine = 0;
        double total = 0;


        File file = new File("sales.csv");
        Scanner scan = new Scanner(file);

        while(scan.hasNext()){
            total++;
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
            if(a.equals("8")){
                eight++;
            }
            if(a.equals("9")){
                nine++;
            }
        }
        

        double percentOne = Math.round((one / total * 100) * 10) / 10.0;
        System.out.println(percentOne);

        double percentTwo = Math.round((two / total * 100) * 10) / 10.0;
        System.out.println(percentTwo);

        double percentThree = Math.round((three / total * 100) * 10) / 10.0;
        System.out.println(percentThree);

        double percentFour = Math.round((four / total * 100) * 10) / 10.0;
        System.out.println(percentFour);

        double percentFive = Math.round((five / total * 100) * 10) / 10.0;
        System.out.println(percentFive);

        double percentSix = Math.round((six / total * 100) * 10) / 10.0;
        System.out.println(percentSix);

        double percentSeven = Math.round((seven / total * 100) * 10) / 10.0;
        System.out.println(percentSeven);

        double percentEight = Math.round((eight / total * 100) * 10) / 10.0;
        System.out.println(percentEight);
        
        double percentNine = Math.round((nine / total * 100) * 10) / 10.0;
        System.out.println(percentNine);
    }
}


    }
    
}