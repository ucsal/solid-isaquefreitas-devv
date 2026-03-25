package br.com.ucsal.olimpiadas.prova;

public class ValidadorAlternativa {

    public static char normalizar (char alternativa) {
        char maiuscula = Character.toUpperCase(alternativa);

        if (maiuscula < 'A' || maiuscula > 'E') {
            throw new IllegalArgumentException("Alternativa deve estar entre A e E");
        }
        return maiuscula;

    }
}
