package protect.card_locker;

import android.app.Application;

import androidx.appcompat.app.AppCompatDelegate;

import com.instabug.library.Instabug;
import com.instabug.library.invocation.InstabugInvocationEvent;

import protect.card_locker.preferences.Settings;

public class LoyaltyCardLockerApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        Settings settings = new Settings(this);
        AppCompatDelegate.setDefaultNightMode(settings.getTheme());
        new Instabug.Builder(this, "b769844023df7fda4529ca7519407135")
                .setInvocationEvents(InstabugInvocationEvent.FLOATING_BUTTON, InstabugInvocationEvent.SHAKE, InstabugInvocationEvent.SCREENSHOT)
                .build();
    }
}
