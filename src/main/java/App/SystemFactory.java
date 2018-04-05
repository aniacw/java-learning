package App;

public class SystemFactory {

    public static OS getOS(String systemName) {
        if (systemName == null) {
            return null;
        }
        if (systemName.equals("Linux")) {
            return new Linux();
        }
        if (systemName.equals("MacOS")) {
            return new MacOS();
        }
        if (systemName.equals("Windows")) {
            return new Windows();
        }
        return null;
    }
}
