package com.example.hp.xyz;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class menuusuario extends AppCompatActivity implements View.OnClickListener
{
    ImageButton b1;
    ImageButton b2;
    ImageButton b3;
    ImageButton b4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menuusuario);
        b1 = (ImageButton)findViewById(R.id.reg);
        b1.setOnClickListener(this);
        b2 = (ImageButton)findViewById(R.id.oft);
        b2.setOnClickListener(this);
        b3 = (ImageButton)findViewById(R.id.busc);
        b3.setOnClickListener(this);
        b4 = (ImageButton)findViewById(R.id.cont);
        b4.setOnClickListener(this);
    }

    @Override
    public void onClick(View view)
    {
        switch (view.getId())
        {
            case R.id.reg:
                Intent intent1 = new Intent(this, registro.class);
                startActivity(intent1);
                break;
            case R.id.oft:
                Intent intent2 = new Intent(this, oferta.class);
                startActivity(intent2);
                break;
            case R.id.busc:
                Intent intent3 = new Intent(this, busqueda.class);
                startActivity(intent3);
                break;

            case R.id.cont:
                Intent intent = new Intent(this, contacto.class);
                startActivity(intent);
                break;
            default:
                break;
        }
    }
}
