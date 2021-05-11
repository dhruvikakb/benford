/*
* Name : Toby and Dhruvika
* Teacher: Mr.Ho
* Date: May 12th
* Description: Create a graph, showing the percentages of each number being shown up in a file given to us
*/

import java.io.File;
import java.util.Scanner;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.chart.BarChart;
import javafx.scene.chart.CategoryAxis;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.stage.Stage;
import java.io.FileNotFoundException;

class BenfordJava {
    public static void main(String[] args)throws Exception {

        //Set vairables to 0 once created 
        double one =0;
        double two = 0;
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
            String num = Character.toString(scan.next().charAt(4));
         
            if(num.equals("1")){
                one++;
            }
            if(num.equals("2")){
                two++;
            }
            if(num.equals("3")){
                three++;
            }
            if(num.equals("4")){
                four++;
            }
            if(num.equals("5")){
                five++;
            }
            if(num.equals("6")){
                six++;
            }
            if(num.equals("7")){
                seven++;
            }
            if(num.equals("8")){
                eight++;
            }
            if(num.equals("9")){
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
