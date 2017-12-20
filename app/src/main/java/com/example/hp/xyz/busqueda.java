package com.example.hp.xyz;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class busqueda extends AppCompatActivity implements View.OnClickListener
{
    Button bt;
    Button bd;
    Button bp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_busqueda);
        bt = (Button)findViewById(R.id.tipo);
        bd = (Button)findViewById(R.id.detalle);
        bp = (Button)findViewById(R.id.precio);
        bt.setOnClickListener(this);
        bd.setOnClickListener(this);
        bp.setOnClickListener(this);
    }

    @Override
    public void onClick(View view)
    {
        switch (view.getId())
        {
            case R.id.tipo:
                Intent intent1 = new Intent(this,tipo.class);
                startActivity(intent1);
                break;
            case R.id.detalle:
                Intent intent2 = new Intent(this,detalle.class);
                startActivity(intent2);
                break;
            case R.id.precio:
                Intent intent3 = new Intent(this,precio.class);
                startActivity(intent3);
                break;
            default:
                break;
        }

    }
}
