package com.example.hp.xyz.restApi;

import org.json.JSONObject;

/**
 * Created by User on 7/12/2017.
 */

public interface OnRestLoadListener {
    public void OnRestLoadComplete(JSONObject obj, int id);

    void onRestLoadComplete(JSONObject rObject, int id);
}
