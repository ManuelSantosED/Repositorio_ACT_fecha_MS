/**
 * Fecha
 * @author
 * @property dia
 * @property mes
 * @property anio
 * @constructor Create empty Fecha
 */
class Fecha(private val dia: Int, private val mes: Int, private val anio: Int) {


    /**
     * Valida
     * La funcion validar, comprueba que el mes no tenga mas dias de los que les corresponden
     * @return
     */
    fun valida(): Boolean {

        var esValida = false
        if ((dia >= 1 || dia <= 31) && (mes >= 1 || mes <= 12)) {
            var diasMes = diasDelMes(mes)
            esValida = dia <= diasMes

        }

        // determinamos la cantidad de días del mes:

        return esValida
    } // … más métodos


    /**
     * esBisiesto
     * Comprueba que el año es bisiesto segun la formula
     * * @return
     */
    private fun esBisiesto(anio: Int): Boolean = anio % 400 == 0 || anio % 4 == 0 && anio % 100 != 0


    /**
     * esBisiesto
     * Asigna el numero de dias que tienen los meses
     * @return
     */
    private fun diasDelMes(mes: Int): Int {
        var diasMes = 0
        when (mes) {
            1, 3, 5, 7, 8, 10, 12 -> diasMes = 31
            4, 6, 9, 11 -> diasMes = 30
            2 -> diasMes = if (esBisiesto(anio)) 29 else 28
        }
        return diasMes
    }
}


