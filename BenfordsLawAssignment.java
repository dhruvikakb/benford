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
