package System;

public class SystemFactory {

    public static OS getOS(String systemType) {
        if (systemType == null) {
            return null;
        }
        if (systemType.equals("Windows")) {
            return new Windows();
        }
        if (systemType.equals("Linux")) {
            return new Linux();
        }
        if (systemType.equals("MacOS")) {
            return new MacOS();
        }
        return null;
    }
}
