package sg.edu.rp.c346.id19048236.mymodules;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView textAnd,textIpad;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textAnd=findViewById(R.id.textViewAndroid);
        textAnd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(MainActivity.this,ModuleDetailActivity.class);
                i.putExtra("value","Module Code: ");
                i.putExtra("value1","Module Name: ");
                i.putExtra("value2","Academic Year: ");
                i.putExtra("value3","Semester: ");
                i.putExtra("value4","Module Credit: ");
                i.putExtra("value5","Venue: ");
                startActivity(i);
            }
        });


        textIpad=findViewById(R.id.textViewIpad);
        textIpad.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(MainActivity.this,ModuleDetailActivityIpad.class);
                i.putExtra("value","Module Code: ");
                i.putExtra("value1","Module Name: ");
                i.putExtra("value2","Academic Year: ");
                i.putExtra("value3","Semester: ");
                i.putExtra("value4","Module Credit: ");
                i.putExtra("value5","Venue: ");
                startActivity(i);
            }
        });


    }
}