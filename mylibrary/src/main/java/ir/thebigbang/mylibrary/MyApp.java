package ir.thebigbang.mylibrary;

import android.content.Context;
import android.os.Build;
import android.support.annotation.Nullable;
import android.support.annotation.RequiresApi;
import android.util.AttributeSet;
import android.util.Log;
import android.widget.LinearLayout;

/**
 * Created by DITOP on 5/11/2017.
 */

public class MyApp extends LinearLayout {

    private Context mContext;

    private static final String TAG = "MyApp";

    public MyApp(Context context) {
        super(context);
        this.mContext = context;
        init(mContext);
    }

    public MyApp(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        this.mContext = context;
        init(mContext);
    }

    public MyApp(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        this.mContext = context;
        init(mContext);
    }

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    public MyApp(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
        this.mContext = context;
        init(mContext);
    }

    public void init(Context context) {
        inflate(context, R.layout.init_layout, this);

        Log.d(TAG, "init: --------------------");
    }
}
