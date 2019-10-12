package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.os.Bundle;

public class HomeActivity extends AppCompatActivity {
private Button btnAddNote;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.home_activity);
        findViews();
        setListeners();


    }
private void findViews(){
        btnAddNote = findViewById(R.id.btnAddNote);

}
   private void setListeners(){
        btnAddNote.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(HomeActivity.this,AddNoteActivity.class);
                startActivity(i);
            }
        });
   }
}

