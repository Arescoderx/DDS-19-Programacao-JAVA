/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pratica_controle_erros;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author m.schmidt
 */
public class Pratica_Controle_Erros4 {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int num[] = new int[4];

        System.out.println("Me informe os numero o primerio é o numero e o segundo é o divisor");
        for (int i = 0; i <= 3; i = i + 2) {
            System.out.println("Primeiro numero");
            num[i] = ler.nextInt();
            System.out.println("Segundo numero");
            num[i + 1] = ler.nextInt();
        }
        for (int i = 0; i <= 3; i = i + 2) {
            try {
              int resultado= Integer.parseInt(num[i]/num[i+1]);
               
            } catch (ArithmeticException e) {
                System.out.println("Erro: Divisao por zero");
            } catch (NumberFormatException e) {
                System.out.println("Erro ao converter: " + e.getMessage());
            }
              
        }

        ler.close();
    }
}
