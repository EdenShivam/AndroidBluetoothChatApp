package com.example.chatapp;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.bluetooth.BluetoothAdapter;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


     Button BluetoothOn,BluetoothOff;
     BluetoothAdapter myBluetoothAdapter;
     Button PressButton;
     Intent btEnable;
     int requetCodeForEnable;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        PressButton=(Button)findViewById(R.id.PressButton);
        PressButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(MainActivity.this,MainActivity2.class);
                startActivity(intent);
            }
        });
        BluetoothOn=(Button)findViewById(R.id.BluetoothOn);
        BluetoothOff=(Button)findViewById(R.id.BluetoothOff);
        myBluetoothAdapter=BluetoothAdapter.getDefaultAdapter();
        btEnable= new Intent(BluetoothAdapter.ACTION_REQUEST_ENABLE);
        requetCodeForEnable=1;
        bluetoothOnMethod();
        bluetoothOffMethod();
    }

    private void bluetoothOffMethod() {
        BluetoothOff.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
if(myBluetoothAdapter.isEnabled())
{
    myBluetoothAdapter.disable();
}
            }
        });
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode,Intent data) {
        //super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == requetCodeForEnable) {
            if (resultCode == RESULT_OK) {
                Toast.makeText(getApplicationContext(), "Bluetooth is Enabled", Toast.LENGTH_LONG).show();

            } else if (resultCode == RESULT_CANCELED) {
                Toast.makeText(getApplicationContext(), "Bluetooth  Enabled Cancelled", Toast.LENGTH_LONG).show();

            }
        }
        super.onActivityResult(requestCode, resultCode, data);
    }

    private void bluetoothOnMethod() {
        BluetoothOn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(myBluetoothAdapter== null)
                {
                    Toast.makeText(getApplicationContext(),"Bluetooth does not support on this device",Toast.LENGTH_LONG).show();
                }
                else
                {
                    if(!myBluetoothAdapter.isEnabled())
                    {
                     startActivityForResult(btEnable,requetCodeForEnable);
                    }
                }
            }
        });
    }

}