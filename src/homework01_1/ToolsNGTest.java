/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package homework01_1;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

/**
 * @author yiwzhong
 */
public class ToolsNGTest {

    public ToolsNGTest() {

    }

    /**
     * Test of toBinary method, of class Tools.
     */
    @Test
    public void testToBinary() {
        Object[][] datas = new Object[][]{
                {0, "0"},
                {5, "101"},
                {10, "1010"},
                {11, "1011"}
        };
        for (Object[] data : datas) {
            String result = homework01.Tools.toBinary((int) data[0]); //Actual
            String expResult = (String) data[1];           //Expected
            assertEquals(result, expResult);
            System.out.println("testToBinary()");
        }
    }

    /**
     * Test of toOctal method, of class Tools.
     */
    @Test
    public void testToOctal() {
        Object[][] datas = new Object[][]{
                {0, "0"},
                {5, "5"},
                {10, "12"},
                {11, "13"}
        };
        for (Object[] data : datas) {
            String result = homework01.Tools.toOctal((int) data[0]);   //Actual
            String expResult = (String) data[1];           //Expected
            assertEquals(result, expResult);
            System.out.println("testToOctal()");
        }
    }

    @DataProvider(name = "dataForHexadecimal")
    public static Object[][] dataForH() {
        return new Object[][]{
                {122, "7A"},
                {0, "0"},
                {10, "A"},
                {78, "4E"}
        };
    }

    /**
     * Test of toHexadecimal method, of class Tools.
     */
    @Test(dataProvider = "dataForHexadecimal")
    public void testToHexadecimal(int num, String hexadecimal) {
        String result = homework01.Tools.toHexadecimal(num);
        assertEquals(result, hexadecimal);
        System.out.println("testToHexadecimal()");
    }

    @DataProvider(name = "dataForOther")
    public static Object[][] dataForO() {
        return new Object[][]{
                {0, 2, "0"},
                {0, 8, "0"},
                {0, 16, "0"},
                {1, 2, "1"},
                {78, 16, "4E"},
                {11, 8, "13"},
                {20, 2, "10100"}
        };
    }

    /**
     * Test of toOther method, of class Tools.
     */
    @Test(dataProvider = "dataForOther")
    public void testToOther(int num, int d, String string) {
        String result = homework01.Tools.toOther(num, d);
        assertEquals(result, string);
        System.out.println("testToOther()");

    }

    /**
     * Test of toChar method, of class Tools.
     */
    @Test
    public void testToChar() {
        Object[][] datas = new Object[][]{
                {1, '1'},
                {5, '5'},
                {10, 'A'},
                {11, 'B'},
                {12, 'C'},
                {13, 'D'},
                {14, 'E'},
                {15, 'F'}
        };
        for (Object[] data : datas) {
            char result = homework01.Tools.toChar((Integer) data[0]);
            char expResult = (Character) data[1];
            assertEquals(result, expResult);
            System.out.println("testToChar()");
        }
    }

    @DataProvider(name = "dataForMatch")
    public Object[][] dataForIsMatch() {
        return new Object[][]{
                {"12+[(12+23)*4)*5", false},
                {"12+[(12+23)+15]*12", true},
                {"[[(])]", false},
                {"([])()[]", true}};
    }

    /**
     * Test of isMatch method, of class Tools.
     */
    @Test(dataProvider = "dataForMatch")
    public void testIsMatch(String exp, boolean expResult) {
        boolean result = Tools.isMatch(exp);
        assertEquals(result, expResult);
        System.out.println("testIsMatch()");
    }

}
