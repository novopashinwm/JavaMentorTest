import com.company.RomanNumberConvertor;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class RomanToIntTest {

    @Test
    public void Test01() {
        Assert.assertEquals(RomanNumberConvertor.toInt("I"), 1);
    }

    @Test
    public void Test02() {
        assertEquals(RomanNumberConvertor.toInt("II"), 2);
    }

    @Test
    public void Test03() {
        assertEquals(RomanNumberConvertor.toInt("III"), 3);
    }

    @Test
    public void Test04() {
        assertEquals(RomanNumberConvertor.toInt("IV"), 4);
    }

    @Test
    public void Test05() {
        assertEquals(RomanNumberConvertor.toInt("V"), 5);
    }

    @Test
    public void Test06() {
        assertEquals(RomanNumberConvertor.toInt("VI"), 6);
    }

    @Test
    public void Test07() {
        assertEquals(RomanNumberConvertor.toInt("VII"), 7);
    }

    @Test
    public void Test08() {
        assertEquals(RomanNumberConvertor.toInt("VIII"), 8);
    }

    @Test
    public void Test09() {
        assertEquals(RomanNumberConvertor.toInt("IX"), 9);
    }

    @Test
    public void Test10() {
        assertEquals(RomanNumberConvertor.toInt("X"), 10);
    }

    @Test
    public void Test11() {
        Assert.assertEquals(RomanNumberConvertor.toInt("XI"), 11);
    }

    @Test
    public void Test12() {
        assertEquals(RomanNumberConvertor.toInt("XII"), 12);
    }

    @Test
    public void Test13() {
        assertEquals(RomanNumberConvertor.toInt("XIII"), 13);
    }

    @Test
    public void Test14() {
        assertEquals(RomanNumberConvertor.toInt("XIV"), 14);
    }

    @Test
    public void Test15() {
        assertEquals(RomanNumberConvertor.toInt("XV"), 15);
    }

    @Test
    public void Test16() {
        assertEquals(RomanNumberConvertor.toInt("XVI"), 16);
    }

    @Test
    public void Test17() {
        assertEquals(RomanNumberConvertor.toInt("XVII"), 17);
    }

    @Test
    public void Test18() {
        assertEquals(RomanNumberConvertor.toInt("XVIII"), 18);
    }

    @Test
    public void Test19() {
        assertEquals(RomanNumberConvertor.toInt("XIX"), 19);
    }

    @Test
    public void Test20() {
        assertEquals(RomanNumberConvertor.toInt("XX"), 20);
    }

}