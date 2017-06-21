package com.dalsoftware.calculadoratip;

import android.app.Application;

/**
 * Created by glassy on 6/20/17.
 */

public class TipCalcClass extends Application {
    private final static String ABOUT_URL = "https://www.humblebundle.com/";

    public String getAboutUrl() {
        return ABOUT_URL;
    }
}
