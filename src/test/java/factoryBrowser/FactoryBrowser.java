package factoryBrowser;

public class FactoryBrowser {

    public static IBrowser make(String browserType) {
        IBrowser browser;

        if ("chrome".equals(browserType.toLowerCase())) {
            browser = new Chrome();
        } else {
            browser = new ChromeProxy();
        }
        return browser;
    }
}
