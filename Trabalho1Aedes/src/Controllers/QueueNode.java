package Controllers;

public class QueueNode {
    /*  Classe nó para a fila  */
    private Object data;
    private QueueNode next_node;

    public QueueNode(Object data, QueueNode next_node) {
        this.data = data;
        this.next_node = next_node;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public QueueNode getNext_node() {
        return next_node;
    }

    public void setNext_node(QueueNode next_node) {
        this.next_node = next_node;
    }
}
