package configuration;

public class AppProperties {

    public static String getAllUrl() {
        return ConfigurationProperties.getProperties().getProperty("app.url");
    }

    public static String getSignInUrl() {
        return getAllUrl().concat(ConfigurationProperties.getProperties().getProperty("sign.in.path"));
    }

    public static String getMainUrl() {
        return getAllUrl().concat(ConfigurationProperties.getProperties().getProperty("main.path"));
    }

    public static String getCartUrl() {
        return getAllUrl().concat(ConfigurationProperties.getProperties().getProperty("cart.path"));
    }

    public static String getFishUrl() {
        return getAllUrl().concat(ConfigurationProperties.getProperties().getProperty("fish.path"));
    }
}
