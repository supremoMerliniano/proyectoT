package com.danirod.firebasetutorial

import com.google.common.truth.Truth.assertThat
import org.junit.Test

class PruebaElementosTest {

    private val pruebas = PruebaElementos()
    private var str: String = ""

    @Test
    fun `nombre propio entra cadena vacia regresa valor erroneo`() {
        assertThat(pruebas.nombres(str)).isEqualTo("Valor erróneo")
        assertThat(pruebas.telefono(str)).isEqualTo("Valor erróneo")
    }

    @Test
    fun `nombre propio entra cadena alfanumerica regresa valor erroneo`() {
        str = "1234567891011"

        assertThat(pruebas.nombres(str)).isEqualTo("Valor erróneo")
        assertThat(pruebas.telefono(str)).isEqualTo("Valor erróneo")
    }

    @Test
    fun `dan13l entra regresa valor erroneo`() {
        str = "dan13l"

        assertThat(pruebas.nombres(str)).isEqualTo("Valor erróneo")
        assertThat(pruebas.telefono(str)).isEqualTo("Valor erróneo")
    }

    @Test
    fun `caracteres especiales entran regresa valor erroneo`() {
        str = "@-+{}"

        assertThat(pruebas.nombres(str)).isEqualTo("Valor erróneo")
        assertThat(pruebas.telefono(str)).isEqualTo("Valor erróneo")
    }

    @Test
    fun `d@n13l entra regresa valor erroneo`() {
        str = "d@n13l"

        assertThat(pruebas.nombres(str)).isEqualTo("Valor erróneo")
        assertThat(pruebas.telefono(str)).isEqualTo("Valor erróneo")
    }

    @Test
    fun `daniel entra regresa Daniel`() { // Campo nombres propios
        str = "daniel"

        assertThat(pruebas.nombres(str)).isEqualTo("Daniel")
        assertThat(pruebas.telefono(str)).isEqualTo("Valor erróneo")
    }

    @Test
    fun `DANIEL entra regresa Daniel`() { // Campo nombres propios
        str = "DANIEL"

        assertThat(pruebas.nombres(str)).isEqualTo("Daniel")
        assertThat(pruebas.telefono(str)).isEqualTo("Valor erróneo")
    }

    @Test
    fun `DaNiEl entra regresa Daniel`() { // Campo nombres propios
        str = "DaNiEl"

        assertThat(pruebas.nombres(str)).isEqualTo("Daniel")
        assertThat(pruebas.telefono(str)).isEqualTo("Valor erróneo")
    }
}