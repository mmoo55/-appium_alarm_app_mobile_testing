package testSuite;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AlarmTest extends TestBase {
    @Test
    public void verifyCreateAlarm() {
        String hour = "5";
        String minute = "25";

        mainActivity.alarmButton.click();
        alarmActivity.addAlarmButton.click();
        clockComponent.hourHandButton(hour).click();
        clockComponent.minuteHandButton(minute).click();
        clockComponent.okButton.click();

        Assertions.assertTrue(alarmActivity.isAlarmDisplayedInList(hour, minute), "This alarm is not displayed in the alarm list");
        Assertions.assertEquals("ON", alarmActivity.switchAlarmButton(hour, minute).getAttribute("text"), "The alarm is not activated");
    }
}
