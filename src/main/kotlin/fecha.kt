
    class Fecha(private val dias: Int, private val mes: Int, private val anio: Int) {


        fun valida(): Boolean {

            if (dias < 1 || dias > 31) return false
            if (mes < 1 || mes > 12) return false

            // determinamos la cantidad de días del mes:
            return diasMes()
        } // … más métodos




    private fun diasMes(): Boolean {
        var diasMes = 0
        when (mes) {
            1, 3, 5, 7, 8, 10, 12 -> diasMes = 31
            4, 6, 9, 11 -> diasMes = 30
            2 -> diasMes = if (anio % 400 == 0 || anio % 4 == 0 && anio % 100 != 0) 29 else 28
        }
        return if (dias > diasMes) false else true
    }
}



