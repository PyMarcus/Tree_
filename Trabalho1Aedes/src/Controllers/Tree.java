package Controllers;
import java.util.Queue;
import java.util.LinkedList;


public class Tree {
    /*
        ♦ Classe que armazena a raíz e contém
        os métodos para manipulação da árvore.
     */
    private Node root;

    // constructor
    public Tree(){
        this.root = null;
    }

    // getter e setter
    public Node getRoot(){
        return this.root;
    }

    public void setRoot(Node new_root){
        this.root = new_root;
    }

    public void insertData(Node node, int data_from_vector, Node root){
        /*
            Método que insere valores na árvore...
         */
        if(node != null){
            if(node.getData() < root.getData()){
                if(node.getLeft() != null) insertData(node.getLeft(), data_from_vector, node);
                else node.setLeft(new Node(data_from_vector, null, null));

            }else{
                if(node.getRight() != null) insertData(node.getRight(), data_from_vector, node);
                else node.setRight(new Node(data_from_vector, null, null));
            }
        }
    }

    public Node manualInsert(){
        Node a4 = new Node(696, null,null);
        Node a3 = new Node(11, null, null);
        Node a2 = new Node(43, a3, a4);
        Node a1 = new Node(89, null, null);
        Node a0 = new Node(61, a1, a2);
        setRoot(a0);
        return getRoot();
    }



    public void postOrder(Node node){
        /*
            Método que manipula nós de forma que a raíz fique após
            as duas subárvores(lado esquerdo e direito)
         */
        if(node != null){
            if(node.getLeft() != null) postOrder(node.getLeft());
            if(node.getRight() != null) postOrder(node.getRight());
            System.out.print(node.getData() + " ");
        }
    }

    public void  breadthFirstSearch(){ //Node node
        /* faz pesquisa
        em largura  em ordem crescente de profundidade
        */
        Node node = manualInsert();
        Queue<Node> queue = new LinkedList<Node>();
        queue.add(getRoot());
        while (queue.size() > 0){
            node = queue.remove();
            if(node.getLeft() != null) queue.add(node.getLeft());
            if (node.getRight() != null) queue.add(node.getRight());
            System.out.print(node.getData() + " ");
        }
    }

    public void insertBreadthFirstSearch12(int value){
        /* insere dados sob a lógica de pesquisa em largura */
        Queue<Node> queue = new LinkedList<Node>();

        queue.add(getRoot());
        Node node = null;
        while (node == null){
            node = queue.remove();
            if(node.getLeft() == null){
                Node n = new Node(value, null, null);
                node.setLeft(n);
                queue.add(node.getLeft());
                node = new Node(value, null, null);

            }else{
                if (node.getRight() == null){
                    Node n = new Node(value, null, null);
                    node.setRight(n);
                    queue.add(node.getRight());
                    node = new Node(value, null, null);
                }else{
                    if(node.getLeft() != null){
                        Node n = new Node(value, null, null);
                        node.setLeft(n);
                        queue.add(node.getLeft().getLeft());
                        node = new Node(value, null, null);
                    }else{
                        if(node.getRight() != null){
                            Node n = new Node(value, null, null);
                            node.setRight(n);
                            queue.add(node.getRight().getRight());
                            node = new Node(value, null, null);
                        }
                    }
                }
            }
            System.out.print(node.getData() + " ");
        }
    }

    public void insertBreadthFirstSearch(int value){
        /* insere dados sob a lógica de pesquisa em largura */
        Queue<Node> queue = new LinkedList<Node>();

        queue.add(getRoot());
        Node node = null;
        while (node == null){
            node = queue.remove();
            if(node.getLeft() == null){
                Node n = new Node(value, null, null);
                node.setLeft(n);
                queue.add(node.getLeft());
                node = new Node(value, null, null);

            }else{
                if(node.getLeft() != null){
                    Node n = new Node(value, null, null);
                    node.setLeft(n);
                    queue.add(node.getLeft().getLeft());
                    node = new Node(value, null, null);
                }}
                if (node.getRight() == null){
                    Node n = new Node(value, null, null);
                    node.setRight(n);
                    queue.add(node.getRight());
                    node = new Node(value, null, null);
                }else{
                        if(node.getRight() != null){
                            Node n = new Node(value, null, null);
                            node.setRight(n);
                            queue.add(node.getRight().getRight());
                            node = new Node(value, null, null);
                        }

                }
            }
            System.out.print(node.getData() + " ");
        }



}
