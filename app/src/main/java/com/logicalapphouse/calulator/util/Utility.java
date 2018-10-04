package com.logicalapphouse.calulator.util;

import com.google.gson.Gson;
import com.logicalapphouse.calculator.common.GlobalClass;
import com.logicalapphouse.calulator.model.Questions;
import org.json.JSONException;
import org.json.JSONObject;
import java.io.IOException;
import java.io.InputStream;

/**
 * Created by AkashYad on 7/10/2016.
 */
public class Utility {
    private static String loadJSONFromAsset() {
        String json = null;
        try {
            InputStream is = GlobalClass.getInstance().activity.getAssets().open("question.json");
            int size = is.available();
            byte[] buffer = new byte[size];
            is.read(buffer);
            is.close();
            json = new String(buffer, "UTF-8");
        } catch (IOException ex) {
            ex.printStackTrace();
            return null;
        }
        return json;
    }

    public static Questions getQuestionAnswerJson() {
        Questions responseBean = null;
        try {

            JSONObject obj = new JSONObject(loadJSONFromAsset());
            Gson gson = new Gson();
            responseBean = gson.fromJson(obj.toString(), Questions.class);

        } catch (JSONException e) {
            e.printStackTrace();
        }
        return responseBean;
    }
}
