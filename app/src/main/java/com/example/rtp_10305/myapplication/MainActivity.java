package com.example.rtp_10305.myapplication;

import android.os.Bundle;
import android.provider.ContactsContract;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class MainActivity extends AppCompatActivity {
    public FirebaseDatabase firebaseDatabase;
    public DatabaseReference databaseReference;
    private static final String TAG = "LED Control";
    public Button Swicth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        firebaseDatabase = FirebaseDatabase.getInstance();
        databaseReference = firebaseDatabase.getReference("Switch");

        Swicth =(Button)findViewById(R.id.btled);

    }

}//end MainClass
