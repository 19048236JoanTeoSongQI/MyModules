package sg.edu.rp.c346.id19048236.mymodules;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class ModuleDetailActivityIpad extends AppCompatActivity {
    TextView detIpad;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_module_detail_ipad);

        detIpad=findViewById(R.id.detailIpad);
        Intent i=getIntent();
        String code= i.getStringExtra("value");
        String name= i.getStringExtra("value1");
        String year= i.getStringExtra("value2");
        String sems= i.getStringExtra("value3");
        String credit= i.getStringExtra("value4");
        String venue= i.getStringExtra("value5");
        detIpad.setText(code+" C349 \n"+ name+ " Ipad Programming \n"+ year+ " 2020 \n"+ sems+" 1 \n"+ credit+ " 4\n" +venue+ " E62E");

    }
}