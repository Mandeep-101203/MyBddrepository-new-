package BrowserControl;


import io.cucumber.java.Before;
import io.cucumber.java.After;

public class CucumberHooks extends WebConnector {

        @Before
        public void setup() {
            openBrowser();
        }

        @After
        public void teardown() {
            closeBrowser();
        }

    }

