package com.example;

import javax.enterprise.context.ApplicationScoped;
import java.util.List;

@ApplicationScoped
public class SegundoParcialService {

    // Método para contar palíndromos
    public int contarPalindromos(List<String> lista) {
        if (lista == null) return 0;
        return (int) lista.stream()
                          .filter(this::esPalindromo)
                          .count();
    }

    // Método para obtener la lista de palíndromos
    public List<String> obtenerPalindromos(List<String> lista) {
        if (lista == null) return List.of();
        return lista.stream()
                    .filter(this::esPalindromo)
                    .toList();
    }

    // Método auxiliar para comprobar si una palabra es palíndromo
    private boolean esPalindromo(String palabra) {
        if (palabra == null) return false;
        String palabraRevertida = new StringBuilder(palabra).reverse().toString();
        return palabra.equalsIgnoreCase(palabraRevertida);
    }
}
