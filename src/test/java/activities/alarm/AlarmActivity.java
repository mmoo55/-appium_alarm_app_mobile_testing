package activities.alarm;

import controls.Button;
import controls.Label;
import org.openqa.selenium.By;

public class AlarmActivity {
    public Button addAlarmButton = new Button(By.id("com.google.android.deskclock:id/fab"));

    public boolean isAlarmDisplayedInList(String hour, String minute) {
        String time = hour+":"+minute;
        return new Button(By.xpath("//android.widget.TextView[contains(@content-desc, '"+ time +"')]")).isControlDisplayed();
    }
    public Button switchAlarmButton(String hour, String minute) {
        String time = hour+":"+minute;
        return new Button(By.xpath("//android.view.ViewGroup[contains(@content-desc, '"+ time +"')]//android.widget.Switch"));
    }

}
