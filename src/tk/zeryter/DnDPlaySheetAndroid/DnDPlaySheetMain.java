package tk.zeryter.DnDPlaySheetAndroid;

import android.app.ActionBar;
import android.app.Activity;
import android.os.Bundle;

/**
 * Owen Holloway
 * ZerytSoft
 * Date: 25/11/13
 */

public class DnDPlaySheetMain extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);    //To change body of overridden methods use File | Settings | File Templates.
    }

    //ActionBar and Tabs
    private ActionBar actionBar;

    @Override
    protected void onStart() {
        super.onStart();

        actionBar = getActionBar();
        actionBar.setNavigationMode(ActionBar.NAVIGATION_MODE_LIST);

    }
}
