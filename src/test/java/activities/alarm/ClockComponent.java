package activities.alarm;

import controls.Button;
import org.openqa.selenium.By;

public class ClockComponent {

    public Button okButton = new Button(By.id("android:id/button1"));

    public Button hourHandButton(String hour) {
        return new Button(By.xpath("//android.widget.RadialTimePickerView.RadialPickerTouchHelper[@content-desc='"+ hour +"']"));
    }

    public Button minuteHandButton(String minute) {
        return new Button(By.xpath("//android.widget.RadialTimePickerView.RadialPickerTouchHelper[@content-desc='"+ minute +"']"));
    }
}
