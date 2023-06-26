package ua.lviv.iot.algo.part1.lab5;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class AddressTest {
    private static final Address address = new Address();


    @Test
    void testReplaceToAddress() {
        String  text = "Address of my house: Beregovo, str. Bucha 72a,\n" +
                "Address of my university: San-Andreas, str Stepana Bandery 1,\n" +
                "Address of my hostel: Lviv, str. Akademyka Andriya Saharova 0";
        String expected = "Address of my house: ADDRESS,\n" +
                "Address of my university: ADDRESS,\n" +
                "Address of my hostel: ADDRESS";
        Assertions.assertEquals(expected, address.replaceToAddress(text));
    }
    @Test
    void emptyText(){
        Assertions.assertNull(address.replaceToAddress(null));
    }
}