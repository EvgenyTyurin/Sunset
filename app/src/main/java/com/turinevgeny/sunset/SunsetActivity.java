package com.turinevgeny.sunset;

import android.support.v4.app.Fragment;
import android.view.View;

public class SunsetActivity extends SingleFragmentActivity {

    @Override
    protected Fragment createFragment() {
        return SunsetFragment.newInstance();
    }

}
