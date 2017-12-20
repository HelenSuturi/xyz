package com.example.hp.xyz.restApi;

/**
 * Created by User on 6/12/2017.
 */

public class Params {
    private String key;
    private String value;
    public Params(String key, String value){
        this.key = key;
        this.value = value;
    }
    public String getKey(){
        return this.key;
    }
    public String getValue(){
        return this.value;
    }
}
