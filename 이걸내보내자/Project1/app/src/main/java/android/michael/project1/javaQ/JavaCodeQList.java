package android.michael.project1.javaQ;

import android.content.Intent;
import android.michael.project1.JavaSourceEx.JavaSourceAnswer01;
import android.michael.project1.JavaSourceEx.JavaSourceAnswer010;
import android.michael.project1.JavaSourceEx.JavaSourceAnswer02;
import android.michael.project1.JavaSourceEx.JavaSourceAnswer03;
import android.michael.project1.JavaSourceEx.JavaSourceAnswer04;
import android.michael.project1.JavaSourceEx.JavaSourceAnswer05;
import android.michael.project1.JavaSourceEx.JavaSourceAnswer06;
import android.michael.project1.JavaSourceEx.JavaSourceAnswer07;
import android.michael.project1.JavaSourceEx.JavaSourceAnswer08;
import android.michael.project1.JavaSourceEx.JavaSourceAnswer09;
import android.michael.project1.R;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

/**
 * Created by Administrator on 2018-04-12.
 */

public class JavaCodeQList extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        android.support.v7.app.ActionBar ab = getSupportActionBar();
        ab.setTitle("면접 예상 질문");
        setContentView(R.layout.java_code_list);

    }
    public void onClick(View v){

        switch (v.getId()){
            case R.id.boxing: //답변 1 번
                Intent intent1 = new Intent(getApplicationContext(), JavaSourceAnswer01.class);
                startActivity(intent1);
                finish();
                break;
            case R.id.gugu:// 답변 2번
                Intent intent2 = new Intent(getApplicationContext(), JavaSourceAnswer02.class);
                startActivity(intent2);
                finish();
                break;
            case R.id.sosu:///3번
                Intent intent3 = new Intent(getApplicationContext(), JavaSourceAnswer03.class);
                startActivity(intent3);
                finish();
                break;
            case R.id.source4:///4번
                Intent intent4 = new Intent(getApplicationContext(), JavaSourceAnswer04.class);
                startActivity(intent4);
                finish();
                break;
            case R.id.source5 ://5번
                Intent intent5 = new Intent(getApplicationContext(), JavaSourceAnswer05.class);
                startActivity(intent5);
                finish();
                break;
            case R.id.source6:///6번
                Intent intent6 = new Intent(getApplicationContext(), JavaSourceAnswer06.class);
                startActivity(intent6);
                finish();
                break;
            case R.id.source7:///7번
                Intent intent7 = new Intent(getApplicationContext(), JavaSourceAnswer07.class);
                startActivity(intent7);
                finish();
                break;
            case R.id.source8:///8번
                Intent intent8 = new Intent(getApplicationContext(), JavaSourceAnswer08.class);
                startActivity(intent8);
                finish();
                break;
            case R.id.source9:///9번
                Intent intent9 = new Intent(getApplicationContext(), JavaSourceAnswer09.class);
                startActivity(intent9);
                finish();
                break;
            case R.id.source10:///10번
                Intent intent10 = new Intent(getApplicationContext(), JavaSourceAnswer010.class);
                startActivity(intent10);
                finish();
                break;
        }
    }
}
