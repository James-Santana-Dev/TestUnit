import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

internal class CalculadoraTest {

    val calculadora = Calculadora()

    @Test
    fun soma() {
        assertEquals(6, calculadora.soma(5,1))
    }

    @Test
    fun subtracao() {
        assertEquals(5, calculadora.subtracao(10,5))
    }

    @Test
    fun multiplicacao() {
        assertEquals(8, calculadora.multiplicacao(2,4))
    }

    @Test
    fun divisao() {
        assertEquals(2, calculadora.divisao(4,2))
    }

    @Test
    fun potencia() {
        assertEquals(8.0, calculadora.potencia(2,3))
    }

    @Test
    fun raiz() {
        assertEquals(9.0, calculadora.raiz(81,2))

    }
}