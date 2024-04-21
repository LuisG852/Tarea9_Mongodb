package org.example;

// Clase que representa una lista enlazada.
public class ListaEnlazada<T> {
    private Nodo<T> cabeza;// Nodo inicial de la lista


    // Constructor de la clase ListaEnlazada
    public ListaEnlazada() {
        this.cabeza = null;
    }

    // Método para insertar un valor en la lista
    public void insertar(T valor) {
        Nodo<T> nuevoNodo = new Nodo<>(valor);  // Crear un nuevo nodo con el valor dado
        if (cabeza == null) {  // Si la lista está vacía, el nuevo nodo será la cabeza
            cabeza = nuevoNodo;
        } else {
            Nodo<T> actual = cabeza;
            while (actual.siguiente != null) {  // Recorrer la lista hasta el último nodo
                actual = actual.siguiente;
            }
            actual.siguiente = nuevoNodo;  // Insertar el nuevo nodo al final de la lista
        }
    }

    // Método para imprimir los valores de la lista
    public void imprimir() {
        Nodo<T> actual = cabeza;
        while (actual != null) {  // Recorrer la lista y imprimir cada valor
            System.out.println(actual.valor);
            actual = actual.siguiente;
        }
    }
}
