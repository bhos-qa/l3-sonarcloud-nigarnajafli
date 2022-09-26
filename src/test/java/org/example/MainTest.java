package org.example;

import static org.example.PermissionLevel.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;


public class MainTest {
    PermissionManager manager = new PermissionManager();
    @Test
    void testGet() {
        assertEquals("USER", manager.get());
    }

    @Test
    void testSet() {
        manager.set(ADMIN);
        assertEquals("ADMIN", manager.get());
        manager.set(USER);
        assertEquals("USER", manager.get());
        manager.set(DEVELOPER);
        assertEquals("DEVELOPER", manager.get());
    }
}