package fr.insalyon.telecom.mgl;

import org.junit.Before;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class RomanNumberConverterTest {

    private RomanNumberConverter romanNumberConverter;

    @Before
    public void setup() {
        romanNumberConverter = new RomanNumberConverter();
    }

    @Test
    public void convert_return1GivenI() {
        assertThat(romanNumberConverter.convert("I"))
                .isEqualTo(1);
    }

    @Test
    public void convert_return2GivenII() {
        assertThat(romanNumberConverter.convert("II"))
                .isEqualTo(2);
    }

    @Test
    public void convert_return5GivenV() {
        assertThat(romanNumberConverter.convert("V"))
                .isEqualTo(5);
    }

    @Test
    public void convert_return10GivenX() {
        assertThat(romanNumberConverter.convert("X"))
                .isEqualTo(10);
    }

    @Test
    public void convert_return50GivenL() {
        assertThat(romanNumberConverter.convert("L"))
                .isEqualTo(50);
    }

    @Test
    public void convert_return100GivenC() {
        assertThat(romanNumberConverter.convert("C"))
                .isEqualTo(100);
    }

    @Test
    public void convert_return500GivenD() {
        assertThat(romanNumberConverter.convert("D"))
                .isEqualTo(500);
    }

    @Test
    public void convert_return1000GivenM() {
        assertThat(romanNumberConverter.convert("M"))
                .isEqualTo(1000);
    }

    @Test
    public void convert_return4000GivenMMMM() {
        assertThat(romanNumberConverter.convert("MMMM"))
                .isEqualTo(4000);
    }

    @Test(expected = IllegalArgumentException.class)
    public void convert_returnExceptionGivenIIII() {
        romanNumberConverter.convert("IIII");
    }

    @Test(expected = IllegalArgumentException.class)
    public void convert_returnExceptionGivenABC() {
        romanNumberConverter.convert("ABC");
    }

    @Test(expected = IllegalArgumentException.class)
    public void convert_returnExceptionGivenNumber() {
        romanNumberConverter.convert("-10");
    }

    @Test
    public void convert_return4GivenIV() {
        assertThat(romanNumberConverter.convert("IV"))
                .isEqualTo(4);
    }

    @Test
    public void convert_return151GivenCLI() {
        assertThat(romanNumberConverter.convert("CLI"))
                .isEqualTo(151);
    }

    @Test
    public void convert_return1059GivenMLIX() {
        assertThat(romanNumberConverter.convert("MLIX"))
                .isEqualTo(1059);
    }

    @Test
    public void getUpperRoman_returnIgiven1() {
        assertThat(romanNumberConverter.getUpperRoman(1))
                .isEqualTo(0);
    }

    @Test
    public void getUpperRoman_returnIgiven2() {
        assertThat(romanNumberConverter.getUpperRoman(2))
                .isEqualTo(1);
    }

    @Test
    public void getUpperRoman_returnIgiven3() {
        assertThat(romanNumberConverter.getUpperRoman(3))
                .isEqualTo(1);
    }

    @Test
    public void getUpperRoman_returnVgiven4() {
        assertThat(romanNumberConverter.getUpperRoman(4))
                .isEqualTo(1);
    }

    @Test
    public void getUpperRoman_returnVgiven5() {
        assertThat(romanNumberConverter.getUpperRoman(5))
                .isEqualTo(1);
    }

    @Test
    public void getUpperRoman_returnXgiven6() {
        assertThat(romanNumberConverter.getUpperRoman(6))
                .isEqualTo(2);
    }

    @Test
    public void getUpperRoman_returnXgiven8() {
        assertThat(romanNumberConverter.getUpperRoman(8))
                .isEqualTo(2);
    }

    @Test
    public void getUpperRoman_returnXgiven9() {
        assertThat(romanNumberConverter.getUpperRoman(9))
                .isEqualTo(2);
    }

    @Test
    public void convert_returnIGiven1() {
        assertThat(romanNumberConverter.convert(1))
                .isEqualTo("I");
    }

    @Test
    public void convert_returnIIGiven2() {
        assertThat(romanNumberConverter.convert(2))
                .isEqualTo("II");
    }

    @Test
    public void convert_returnVGiven5() {
        assertThat(romanNumberConverter.convert(5))
                .isEqualTo("V");
    }

    @Test
    public void convert_returnVIGiven6() {
        assertThat(romanNumberConverter.convert(6))
                .isEqualTo("VI");
    }

    @Test
    public void convert_returnIVGiven4() {
        assertThat(romanNumberConverter.convert(4))
                .isEqualTo("IV");
    }

    @Test
    public void convert_returnVIIGiven7() {
        assertThat(romanNumberConverter.convert(7))
                .isEqualTo("VII");
    }

    @Test
    public void convert_returnVIIIGiven8() {
        assertThat(romanNumberConverter.convert(8))
                .isEqualTo("VIII");
    }

    @Test
    public void convert_returnMMGiven2000() {
        assertThat(romanNumberConverter.convert(2000))
                .isEqualTo("MM");
    }

    @Test
    public void convert_returnMMVIIGiven2007() {
        assertThat(romanNumberConverter.convert(2007))
                .isEqualTo("MMVII");
    }

    @Test(expected = IllegalArgumentException.class)
    public void convert_returnExceptionGivenZero() {
        romanNumberConverter.convert(0);
    }

}
