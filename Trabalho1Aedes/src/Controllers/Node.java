package Controllers;

public class Node {
    /*
        ♠ Classe que cria os nós pra armazenamento dos dados.
     */
    private int data;
    private Node left;
    private Node right;

    // construtor:
    public Node(int data, Node left, Node right){
        this.data = data;
        this.left = left;
        this.right = right;
    }

    // getters e setters
    public int getData(){
        return this.data;
    }

    public void setData(int new_data) {
        this.data = new_data;
    }

    public Node getLeft() {
        return left;
    }

    public void setLeft(Node new_left) {
        this.left = new_left;
    }

    public Node getRight() {
        return right;
    }

    public void setRight(Node new_right) {
        this.right = new_right;
    }
}
