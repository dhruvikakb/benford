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
    
    
    @Override
    public double graph(Stage stage) {
          
        stage.setTitle("Benford's Law Assignment");

        CategoryAxis xAxis = new CategoryAxis();
        xAxis.setLabel("Digit");
        NumberAxis yAxis = new NumberAxis("Percent", 0, 50, 5);
        BarChart<String, Number> barChart = new BarChart<String, Number>(xAxis, yAxis);
        barChart.setTitle("Figure 1 - Benford's Law Distribution Leading Digit");


        double percent1 = one / total * 100;
        double percent2 = two / total * 100;
        double percent3 = three / total * 100;
        double percent4 = four / total * 100;
        double percent5 = five / total * 100;
        double percent6 = six / total * 100;
        double percent7 = seven / total * 100;
        double percent8 = eight / total * 100;
        double percent9 = nine / total * 100;

        XYChart.Series series = new XYChart.Series();
        series.getData().add(new XYChart.Data("1", percent1));
        series.getData().add(new XYChart.Data("2", percent2));
        series.getData().add(new XYChart.Data("3", percent3));
        series.getData().add(new XYChart.Data("4", percent4));
        series.getData().add(new XYChart.Data("5", percent5));
        series.getData().add(new XYChart.Data("6", percent6));
        series.getData().add(new XYChart.Data("7", percent7));
        series.getData().add(new XYChart.Data("8", percent8));
        series.getData().add(new XYChart.Data("9", percent9));

        Scene scene = new Scene(barChart, 800, 600);
        barChart.getData().addAll(series);
        stage.setScene(scene);
        stage.show();
    }
}
