package testSuite;


import activities.alarm.AlarmActivity;
import activities.alarm.ClockComponent;
import activities.alarm.MainActivity;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import singletonSession.Session;

public class TestBase {

    protected MainActivity mainActivity;
    protected AlarmActivity alarmActivity;
    protected ClockComponent clockComponent;

    @BeforeEach
    public void openApp() {
        mainActivity = new MainActivity();
        alarmActivity = new AlarmActivity();
        clockComponent = new ClockComponent();
    }

    @AfterEach
    public void closeApp() {
        Session.getSession().closeSession();
    }
}
