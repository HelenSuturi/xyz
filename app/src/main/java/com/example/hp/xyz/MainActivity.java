package com.example.hp.xyz;

import android.app.Activity;
import android.content.Intent;
import android.database.Cursor;
import android.net.Uri;
import android.provider.ContactsContract;
import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.example.hp.xyz.restApi.OnRestLoadListener;
import com.example.hp.xyz.restApi.RestApi;
import com.loopj.android.http.RequestParams;

import org.json.JSONObject;

import java.io.File;

public class MainActivity extends AppCompatActivity implements View.OnClickListener, OnRestLoadListener
{
    Button b1;
    Button b2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b1 = (Button)findViewById(R.id.busuario);
        b2 = (Button)findViewById(R.id.bagente);
        b1.setOnClickListener(this);
        b2.setOnClickListener(this);
        checkRest();
    }

    private void checkRest() {
        RestApi api= new RestApi("POST");
        api.setOnRestLoadListener(this, 10);
        api.addParams("email","mario@gmail.com");
        api.addParams("password","mario1234");
        api.execute ("http://localhost:3000/createuser");
    }

    @Override
    public void onClick(View view)
    {
        switch (view.getId())
        {
            case R.id.busuario:
                Intent intent = new Intent(this,menuusuario.class);
                startActivity(intent);

                break;
            case R.id.bagente:
                Intent intent1 = new Intent(this,menuagente.class);
                startActivity(intent1);
                break;
            default:
                break;
        }
    }

    @Override
    public void OnRestLoadComplete(JSONObject obj, int id) {

    }

    @Override
    public void onRestLoadComplete(JSONObject rObject, int id) {
        //el post
        if(id==10){
            Toast.makeText(this, rObject.toString(),Toast.LENGTH_SHORT).show();
        }
    }
}
