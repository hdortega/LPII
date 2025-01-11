package com.example;

import javax.enterprise.context.ApplicationScoped;
import java.util.List;
import java.util.stream.Collectors;

@ApplicationScoped  // Hacemos que la clase sea un bean CDI
public class SegundoParcialService {

    // Método para contar cuántos palíndromos hay en la lista
    public int contarPalindromos(List<String> lista) {
        if (lista == null) return 0;  // Si la lista es nula, devolvemos 0
        // Contamos los elementos que son palíndromos
        return (int) lista.stream()
                          .filter(this::esPalindromo)  // Filtramos por palíndromos
                          .count();
    }

    // Método para obtener una lista con solo los elementos que son palíndromos
    public List<String> obtenerPalindromos(List<String> lista) {
        if (lista == null) return List.of();  // Si la lista es nula, devolvemos una lista vacía
        // Filtramos y devolvemos solo los palíndromos
        return lista.stream()
                    .filter(this::esPalindromo)  // Filtramos por palíndromos
                    .collect(Collectors.toList());  // Recogemos el resultado en una lista
    }

    // Método auxiliar para verificar si una palabra es palíndromo
    private boolean esPalindromo(String palabra) {
        if (palabra == null) return false;  // Si la palabra es nula, no es un palíndromo
        // Convertimos la palabra a minúsculas y la comparamos con su reverso
        String palabraRevertida = new StringBuilder(palabra).reverse().toString();
        return palabra.equalsIgnoreCase(palabraRevertida);  // Comparar ignorando mayúsculas/minúsculas
    }
}
