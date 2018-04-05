package App;

public class App {
    private String name;
    private int version;
    private OS systemName;

    public App() {
    }

    public App(String name, int version, OS systemName) {
        this.name = name;
        this.version = version;
        this.systemName = systemName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getVersion() {
        return version;
    }

    public void setVersion(int version) {
        this.version = version;
    }

    public OS getSystemName() {
        return systemName;
    }

    public void setSystemName(OS systemName) {
        this.systemName = systemName;
    }

    public static class AppBuilder {
        private String name;
        private int version;
        private OS systemName;

        public static AppBuilder appBuilder() {
            return new AppBuilder();
        }

        public AppBuilder withName(String name) {
            this.name = name;
            return this;
        }

        public AppBuilder withVersion(int version) {
            this.version = version;
            return this;
        }

        public AppBuilder withSystemName(OS systemName) {
            this.systemName = systemName;
            return this;
        }

        public App build() {
            App app = new App();
            app.setName(name);
            app.setVersion(version);
            app.setSystemName(systemName);
            return app;
        }
    }
}