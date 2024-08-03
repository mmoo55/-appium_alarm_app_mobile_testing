package activities.alarm;

import controls.Button;
import org.openqa.selenium.By;

public class MainActivity {
    public Button alarmButton = new Button(By.xpath("//android.widget.TextView[@text='ALARM']"));

}
