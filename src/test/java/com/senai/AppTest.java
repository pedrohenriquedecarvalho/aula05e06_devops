// Codigo para poder realizar testes unitarios
package com.senai;

import static org.junit.Assert.assertEquals;
//import org.junit.jupiter.api.Test;

public class CalculadoraTest {
    // Anotação de teste
    @Test
    void testarSoma(){
        // Cria objeto calculadora
        Calculadora calculadora = new Calculadora();
        // declara variavel resultado para armazenar o retorno da função somar
        int resultado = calculadora.somar(2, 3);

        // Compara se o resultado que eu espero é o resultado que a conta deu
        assertEquals(5, resultado);

    }

    
}
