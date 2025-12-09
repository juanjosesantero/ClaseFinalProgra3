package com.usal;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

public class PersonaTest {
    // Test -> canario
    @Test
    void fromString_ShouldReturnPersona_WhenInputIsValid() {
        // AAA (Arrange, Act, Assert)
        // Arrange
        String input = "Juan,Garcia";
        // Act
        Persona persona = Persona.fromCSVString(input);
        // Assert
        assertNotNull(persona);
        assertEquals("Juan", persona.getNombre());
        assertEquals("Garcia", persona.getApellidos());
    }

    @Test
    void fromString_ShouldThrowException_WhenInputIsNull() {
        String input = null;
        assertThrows(IllegalArgumentException.class, () -> Persona.fromCSVString(input));
    }

}