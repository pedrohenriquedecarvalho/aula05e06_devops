package com.senai;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class CalculadoraTest {

    // Anotação de teste
    @Test
    void testarSoma() {

        // Cria objeto calculadora
        Calculadora calculadora = new Calculadora();

        // Declara variável resultado para armazenar
        // o retorno da função somar
        int resultado = calculadora.somar(2, 3);

        // Compara o resultado esperado com o resultado obtido
        assertEquals(5, resultado);
    }
}