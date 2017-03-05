package com.example.rigg.weight_calculation;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends Activity {
    private Button btn;
    private RadioGroup sex;
    private EditText EdName;
    private EditText EdHeight;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn=(Button)findViewById(R.id.button);
        EdName=(EditText)findViewById(R.id.editText);
        sex=(RadioGroup)findViewById(R.id.radiogroup);
        EdHeight=(EditText)findViewById(R.id.editText2);
        btn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Info info=new Info();
                String height = EdHeight.getText().toString();
                String name = EdName.getText().toString();
                if (height.equals("")) {
                    Toast.makeText(MainActivity.this, "please input your height", Toast.LENGTH_SHORT).show();
                    return;
                }
                if (name.equals("")) {
                    Toast.makeText(MainActivity.this, "please input your name", Toast.LENGTH_SHORT).show();
                    return;
                }
                int Height=Integer.parseInt(height);
                info.setHeight(Height);
                info.setName(name);
                for (int i = 0; i < sex.getChildCount(); i++) {
                    RadioButton r= (RadioButton) sex.getChildAt(i);
                    if (r.isChecked()) {
                        info.setSex(r.getText().toString());
                        break;
                    }
                }
                Intent intent=new Intent(MainActivity.this,ResultActivity.class);
                Bundle bundle=new Bundle();
                bundle.putSerializable("info", info);
                intent.putExtras(bundle);
                startActivity(intent);
            }
        });
    }

}
