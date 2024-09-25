/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.projeto_15_txt;


import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author m.schmidt
 */
public class PROJETO_15_TXT {

    public static void main(String[] args) throws IOException {
        Scanner ler = new Scanner(System.in);
        int[] tabu = new int[5];

        for (int i = 0; i < 5; i++) {
            System.out.println("Informe 5 numeros para fazermos a tabuada de cada um:");
            int num = ler.nextInt();
            tabu[i] = num;
        }
        for (int i = 0; i < 5; i++) {
            
            FileWriter arquivo = new FileWriter("C:\\Users\\m.schmidt\\Desktop\\TESTE\\" + "Tabuado do "+tabu[i] + ".txt");
            PrintWriter gravar = new PrintWriter(arquivo);
            
            gravar.printf("Tabuada do " + tabu[i] + "\n");
            gravar.printf("------------------");

            for (int n = 1; n <= 10; n++){
                gravar.printf("\n" + n + " x " + tabu[i] + " = " + (n * tabu[i]) + "\n");
            }
            
            arquivo.close();
        }
        
    }
}