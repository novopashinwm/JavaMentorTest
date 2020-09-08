import com.company.CalcProcessing;
import com.company.CalcStrategy;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CalcStrategyTest {

    @Test
    public void Test01() {
        assertThrows(IllegalArgumentException.class, ()->{CalcStrategy.calc("1+2\n");});
    }

    @Test
    public void Test02() {
        assertThrows(IllegalArgumentException.class, ()->{CalcStrategy.calc("4+V");});
    }

    @Test
    public void Test03() {
        assertEquals(CalcStrategy.calc("2+10"),"12");
    }

    @Test
    public void Test04() {
        assertEquals(CalcStrategy.calc("10+10"),"20");
    }

    @Test
    public void Test05() {
        assertEquals(CalcStrategy.calc("VII+III"),"X");
    }

    @Test
    public void Test06() {
        assertEquals(CalcStrategy.calc("X+X"),"XX");
    }

    @Test
    public void Test07() {
        assertEquals(CalcStrategy.calc("10*10"),"100");
    }

    @Test
    public void Test08() {
        assertEquals(CalcStrategy.calc("X*X"),"C");
    }
}