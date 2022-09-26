package org.example;

public class PermissionManager {
    private PermissionLevel mCurrentLevel = PermissionLevel.USER;

    public void set(PermissionLevel level) {
        this.mCurrentLevel = level;
    }

    public String get() {
        switch (this.mCurrentLevel) {
            case USER:
                return "USER";
            case DEVELOPER:
                return "DEVELOPER";
            case ADMIN:
                return "ADMIN";
        }
        return null;
    }
}
