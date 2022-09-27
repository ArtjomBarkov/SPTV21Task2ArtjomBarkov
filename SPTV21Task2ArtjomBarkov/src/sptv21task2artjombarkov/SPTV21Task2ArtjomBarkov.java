/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sptv21task2artjombarkov;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class SPTV21Task2ArtjomBarkov {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Введите трехзначное число: ");
        Scanner scanner = new Scanner (System.in);
        int number = scanner.nextInt();
        System.out.println(+((number%10)+((number/10)%10)+((number/100)%10)));
        // TODO code application logic here
    }
    
}
