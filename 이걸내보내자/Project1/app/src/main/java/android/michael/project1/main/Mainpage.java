package android.michael.project1.main;

import android.content.ComponentName;
import android.content.Intent;
import android.michael.project1.R;
import android.michael.project1.javaQ.JavaCodeQList;
import android.michael.project1.javaQ.JavaQList;
import android.net.Uri;
import android.os.Bundle;
import android.os.SystemClock;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.Toast;

public class Mainpage extends AppCompatActivity {
Animation anim;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        final Button mainbtn , java, source, java3, qrcode;
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ActionBar actionBar = getSupportActionBar();
        actionBar.hide();
        java=(Button)findViewById(R.id.java); java.setVisibility(View.INVISIBLE);
        source=(Button)findViewById(R.id.sourcecode); source.setVisibility(View.INVISIBLE);
        java3=(Button)findViewById(R.id.java3); java3.setVisibility(View.INVISIBLE);
        qrcode=(Button)findViewById(R.id.Qrcode); qrcode.setVisibility(View.INVISIBLE);

                 anim = AnimationUtils.loadAnimation(getBaseContext(), R.anim.set);

                 java.setVisibility(View.VISIBLE); java.startAnimation(anim);
                 source.setVisibility(View.VISIBLE); source.startAnimation(anim);
                 java3.setVisibility(View.VISIBLE); java3.startAnimation(anim);
                 qrcode.setVisibility(View.VISIBLE); qrcode.startAnimation(anim);
                 SystemClock.sleep(50);
;
    }
public void mClick(View v){
        switch (v.getId()){
            case R.id.java : //자바 면접 질문 페이지로 이동
                Toast.makeText(Mainpage.this, "면접 화이팅", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent (Mainpage.this, JavaQList.class);
                startActivity(intent);

                break;


            case R.id.sourcecode : //자바 예상 질문 (코드) 페이지 이동
                Toast.makeText(Mainpage.this, "면접 화이팅" ,Toast.LENGTH_SHORT).show();
                Intent intent1 = new Intent(Mainpage.this, JavaCodeQList.class);
                startActivity(intent1);

                break;

            case R.id.java3 :
                Toast.makeText(Mainpage.this, "WEB_PROGRAMMING" , Toast.LENGTH_SHORT).show();
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://o7planning.org/")));

                break;
            case R.id.Qrcode:
                ComponentName componentName = new ComponentName("com.example.user.zxingqr",
                        "com.example.user.zxingqr.MainActivity");
                Intent intent2 = new Intent();
                intent2.setComponent(componentName);
                startActivity(intent2);
        }
}



}

