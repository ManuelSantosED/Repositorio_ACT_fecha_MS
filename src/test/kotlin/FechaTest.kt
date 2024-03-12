import org.junit.jupiter.api.AfterEach
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test

/**
 * Fecha test
 *
 * @constructor Create empty Fecha test
 */
class FechaTest {

    /**
     * Set up
     *
     */
    @BeforeEach
    fun setUp() {
    }

    /**
     * Tear down
     *
     */
    @AfterEach
    fun tearDown() {
    }

    /**
     * Valida
     *
     */
    @Test
    fun valida() {
        val fecha = Fecha(15, 13, 2023)
        //assertTrue(fecha.valida()) --> Esta nunca va a dar True pues no hay mes 13.
        assertFalse(fecha.valida())
    }


    /**
     * Fecha invalida dia
     *
     */
    @Test
    fun fechaInvalidaDia() {
        val fecha = Fecha(32, 5, 2022)
        assertFalse(fecha.valida())
    }

    /**
     * Fecha invalida mes
     *
     */
    @Test
    fun fechaInvalidaMes() {
        val fecha = Fecha(12, 13, 2021)
        // Assert.assertFalse(fecha.valida())
        assertFalse(fecha.valida())
    }

    /**
     * Fecha invalida febrero bisiesto
     *
     */
    @Test
    fun fechaInvalidaFebreroBisiesto() {
        val fecha = Fecha(29, 2, 2021)
        assertFalse(fecha.valida())
        println("Fecha invalida")
        println(fecha.valida())
    }

    /**
     * Fecha valida febrero bisiesto
     *
     */
    @Test
    fun fechaValidaFebreroBisiesto() {
        val fecha = Fecha(29, 2, 2024)
        assertTrue(fecha.valida())
        println("Fecha valida Bisiesto")
        println(fecha.valida())
    }
}



