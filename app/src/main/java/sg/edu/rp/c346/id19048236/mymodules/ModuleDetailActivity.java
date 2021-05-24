package sg.edu.rp.c346.id19048236.mymodules;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class ModuleDetailActivity extends AppCompatActivity {
    TextView detAnd;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_module_detail);

        detAnd=findViewById(R.id.detailsAnd);
        Intent i=getIntent();
        String code= i.getStringExtra("value");
        String name= i.getStringExtra("value1");
        String year= i.getStringExtra("value2");
        String sems= i.getStringExtra("value3");
        String credit= i.getStringExtra("value4");
        String venue= i.getStringExtra("value5");
        detAnd.setText(code+" C346 \n"+ name+ " Android Programming \n"+ year+ " 2020 \n"+ sems+" 1 \n"+ credit+ " 4\n" +venue+ " W66M");


    }
}