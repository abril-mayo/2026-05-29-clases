package org.example.app
class Fecha(private var ano:Int=0,private var mes:Int=0,private var dia:Int=0){
   fun inicializar(ano:Int,mes:Int,dia:Int){
       this.ano=ano
       this.mes=mes
       this.dia=dia
   }

   override fun toString():String{
       return "Fecha (Año: ${ano},mes: ${mes}, dia: ${dia})"
   }
}