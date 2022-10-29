package com.danirod.firebasetutorial

import java.util.*

class PruebaElementos {
    private fun String.isOnlyLetter() = all { it.isLetter() }
    private fun String.isNumeric() = all { it.isDigit() }

    fun nombres(str: String): String {
        return if (!str.isOnlyLetter() || str == "" || str.length >= 40)
            "Valor erróneo"
        else
            str.lowercase().replaceFirstChar {
            if (it.isLowerCase()) it.titlecase(Locale.ROOT) else it.toString()
        }
    }

    fun telefono(str: String): String {
        return if (!str.isNumeric() || str == "" || str.length >= 10)
            "Valor erróneo"
        else
            str
    }

}
