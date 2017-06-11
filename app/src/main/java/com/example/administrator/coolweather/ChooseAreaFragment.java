package com.example.administrator.coolweather;

import android.app.Fragment;
import android.app.ProgressDialog;
import android.widget.TextView;

/**
 * Created by Administrator on 2017/6/11.
 */
public class ChooseAreaFragment extends Fragment {
    public static final int LEVEL_PROVINCE=0;
    public static final int LEVEL_CITY=1;
    public static final int LEVEL_COUNTY=2;
    private ProgressDialog progressDialog;
    private TextView titleText;
}
