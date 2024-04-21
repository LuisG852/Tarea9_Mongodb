package org.example;

// Clase que representa un nodo en una lista enlazada.
public class Nodo<T> {
    public T valor; // Valor almacenado en el nodo
    public Nodo<T> siguiente;// Referencia al siguiente nodo.


    // Constructor de la clase Nodo
    public Nodo(T valor) {
        this.valor = valor;
        this.siguiente = null;
    }
}
