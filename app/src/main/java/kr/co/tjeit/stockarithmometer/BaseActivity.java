package kr.co.tjeit.stockarithmometer;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;

/**
 * Created by admin on 2018-03-14.
 */

public abstract class BaseActivity extends AppCompatActivity {

    Context mContext = this;

    public abstract void setValuse();
    public abstract void setupEvents();
    public abstract void bindViews();
}
