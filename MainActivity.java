package com.example.lab06;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.labmenu, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        int itemId = item.getItemId();
        if (itemId == R.id.search) {
            Toast.makeText(getApplicationContext(), "Search", Toast.LENGTH_SHORT).show();
        } else if (itemId == R.id.share || itemId == R.id.shared) {
            startActivity(new Intent(MainActivity.this, SecondActivity.class));
        } else if (itemId == R.id.delete) {
            Toast.makeText(getApplicationContext(), "Deleted", Toast.LENGTH_SHORT).show();
        } else if (itemId == R.id.exit) {
            finish();
        }
        return super.onOptionsItemSelected(item);
    }
}
