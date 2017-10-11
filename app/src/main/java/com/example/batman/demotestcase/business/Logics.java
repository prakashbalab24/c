package com.example.batman.demotestcase.business;


import android.content.Context;

import com.example.batman.demotestcase.R;

/**
 * Created by batman on 11/10/17.
 */

public class Logics {
    static int i;
    public static String testThisMethod(Context context){
        String s = context.getString(R.string.app_name);
        return s;
    }

}
