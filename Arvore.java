/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package arvorebinaria;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/**
 *
 * @author Reis
 */
public class Arvore {
    private No raiz; // raíz da árvore
// Construtor
Arvore () {
    raiz = null ;
}
// M´etodo principal (p´ublico)
public int numeroNos () {
    return numeroNos(raiz);
}
// M´etodo auxiliar (privado)
public int numeroNos (No n) {
    if (n == null ) return 0;
    return 1 + numeroNos(n.getEsq()) + numeroNos(n.getDir());
}

public int altura () {
    return altura(raiz );
}
private int altura (No n) {
    if (n == null ) return  -1;
    return 1 + Math.max(altura(n.getEsq()), altura(n.getDir()));
}
public boolean contem(int valor) {
    return contem(raiz , valor );
}
private boolean contem(No n, int valor) {
    if (n== null ) return false;
    if (n.getValue()== valor)  return true;
  
    return contem(n.getEsq(), valor) || contem(n.getDir(), valor);
}
public void printPreOrder () {
    System.out.print(" PreOrder:");
    printPreOrder ( raiz);
    System.out.println ();
}
private void printPreOrder (No n) {
    if (n== null ) return;
    System.out.print(" " + n. getValue () );
    printPreOrder (n.getEsq());
    printPreOrder (n.getDir());
}

public void printInOrder () {
    System.out.print("InOrder:");
    printInOrder (raiz);
    System.out.println ();
}
private void printInOrder (No n) {
    if (n== null ) return ;

    printInOrder (n.getEsq());
    System.out.println(n.getValue());
    printInOrder (n.getDir());
}

public void printPostOrder () {
    System.out.print(" PostOrder :");
    printPostOrder (raiz);
}
private void printPostOrder (No n) {
    if (n== null ) return ;
    printPostOrder (n.getEsq());
    printPostOrder (n.getDir());
    System.out.print(" " + n. getValue ());
}

public static Arvore leitura(Scanner in) {
    Arvore a = new Arvore();
    a.setRaiz(escritaArvore (in ));
    return a;
}
private static No escritaArvore (Scanner in) {
    String s = in.next ();
    if (s.equals("n")) return null;
    int valor = Integer.parseInt(s);
    No  esquerdo = null;
    No direito = null;
    return new No(valor , esquerdo , direito );
}

public void  breadthFirstSearch(){ //Node node
    /* faz pesquisa
    em largura  em ordem crescente de profundidade
    */
    No node = null;
    Queue<No> queue = new LinkedList<No>();
    queue.add(raiz);
    while (queue.size() > 0){
        node = queue.remove();
        if(node.getEsq() != null) queue.add(node.getEsq());
        if (node.getDir() != null) queue.add(node.getDir());
        System.out.print(node.getValue() + " ");
    }
}

public void insert(Scanner in){
    No node = null;
    Queue<No> queue = new LinkedList<No>();
    raiz = escritaArvore(in);
    queue.add(raiz);

    while (queue.size() > 0){
        node = queue.remove();
        if(node.getEsq() == null){
            node.setEsq(escritaArvore(in));
            queue.add(node.getEsq());
        }
        if (node.getDir() == null){
            node.setDir(escritaArvore(in));
            queue.add(node.getDir());
        }
        if(node.getDir() == null && node.getEsq() == null) {
            break;
        }
        System.out.print(node.getValue() + " ");
    }
    // impressao
    breadthFirstSearch();
}




/**
     * @return the raiz
     */
    public No getRaiz() {
        return raiz;
    }

    /**
     * @param raiz the raiz to set
     */
    public void setRaiz(No raiz) {
        this.raiz = raiz;
    }
    
    
}
