package org.example.app
import org.example.app.Fecha

class App {
    fun arranque(){
        var fecha: Fecha
        fecha=Fecha()

        fecha.inicializar(2026,5,29)

        println(fecha.toString())
    }
}
