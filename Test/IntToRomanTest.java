import com.company.RomanNumberConvertor;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class IntToRomanTest {

    @Test
    public void Test01() {
        assertEquals(RomanNumberConvertor.toRoman(1),"I");
    }

    @Test
    public void Test02() {
        assertEquals(RomanNumberConvertor.toRoman(2),"II");
    }

    @Test
    public void Test03() {
        assertEquals(RomanNumberConvertor.toRoman(3),"III");
    }

    @Test
    public void Test04() {
        assertEquals(RomanNumberConvertor.toRoman(4),"IV");
    }

    @Test
    public void Test05() {
        assertEquals(RomanNumberConvertor.toRoman(5),"V");
    }

    @Test
    public void Test06() {
        assertEquals(RomanNumberConvertor.toRoman(6),"VI");
    }

    @Test
    public void Test07() {
        assertEquals(RomanNumberConvertor.toRoman(7),"VII");
    }

    @Test
    public void Test08() {
        assertEquals(RomanNumberConvertor.toRoman(8),"VIII");
    }

    @Test
    public void Test09() {
        assertEquals(RomanNumberConvertor.toRoman(9),"IX");
    }

    @Test
    public void Test10() {
        assertEquals(RomanNumberConvertor.toRoman(10),"X");
    }

    @Test
    public void Test11() {
        assertEquals(RomanNumberConvertor.toRoman(11),"XI");
    }

    @Test
    public void Test12() {
        assertEquals(RomanNumberConvertor.toRoman(12),"XII");
    }

    @Test
    public void Test13() {
        assertEquals(RomanNumberConvertor.toRoman(13),"XIII");
    }

    @Test
    public void Test14() {
        assertEquals(RomanNumberConvertor.toRoman(14),"XIV");
    }

    @Test
    public void Test15() {
        assertEquals(RomanNumberConvertor.toRoman(15),"XV");
    }

    @Test
    public void Test16() {
        assertEquals(RomanNumberConvertor.toRoman(16),"XVI");
    }

    @Test
    public void Test17() {
        assertEquals(RomanNumberConvertor.toRoman(17),"XVII");
    }

    @Test
    public void Test18() {
        assertEquals(RomanNumberConvertor.toRoman(18),"XVIII");
    }

    @Test
    public void Test19() {
        assertEquals(RomanNumberConvertor.toRoman(19),"XIX");
    }

    @Test
    public void Test20() {
        assertEquals(RomanNumberConvertor.toRoman(20),"XX");
    }
}
