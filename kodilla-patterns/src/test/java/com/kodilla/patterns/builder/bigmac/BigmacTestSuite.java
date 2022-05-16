package com.kodilla.patterns.builder.bigmac;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BigmacTestSuite {

    @Test
    void testNewBigmac() {
        //Given
        Bigmac bigmac = new Bigmac.BigmacBuilder()
                .ingredient("Onion")
                .bun("With sesame")
                .burgers(2)
                .sauce("Spicy")
                .ingredient("Jalapeno")
                .build();
        System.out.println(bigmac);
        //When
        int howManyIngredients = bigmac.getIngredients().size();
        int howManyBurgers = bigmac.getBurgers();
        List<String> ingredients1 = List.of("Onion", "Jalapeno");

        //Then
        assertEquals(2, howManyIngredients);
        assertEquals(2, howManyBurgers);
        assertEquals("With sesame", bigmac.getBun());
        assertEquals(ingredients1, bigmac.getIngredients());
    }
}
