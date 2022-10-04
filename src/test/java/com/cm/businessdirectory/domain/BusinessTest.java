package com.cm.businessdirectory.domain;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Collections;

import static org.junit.jupiter.api.Assertions.assertEquals;

class BusinessTest
{
    @Test
    @DisplayName("Validates a Business entity using Java record type can be created")
    void givenValidData_whenGetNameAndDescription_thenExpectedValuesReturned() {
        String name = "Partipan";
        String description = "Panaderia del barrio";

        var business = new Business(name,description, Collections.emptyList());

        //alternativa para llamar los gets.
        assertEquals(name, business.name());
        assertEquals(description,business.description());
    }
}
