package Views;
import Controllers.Node;
import Controllers.Tree;


public class DataEntryForTree {
    /*Recebe entrada de dados para a árvore*/

    public Tree entryData(int[] vector){
        /*
          ♣ recebe um vetor para alimentar a árvore
          e retorna a árvore preenchida ♣
        */
        Tree tree = new Tree();
        tree.setRoot(new Node(vector[0], null, null));

        for(int i = 1; i < vector.length; i++) {
            //if(i == 0) tree.setRoot(new Node(vector[i], null, null));
            tree.insertData(tree.getRoot(), vector[i], tree.getRoot());
        }

        return tree;
    }
}
