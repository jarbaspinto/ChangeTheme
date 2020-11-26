package com.example.myapplication;
//
//import androidx.appcompat.app.AppCompatActivity;
//
//import android.content.Context;
//import android.content.Intent;
//import android.os.Bundle;
//import android.view.View;
//import android.widget.Button;
//import android.widget.Toast;
//
//public class ChangeThemeActivity extends AppCompatActivity implements View.OnClickListener {
//    private Context context;
//    private Button button1;
//    private Button button2;
//    private Button button3;
//    private Button button;
//
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//       // Utils.onActivityCreateSetTheme(this);
//        setContentView(R.layout.activity_main);
//        context = getApplicationContext();
//        button1 = findViewById(R.id.button1);
//        button2 = findViewById(R.id.button2);
//        button3 = findViewById(R.id.button3);
//        button = findViewById(R.id.button);
//
//        button.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Toast.makeText(context,"Click butao",Toast.LENGTH_SHORT).show();
//            }
//        });
//    }
//
////    @Override
////    public void onClick(View v) {
////        switch (v.getId()) {
////            case R.id.button1:
////                Toast.makeText(context,"Organge click",Toast.LENGTH_SHORT).show();
////                Utils.changeToTheme(this, Utils.THEME_DEFAULT);
////
////                break;
////            case R.id.button2:
////                Utils.changeToTheme(this, Utils.THEME_WHITE);
////                Toast.makeText(context,"Purple Click",Toast.LENGTH_SHORT).show();
////                break;
////            case R.id.button3:
////                Utils.changeToTheme(this, Utils.THEME_BLUE);
////                Toast.makeText(context, "Green Click", Toast.LENGTH_SHORT).show();
////                break;
////            case R.id.button:
////                Intent intent = new Intent(getApplicationContext(),MainActivity.class);
////                startActivity(intent);
////                Toast.makeText(context,"Click Button",Toast.LENGTH_SHORT).show();
////        }
////    }
////    private void getContextA(){
////        context = getBaseContext();
////    }
//}