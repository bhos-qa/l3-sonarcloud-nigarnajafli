package org.example;

public class PermissionManager {
    private PermissionLevel mCurrentLevel = PermissionLevel.USER;

    public void set(PermissionLevel level) {
        this.mCurrentLevel = level;
    }

    public String get() {
        return switch (this.mCurrentLevel) {
            case USER -> "USER";
            case DEVELOPER -> "DEVELOPER";
            case ADMIN -> "ADMIN";
        };
    }
}
