package com.example.admin.context;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView textView=findViewById(R.id.text_view);
        registerForContextMenu(textView);

    }

    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
        super.onCreateContextMenu(menu, v, menuInfo);
        getMenuInflater().inflate(R.menu.example_menu, menu);

    }

public boolean onContextItemSelected(MenuItem item){
    switch(item.getItemId()){
        case R.id.option_1:
            Toast.makeText(this,"Option 1 selected",Toast.LENGTH_SHORT).show();
            return true;
        case R.id.option_2:
            Toast.makeText(this,"Option 1 selected",Toast.LENGTH_SHORT).show();
            return true;
        default:
            return super.onContextItemSelected(item);

    }

}
}