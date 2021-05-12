/*
* Name : Toby and Dhruvika
* Teacher: Mr.Ho
* Date: May 12th
* Description: Create a graph, showing the percentages of each number being shown up in a file given to us
*/

import java.io.File;
import java.util.Scanner;
import java.io.PrintWriter;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.chart.BarChart;
import javafx.scene.chart.CategoryAxis;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.stage.Stage;
import java.io.FileNotFoundException;

class BenfordsLawAssignment{
    public static void main(String[] args) throws Exception {
        //hold the numbers in an array
        double[] count = new double[9];
        double total = 0;
        double percent1 = 0;
        double percent = 0;
        
        // import file to read
        File file = new File("sales.csv");
        Scanner scan = new Scanner(file);

        // create while loop, if the fourth character, which is the first digit
        // of the numbers, appears, than add one to that number
        while (scan.hasNext()) {
            total++;
            String num = Character.toString(scan.next().charAt(4));

            if (num.equals("1")) {
                count[0]++;
            }
            if (num.equals("2")) {
                count[1]++;
            }
            if (num.equals("3")) {
                count[2]++;
            }
            if (num.equals("4")) {
                count[3]++;
            }
            if (num.equals("5")) {
                count[4]++;
            }
            if (num.equals("6")) {
                count[5]++;
            }
            if (num.equals("7")) {
                count[6]++;
            }
            if (num.equals("8")) {
                count[7]++;
            }
            if (num.equals("9")) {
                count[8]++;
            }
        }
    
        
        //the percentages of the occurance of each number, round to one decimal
        percent1 = Math.round((count[0] / total * 100) * 10) / 10.0;
        for (int i = 0; i < 9; i++) {
            percent = Math.round((count[i] / total * 100) * 10) / 10.0;
            }
        fraud(percent1);
    }

    public static double fraud(double percent1){
       
        if(29<percent1 && percent1<32){
            System.out.println("The data shows that fraud likely did not occur");
        }else{
            System.out.println("Fraud has likely occured");
        }
       
        return percent1;
    }
        /**
        * Name: BarGraph
        * Description: creates bar graph in file 
        *
        * @param percent - the array that holds the percents of the frequency of numbers
        * 
        */

        @Override
        public static void BarGraph(double[] percent){
        // create file for graph
        File outFile = new File("results.csv");
        PrintWriter out = new PrintWriter(outFile);

        // create title for the bar graph
        stage.setTitle("Benford's Law Assignment");

        // create x and y axis, with labels
        CategoryAxis xAxis = new CategoryAxis();
        xAxis.setLabel("Digit");
        NumberAxis yAxis = new NumberAxis("Percent", 0, 50, 5);
        BarChart<String, Number> barChart = new BarChart<String, Number>(xAxis, yAxis);
        // add subtitle to bar graph
        barChart.setTitle("Figure 1 - Benford's Law Distribution Leading Digit");

        // add bars for each percentage from numbers 1-9
        XYChart.Series series = new XYChart.Series();
        series.getData().add(new XYChart.Data("1", percent[0]));
        series.getData().add(new XYChart.Data("2", percent[1]));
        series.getData().add(new XYChart.Data("3", percent[2]));
        series.getData().add(new XYChart.Data("4", percent[3]));
        series.getData().add(new XYChart.Data("5", percent[4]));
        series.getData().add(new XYChart.Data("6", percent[5]));
        series.getData().add(new XYChart.Data("7", percent[6]));
        series.getData().add(new XYChart.Data("8", percent[7]));
        series.getData().add(new XYChart.Data("9", percent[8]));

        // this is how big the bar graph will be in the file
        Scene scene = new Scene(barChart, 800, 600);
        barChart.getData().addAll(series);
        stage.setScene(scene);
        stage.show();
        }
        
    }

