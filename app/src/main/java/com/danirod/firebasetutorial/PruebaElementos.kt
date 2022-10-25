package com.danirod.firebasetutorial

import java.util.*

class PruebaElementos {
    private fun String.isOnlyLetter() = all { it.isLetter() }
    private fun String.isNumeric() = all { it.isDigit() }

    fun nombres(str: String): String = if (!str.isOnlyLetter() || str == "") "Valor erróneo" else str
        .lowercase().replaceFirstChar { if (it.isLowerCase()) it.titlecase(Locale.ROOT) else it.toString() }

    fun telefono(str: String): String = if (!str.isNumeric() || str == "") "Valor erróneo" else str

}