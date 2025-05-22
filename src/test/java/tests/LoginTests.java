package tests;

import dto.User;
import manager.AppManager;
import org.openqa.selenium.devtools.v118.audits.model.FederatedAuthUserInfoRequestIssueDetails;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.LoginPage;

public class LoginTests extends AppManager {
    @Test
    public void loginPositiveTest() {
        User user = User.builder()
                .email("sveta1978medved@gmail.com")
                .password("Medqwerty12345!")
                .build();
        new HomePage(getDriver()).clickBtnLogin();
        new LoginPage(getDriver()).login(user);
    }
}
