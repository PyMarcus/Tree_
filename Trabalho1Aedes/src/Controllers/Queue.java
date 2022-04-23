package Controllers;

public class Queue {
    /*
       ☻ Classe que implementa a estrutura de dados fila
       estrutura que, o primeiro item torna-se o primeiro a ser liberado
       (NÃO UTILIZADA POR SE TRATAR DE MANIPULAÇÂO DE NÓS)
     */
    private QueueNode first = null;
    private QueueNode last = null;

    // construtor default

    // getters e setters
    public QueueNode getFirst() {
        return first;
    }

    public void setFirst(QueueNode first) {
        this.first = first;
    }

    public QueueNode getLast() {
        return last;
    }

    public void setLast(QueueNode last) {
        this.last = last;
    }

    public void put(int value){
        // insere dados na fila
        QueueNode node_ = new QueueNode(value,null);
        if(getFirst() == null){
            setFirst(node_);
            setLast(node_);
        }else{
            getLast().setNext_node(node_);
        }
    }

    public int get(){
        // remove item da fila
        int first = (int) getFirst().getData();
        setFirst(getFirst().getNext_node());
        if(getFirst() == null) setLast(null);
        return first;
    }

}
