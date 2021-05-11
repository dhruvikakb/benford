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

class BenfordJava {
    public static void main(String[] args) throws Exception {

        // Set vairables to 0 once created
        double one = 0;
        double two = 0;
        double three = 0;
        double four = 0;
        double five = 0;
        double six = 0;
        double seven = 0;
        double eight = 0;
        double nine = 0;
        double total = 0;

        // import file to read
        File file = new File("sales.csv");
        Scanner scan = new Scanner(file);

        // create while loop, if the fourth character, which is the first digit
        // of the numbers, appears, than add one to that number
        while (scan.hasNext()) {
            total++;
            String num = Character.toString(scan.next().charAt(4));

            if (num.equals("1")) {
                one++;
            }
            if (num.equals("2")) {
                two++;
            }
            if (num.equals("3")) {
                three++;
            }
            if (num.equals("4")) {
                four++;
            }
            if (num.equals("5")) {
                five++;
            }
            if (num.equals("6")) {
                six++;
            }
            if (num.equals("7")) {
                seven++;
            }
            if (num.equals("8")) {
                eight++;
            }
            if (num.equals("9")) {
                nine++;
            }
        }
        // print out the percentages of the occurance of each number, round to one decimal
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
        series.getData().add(new XYChart.Data("1", percentOne));
        series.getData().add(new XYChart.Data("2", percentTwo));
        series.getData().add(new XYChart.Data("3", percentThree));
        series.getData().add(new XYChart.Data("4", percentFour));
        series.getData().add(new XYChart.Data("5", percentFive));
        series.getData().add(new XYChart.Data("6", percentSix));
        series.getData().add(new XYChart.Data("7", percentSeven));
        series.getData().add(new XYChart.Data("8", percentEight));
        series.getData().add(new XYChart.Data("9", percentNine));

        // this is how big the bar graph will be in the file
        Scene scene = new Scene(barChart, 800, 600);
        barChart.getData().addAll(series);
        stage.setScene(scene);
        stage.show();

    }
}
