import Controllers.Node;
import Controllers.Tree;
import Views.DataEntryForTree;


public class Main {
    /*
        ○ Classe principal que contém o método main ○
     */
    public static void main(String[] args){
        int[] tree_data = {61, 89, 66, 43, 51, 16, 55, 11, 79, 77, 82, 32, 100, 90}; // poderia ser passado por input de dados

        DataEntryForTree data_entry_for_tree = new DataEntryForTree();
        Tree _tree = data_entry_for_tree.entryData(tree_data);  // insere os dados

        // 1) impressão postOrder
        System.out.println("Impressão postOrder:");
        _tree.postOrder(_tree.getRoot());

        //2) pesquisa em largura
        System.out.println("\nPesquisa em largura:");
        _tree.breadthFirstSearch(); //_tree.getRoot()  Está com a inserção manual nele

        //3) Inserir dados de forma da busca em largura
        System.out.println("\nInserção em largura: ");
        _tree.setRoot(new Node(tree_data[0], null, null));
        //for(int i = 0; i < tree_data.length; i++) _tree.insertBreadthFirstSearch(tree_data[i]);

        Node a4 = new Node(696, null,null);
        Node a3 = new Node(11, null, null);
        Node a2 = new Node(43, a3, a4);
        Node a1 = new Node(89, null, null);
        Node a0 = new Node(61, a1, a2);
        _tree.setRoot(a0);
        Node[] teste = {a0, a1, a2, a3, a4};
        for(int i =0 ; i < 5; i++){
            _tree.insertBreadthFirstSearch(teste[i].getData());
        }

    }
}
