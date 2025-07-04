package main;

import java.util.List;

import main.Ejercicio_01_insert.InsertBST;
import main.Ejercicio_02_invert.InvertBinaryTree;
import main.Ejercicio_03_listLeves.ListLevels;
import main.Ejercicio_04_depth.Depth;
import main.Materia.Controllers.ArbolBinario;
import main.Materia.Models.Node;
import utils.StudentValidator;

public class App {
    public static void main(String[] args) throws Exception {
        // NO MODIFICAR ESTE CÓDIGO
        var estudiante = StudentValidator.validarDatos();
        System.out.println("👤 Estudiante: " + estudiante.nombre());
        System.out.println("✉️  Correo: " + estudiante.correo());
        // NO MODIFICAR HASTA AQUÍ

        InsertBST insertBST = new InsertBST();
        Node root = null;
        root = insertBST.insert(root, 5);
        insertBST.insert(root, 3);
        insertBST.insert(root, 7);
        insertBST.insert(root, 2);
        insertBST.insert(root, 4);
        insertBST.insert(root, 6);
        insertBST.insert(root, 8);

        System.out.println("\n------EJERCICIO 1------");
        System.out.println("Raiz: " + root.getValue());
        System.out.println("Hijo izq de la raíz: " + root.getLeft().getValue());
        System.out.println("Hijo der de la raíz: " + root.getRight().getValue());
        System.out.println("Hijo izq del hijo izq: " + root.getLeft().getLeft().getValue());
        System.out.println("Hijo der del hijo izq: " + root.getLeft().getRight().getValue());
        System.out.println("Hijo izq del hijo der: " + root.getRight().getLeft().getValue());
        System.out.println("Hijo der del hijo der: " + root.getRight().getRight().getValue());

        InvertBinaryTree invertBinaryTree = new InvertBinaryTree();
        Node root2 = null;
        root2 = insertBST.insert(root2, 4);
        insertBST.insert(root2, 2);
        insertBST.insert(root2, 7);
        insertBST.insert(root2, 1);
        insertBST.insert(root2, 3);
        insertBST.insert(root2, 6);
        insertBST.insert(root2, 9);

        invertBinaryTree.invertTree(root2);

        System.out.println("------EJERCICIO 2------");
        System.out.println("Raiz invertida: " + root2.getValue());
        System.out.println("Hijo izq de la raíz invertida: " + root2.getLeft().getValue());
        System.out.println("Hijo der de la raíz invertida: " + root2.getRight().getValue());
        System.out.println("Hijo izq del hijo izq invertido: " + root2.getLeft().getLeft().getValue());
        System.out.println("Hijo der del hijo izq invertido: " + root2.getLeft().getRight().getValue());
        System.out.println("Hijo izq del hijo der invertido: " + root2.getRight().getLeft().getValue());
        System.out.println("Hijo der del hijo der invertido: " + root2.getRight().getRight().getValue());

        ListLevels listLevels = new ListLevels();
        ArbolBinario arbolBinario2 = new ArbolBinario();
        arbolBinario2.insert(4);
        arbolBinario2.insert(2);
        arbolBinario2.insert(7);
        arbolBinario2.insert(1);
        arbolBinario2.insert(3);
        arbolBinario2.insert(6);
        arbolBinario2.insert(9);
        List<List<Node>> levels = listLevels.listLevels(arbolBinario2.getRoot());

        System.out.println("\n-----EJERCICIO 3------");
        for (int i = 0; i < levels.size(); i++) {
            System.out.print("Nivel " + i + ": ");
            for (Node node : levels.get(i)) {
                System.out.print(node.getValue() + " - ");
            }
            System.out.println();
        }

        Depth depth = new Depth();
        int maxDepth = depth.maxDepth(arbolBinario2.getRoot());
        System.out.println("\n-----EJERCICIO 4------");
        System.out.println("Profundidad máxima: " + maxDepth + " (mismo arbol del ejecicio 3)");

    }

}
