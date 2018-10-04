package cpom.logicalapphouse.calculator.pref;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;

import com.logicalapphouse.calulator.R;

public class Pref {
    private String COLOR_CODE = "calculator";
    private SharedPreferences.Editor editor;
    private SharedPreferences prefs;
    private Context mContext = null;
    private static final String LEVEL = "level";


    public Pref(Context context) {
        mContext = context;
        prefs = PreferenceManager.getDefaultSharedPreferences(mContext);
    }

    public void saveColorCode(int color_code) {
        prefs.edit().putInt(COLOR_CODE, color_code).commit();
    }

    public int getColorCode() {
        return prefs.getInt(COLOR_CODE, mContext.getResources().getColor(R.color.dark_pinksih));
    }

    public void saveLevel(int color_code) {
        prefs.edit().putInt(LEVEL, color_code).commit();
    }

    public int getLevel() {
        return prefs.getInt(LEVEL, 2);

    }
}
