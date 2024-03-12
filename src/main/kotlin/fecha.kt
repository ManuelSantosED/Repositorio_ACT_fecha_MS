class Fecha(private val dias: Int, private val mes: Int, private val a: Int) {


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
            2 -> diasMes = if (a % 400 == 0 || a % 4 == 0 && a % 100 != 0) 29 else 28
        }
        return if (dias > diasMes) false else true
    }
}








