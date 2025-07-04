
# Práctica de Arboles Binarios

## 📌 Información General

- **Título:** Práctica de Arboles Binarios
- **Asignatura:** Estructura de Datos
- **Carrera:** Computación
- **Estudiante:** Nicolás Cedillo
- **Fecha:** 4 de julio de 2025
- **Profesor:** Ing. Pablo Torres

---

## 🛠️ Descripción

Práctica de los 4 ejercicios de Arboles Binarios:
- Inserción de nodos
- Inversión de árboles
- Listado de niveles
- Cálculo de profundidad

Explicación de cada ejercicio:

### Ejercicio 1: Inserción de Nodos
Metodo donde se insertan nodos con valores enteros. El método se encarga de colocar el nodo en la posicion correcta

```java
    public Node insert(Node node, int value) {
    if (node == null) {
      Node newNode = new Node(value); //Se crea un nuevi nodo para la raiz
      return newNode;
    }

    if (value < node.getValue()) {
      node.setLeft(insert(node.getLeft(), value)); // Metodo recursivo para insertar en la iquierda

    } else if (value > node.getValue()) {
      node.setRight(insert(node.getRight(), value)); // Metodo recursivo para insertar en la derecha
    } 

    return node;
  }
```

### Ejercicio 2: Inversión de Árboles
Se implementa un método para invertir un árbol binario, intercambiando recursivamente los nodos hijos izquierdo y derecho de cada nodo.

```java
    public Node invertTree(Node root){
        if(root == null) {
            return null; // Si el nodo es nulo, no hay nada que invertir
        }
        Node temp = root.getLeft(); // Se guarda el hijo izquierdo en un temp

        root.setLeft(invertTree(root.getRight())); // Se invierte el hijo derecho
        root.setRight(invertTree(temp)); // Se invierte el hijo izquierdo

        return root;
    }
```

### Ejercicio 3: Listado de Niveles
Se implementa un método que lista los nodos de un árbol binario por niveles.

```java
    public List<List<Node>> listLevels(Node root){
        List<List<Node>> list = new ArrayList<>(); //Lista de listas

        LinkedList<Node> rootLista = new LinkedList<>();
        rootLista.add(root); // Se agrega la raiz a la lista

        while(!rootLista.isEmpty()){ // Mientras la lista no esté vacía

            List<Node> level = new ArrayList<>(); // Lista del nievel
            int size = rootLista.size(); // Tamaño de la lista actual

            for(int i = 0; i < size; i++){

                Node currentNode = rootLista.poll(); // Se obtiene el primer nodo de la lista
                level.add(currentNode); // Se agrega el nodo actual a la lista del nivel

                if(currentNode.getLeft() != null){
                    rootLista.add(currentNode.getLeft()); // Si el hijo izquierdo no es nulo se agrega a la lista
                }

                if(currentNode.getRight() != null){
                    rootLista.add(currentNode.getRight()); // Si el hijo derecho no es nulo se agrega a la lista
                }

            }
            list.add(level); // Se agrega la lista del nivel a la lista de listas
        }

        return list;
    }
```

### Ejercicio 4: Cálculo de Profundidad
Se implementa un método que calcula la profundidad máxima de un árbol.


```java
    public int maxDepth(Node root){
        if(root == null){
            return 0; // Si es nulo la profundidad es 0
        }
        return 1 + Math.max(maxDepth(root.getLeft()), maxDepth(root.getRight()));
        // Se retorna 1 + el maximo de la profundidad del hijo izquierdo y derecho
    }
```

---

## 🚀 Ejecución

Para ejecutar el proyecto:

1. Compila el código:
    ```bash
    javac App.java
    ```
2. Ejecuta la aplicación:
    ```bash
    java App
    ```

---

## 🧑‍💻 Ejemplo de Salida

```plaintext
------EJERCICIO 1------
Raiz: 5
Hijo izq de la raíz: 3
Hijo der de la raíz: 7
Hijo izq del hijo izq: 2
Hijo der del hijo izq: 4
Hijo izq del hijo der: 6
Hijo der del hijo der: 8
------EJERCICIO 2------
Raiz invertida: 4
Hijo izq de la raíz invertida: 7
Hijo der de la raíz invertida: 2
Hijo izq del hijo izq invertido: 9
Hijo der del hijo izq invertido: 6
Hijo izq del hijo der invertido: 3
Hijo der del hijo der invertido: 1

-----EJERCICIO 3------
Nivel 0: 4 -
Nivel 1: 2 - 7 -
Nivel 2: 1 - 3 - 6 - 9 -

-----EJERCICIO 4------
Profundidad máxima: 3 (mismo arbol del ejecicio 3)
```

---



