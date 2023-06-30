package worlds;
import java.io.*;
import java.io.BufferedReader;
import java.io.InputStreamReader;
public class Lugaw{
 
 static int restart = 1, plain = 45, egg = 112, chicken = 458;
 static int cash, change, result1, result2, result3;
 static int breakdown1, breakdown2, breakdown3;
 static String order, choice1 = "A", choice2 = "B", choice3 = "C"; 
 public static void main(String[] args) throws Exception{
 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
 
 while(restart == 1){
 println("Lugaw is ESSENTIAL menu: \nA. Lugaw plain - 45 pesos \nB. Lugaw w/ red egg - 112 pesos  \nC. Lugaw w/ 1k chicken - 458 pesos");
 
 println(); 
 
 print("Enter order: ");
 order = br.readLine();
 print("Enter cash: ");
 cash = Integer.parseInt(br.readLine());
 
 if(order.equalsIgnoreCase(choice1)){
 result1 = cash - plain;
 println("Your change is: " + result1);
 
 println();
 
 if(cash >= 1000){
 println("Money breakdown:");
 println("1000 pesos: " + result1 / 1000); 
 println("500 pesos: " + result1 / 500); 
 println("200 pesos: " + (result1 - 500) / 200);
 println("100 pesos: " + (result1 - result1) / 100); 
 println("50 pesos: " + (result1 - 900) / 50); 
 println("20 pesos: " + (result1 - result1) / 20); 
 println("10 pesos: " + (result1 - result1) / 10); 
 println("5 pesos: " + (result1 - 950) / 5);
 println("1 pesos: " + (result1 - result1) / 1);
 }
 else if(cash >= 500){
 println("Money breakdown:");
 println("1000 pesos: " + result1 / 1000);
 println("500 pesos: " + result1 / 500);
 println("200 pesos: " + result1 / 200);
 println("100 pesos: " + (result1 - result1) / 100);
println("50 pesos: " + (result1 - 400) / 50);
 println("20 pesos: " + (result1 - result1) / 20);
 println("10 pesos: " + (result1 - result1) / 10);
 println("5 pesos: " + (result1 - 450) / 5);
 println("1 pesos: " + (result1 - result1) / 1);
 }
 else if(cash >= 200){
 println("Money breakdown:");
 println("1000 pesos: " + result1 / 1000);
 println("500 pesos: " + result1 / 500);
 println("200 pesos: " + result1 / 200);
 println("100 pesos: " + result1 / 100);
 println("50 pesos: " + (result1 - 100) / 50);
 println("20 pesos: " + (result1 - result1) / 20);
 println("10 pesos: " + (result1 - result1) / 10);
 println("5 pesos: " + (result1 - 150) / 5);
 println("1 pesos: " + (result1 - result1) / 1);
 }
 else if(cash >= 100){
 println("Money breakdown:");
 println("1000 pesos: " + result1 / 1000);
 println("500 pesos: " + result1 / 500);
 println("200 pesos: " + result1 / 200);
 println("100 pesos: " + result1 / 100);
 println("50 pesos: " + result1 / 50);
 println("20 pesos: " + (result1 - result1) / 20);
 println("10 pesos: " + (result1 - result1) / 10);
 println("5 pesos: " + (result1 - 50) / 5);
 println("1 pesos: " + (result1 - result1) / 1);
 }
 else if(cash >= 50){
 println("Money breakdown:");
 println("1000 pesos: " + result1 / 1000);
 println("500 pesos: " + result1 / 500);
 println("200 pesos: " + result1 / 200);
 println("100 pesos: " + result1 / 100);
 println("50 pesos: " + result1 / 50);
 println("20 pesos: " + (result1 - result1) / 20);
 println("10 pesos: " + (result1 - result1) / 10);
 println("5 pesos: " + result1 / 5);
 println("1 pesos: " + (result1 - result1) / 1);
 }
 else if(cash >= plain){
 println("Money breakdown:");
 println("1000 pesos: " + result1 / 1000);
 println("500 pesos: " + result1 / 500);
 println("200 pesos: " + result1 / 200);
 println("100 pesos: " + result1 / 100);
 println("50 pesos: " + result1 / 50);
 println("20 pesos: " + (result1 - result1));
 println("10 pesos: " + (result1 - result1));
 println("5 pesos: " + (result1 - result1));
 
 println("1 pesos: " + (result1 - result1));
 }
 }
 else if(order.equalsIgnoreCase(choice2)){
 result2 = cash - egg;
 println("Your change is: " + result2);
 
 println();
 
 if(cash >= 1000){
 println("Money breakdown:");
 println("1000 pesos: " + result2 / 1000); 
 println("500 pesos: " + result2 / 500); 
 println("200 pesos: " + (result2 - 500) / 200);
 println("100 pesos: " + (result2 - 700) / 100); 
 println("50 pesos: " + (result2 - 800) / 50); 
 println("20 pesos: " + (result2 - 850) / 20); 
 println("10 pesos: " + (result2 - 870) / 10); 
 println("5 pesos: " + (result2 - 880) / 5);
 println("1 pesos: " + (result2 - 885) / 1);
 }
 else if(cash >= 500){
 println("Money breakdown:");
 println("1000 pesos: " + result2 / 1000); 
 println("500 pesos: " + result2 / 500); 
 println("200 pesos: " + result2 / 200);
 println("100 pesos: " + (result2 - 200) / 100); 
 println("50 pesos: " + (result2 - 300) / 50); 
 println("20 pesos: " + (result2 - 350) / 20); 
 println("10 pesos: " + (result2 - 370) / 10); 
 println("5 pesos: " + (result2 - 380) / 5);
 println("1 pesos: " + (result2 - 385) / 1);
 }
 else if(cash >= 200){
 println("Money breakdown:");
 println("1000 pesos: " + result2 / 1000); 
 println("500 pesos: " + result2 / 500); 
 println("200 pesos: " + (result2 - result2) / 200);
 println("100 pesos: " + (result2 - result2) / 100); 
 println("50 pesos: " + result2 / 50); 
 println("20 pesos: " + (result2 - 50) / 20); 
 println("10 pesos: " + (result2 - 70) / 10); 
 println("5 pesos: " + (result2 - 80) / 5);
 println("1 pesos: " + (result2 - 85) / 1);
 }
 else if(cash >= 150){
 println("Money breakdown:");
 println("1000 pesos: " + result2 / 1000); 
 println("500 pesos: " + result2 / 500); 
 println("200 pesos: " + (result2 - result2) / 200);
 println("100 pesos: " + (result2 - result2) / 100); 
 println("50 pesos: " + (result2 - result2) / 50);
println("20 pesos: " + result2 / 20); 
 println("10 pesos: " + (result2 - 20) / 10); 
 println("5 pesos: " + (result2 - 30) / 5);
 println("1 pesos: " + (result2 - 35) / 1); 
 }
 else if(cash >= 120){
 println("Money breakdown:");
 println("1000 pesos: " + result2 / 1000); 
 println("500 pesos: " + result2 / 500); 
 println("200 pesos: " + (result2 - result2) / 200);
 println("100 pesos: " + (result2 - result2) / 100); 
 println("50 pesos: " + (result2 - result2) / 50); 
 println("20 pesos: " + (result2 - result2) / 20); 
 println("10 pesos: " + (result2 - result2) / 10); 
 println("5 pesos: " + result2 / 5);
 println("1 pesos: " + (result2 - 5) / 1);
 }
 else if(cash == egg){
 println("Money breakdown:");
 println("1000 pesos: " + result2 / 1000); 
 println("500 pesos: " + result2 / 500); 
 println("200 pesos: " + (result2 - result2) / 200);
 println("100 pesos: " + (result2 - result2) / 100); 
 println("50 pesos: " + (result2 - result2) / 50); 
 println("20 pesos: " + (result2 - result2) / 20); 
 println("10 pesos: " + (result2 - result2) / 10); 
 println("5 pesos: " + (result2 - result2) / 5);
 println("1 pesos: " + (result2 - result2) / 1);
 }
 }
 else if(order.equalsIgnoreCase(choice3)){
 result3 = cash - chicken;
 println("Your change is: " + result3);
 
 println();
 
 if(cash >= 1000){
 println("Money breakdown:");
 println("1000 pesos: " + result3 / 1000); 
 println("500 pesos: " + result3 / 500); 
 println("200 pesos: " + (result3 - result3) / 200);
 println("100 pesos: " + (result3 - result3) / 100); 
 println("50 pesos: " + (result3 - result3) / 50); 
 println("20 pesos: " + (result3 - 500) / 20); 
 println("10 pesos: " + (result3 - result3) / 10); 
 println("5 pesos: " + (result3 - result3) / 5);
 println("1 pesos: " + (result3 - 540) / 1);
 }
 else if(cash >= 800){
 println("Money breakdown:");
 println("1000 pesos: " + result3 / 1000); 
 println("500 pesos: " + result3 / 500);
 println("200 pesos: " + result3 / 200);
 println("100 pesos: " + (result3 - 200) / 100); 
 println("50 pesos: " + (result3 - result3) / 50); 
 println("20 pesos: " + (result3 - 300) / 20); 
 println("10 pesos: " + (result3 - result3) / 10); 
 println("5 pesos: " + (result3 - result3) / 5);
 println("1 pesos: " + (result3 - 340) / 1); 
 }
 else if(cash >= 500){
 println("Money breakdown:");
 println("1000 pesos: " + result3 / 1000); 
 println("500 pesos: " + result3 / 500); 
 println("200 pesos: " + (result3 - result3) / 200);
 println("100 pesos: " + (result3 - result3) / 100); 
 println("50 pesos: " + (result3 - result3) / 50); 
 println("20 pesos: " + result3 / 20); 
 println("10 pesos: " + (result3 - result3) / 10); 
 println("5 pesos: " + (result3 - result3) / 5);
 println("1 pesos: " + (result3 - 40) / 1); 
 }
 else if(cash >= 480){
 println("Money breakdown:");
 println("1000 pesos: " + result3 / 1000); 
 println("500 pesos: " + result3 / 500); 
 println("200 pesos: " + (result3 - result3) / 200);
 println("100 pesos: " + (result3 - result3) / 100); 
 println("50 pesos: " + (result3 - result3) / 50); 
 println("20 pesos: " + result3 / 20); 
 println("10 pesos: " + (result3 - result3) / 10); 
 println("5 pesos: " + (result3 - result3) / 5);
 println("1 pesos: " + (result3 - 20) / 1); 
 }
 else if(cash >= 460){
 println("Money breakdown:");
 println("1000 pesos: " + result3 / 1000); 
 println("500 pesos: " + result3 / 500); 
 println("200 pesos: " + (result3 - result3) / 200);
 println("100 pesos: " + (result3 - result3) / 100); 
 println("50 pesos: " + (result3 - result3) / 50); 
 println("20 pesos: " + (result3 - result3) / 20); 
 println("10 pesos: " + (result3 - result3) / 10); 
 println("5 pesos: " + (result3 - result3) / 5);
 println("1 pesos: " + result3 / 1);
 }
 else if(cash == chicken){
 println("Money breakdown:");
 println("1000 pesos: " + result3 / 1000); 
 println("500 pesos: " + result3 / 500); 
 println("200 pesos: " + result3 / 200);
 println("100 pesos: " + result3 / 100); 
 println("50 pesos: " + result3 / 50); 
 println("20 pesos: " + result3 / 20);
println("10 pesos: " + result3 / 10); 
 println("5 pesos: " + result3 / 5);
 println("1 pesos: " + result3 / 1); 
 }
 }
 else{
 println("Invalid input");
 }
 
 println();
 
 println("Do you want to order again? \n[1] Yes / [2] No");
 print("Enter choice: ");
 restart = Integer.parseInt(br.readLine());
 
 println();
 
 if(restart == 2) println("Thank you");
 } 
 
 }
 
 static void println(){
 System.out.println();
 }
 
 static void print(String inline){
 System.out.print(inline);
 }
 
 static void println(String newline){
 System.out.println(newline);
 }
}