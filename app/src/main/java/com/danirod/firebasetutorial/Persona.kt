package com.danirod.firebasetutorial

class Persona(
    protected var nombre: String,
    protected var apa: String,
    protected var ama: String,
    protected var correo: String,
    protected var telefono: String
){

    fun toMap(): MutableMap<String, Any> {
        val usuario = mutableMapOf<String, Any>()

        usuario["nombre"] = this.nombre
        usuario["apa"] = this.apa
        usuario["ama"] = this.ama
        usuario["correo"] = this.correo
        usuario["telefono"] = this.telefono

        return usuario
    }

    override fun toString(): String {
        return "Persona(nombre='$nombre', apa='$apa', ama='$ama', correo='$correo', telefono='$telefono')"
    }
}