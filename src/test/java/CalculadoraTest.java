import org.example.Calculadora;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CalculadoraTest {

    Calculadora calc = new Calculadora();

    @Test
    public void deveSomarCorretamente() {
        assertEquals(5.0, calc.somar(2, 3), 0.0001);
    }

    @Test
    public void deveSubtrairCorretamente() {
        assertEquals(1.0, calc.subtrair(3, 2), 0.0001);
    }

    @Test
    public void deveMultiplicarCorretamente() {
        assertEquals(6.0, calc.multiplicar(2, 3), 0.0001);
    }

    @Test
    public void deveDividirCorretamente() {
        assertEquals(2.0, calc.dividir(6, 3), 0.0001);
    }

    @Test
    public void deveLancarErroAoDividirPorZero() {
        Exception exception = assertThrows(ArithmeticException.class, () -> {
            calc.dividir(10, 0);
        });

        assertEquals("Não é possível dividir por zero", exception.getMessage());
    }
}