/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package arvorebinaria;

import java.util.Scanner;

/**
 *
 * @author Reis
 */
public class ArvoreBinaria {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Arvore a = Arvore.leitura(in);
    
    System.out.println(" numberNodes = " + a.numeroNos());
  
    System.out.println(" contains (2) = " + a. contem(2));
    System.out.println(" contains (3) = " + a. contem (3));
    a. printPreOrder ();
    a. printInOrder ();
    a. printPostOrder();

    System.out.println("\nImpressão em nível: ");
    a.breadthFirstSearch();
    // insert:
        System.out.println("INSERT LATERAL");
        Arvore b = new Arvore();
        b.insert(in);
    }
    
}
