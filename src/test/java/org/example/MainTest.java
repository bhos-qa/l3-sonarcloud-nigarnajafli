package org.example;

import static org.example.PermissionLevel.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.HashMap;


public class MainTest {
    PermissionManager manager;
    HashMap<PermissionLevel, String> permissions = new HashMap<>();

    @BeforeEach
    void setup() {
        manager = new PermissionManager();
        permissions.put(PermissionLevel.ADMIN, "ADMIN");
        permissions.put(PermissionLevel.USER, "USER");
        permissions.put(PermissionLevel.DEVELOPER, "DEVELOPER");
    }

    @Test
    void testSet() {
        for (PermissionLevel permissionLevel: permissions.keySet()) {
            manager.set(permissionLevel);
            assertEquals(permissions.get(permissionLevel), manager.get());
        }
    }
}