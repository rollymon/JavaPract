/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pract1;
import java.util.Scanner;

public class Pract1 {

    public static void main(String[] args) {
       Scanner scan = new Scanner(System.in);
       int a, x, b;
       double y = 0;
       System.out.println("Введите число a:");
       a = scan.nextInt();
       System.out.println("Введите число x:");
       x = scan.nextInt();
       System.out.println("Введите число b:");
       b = scan.nextInt();
       if(x >= 4){
            y = (Math.pow(a, 2) + (5 * x) + Math.pow(b, 2))/(a*b);
            System.out.println("x >= 4");
       }
       else {
           y = x * (a - b);
           System.out.println("x < 4");
       }
       if (Double.isNaN(y) || Double.isInfinite(y)) {
        System.out.println("Нет решения!"); // Нет решения
       }   
       else {
        System.out.println("y = " + y); // Вывод ответа
       }
    }
}
