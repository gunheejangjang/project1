package android.michael.project1.javaQ;

import android.content.Context;
import android.content.Intent;
import android.michael.project1.JavaAnswer.JavaAnswer01;
import android.michael.project1.JavaAnswer.JavaAnswer02;
import android.michael.project1.JavaAnswer.JavaAnswer03;
import android.michael.project1.JavaAnswer.JavaAnswer04;
import android.michael.project1.JavaAnswer.JavaAnswer05;
import android.michael.project1.JavaAnswer.JavaAnswer06;
import android.michael.project1.JavaAnswer.JavaAnswer07;
import android.michael.project1.JavaAnswer.JavaAnswer08;
import android.michael.project1.JavaAnswer.JavaAnswer09;
import android.michael.project1.JavaAnswer.JavaAnswer10;
import android.michael.project1.JavaAnswer.JavaAnswer11;
import android.michael.project1.JavaAnswer.JavaAnswer12;
import android.michael.project1.JavaAnswer.JavaAnswer13;
import android.michael.project1.JavaAnswer.JavaAnswer14;
import android.michael.project1.JavaAnswer.JavaAnswer15;
import android.michael.project1.JavaAnswer.JavaAnswer16;
import android.michael.project1.JavaAnswer.JavaAnswer17;
import android.michael.project1.JavaAnswer.JavaAnswer18;
import android.michael.project1.R;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.util.AttributeSet;
import android.view.View;

/**
 * Created by Administrator on 2018-04-12.
 */

public class JavaQList extends AppCompatActivity {



    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        android.support.v7.app.ActionBar ab = getSupportActionBar();
        ab.setTitle("면접 예상 질문");
        setContentView(R.layout.java_list);
    }
    public void onClick(View v){;
        switch (v.getId()){
            case R.id.mvc: //답변 1번
                Intent intent = new Intent(getApplicationContext(), JavaAnswer01.class);
                startActivity(intent);
                finish();
                break;
            case R.id.getpost:// 답변 2번
                Intent intent2 = new Intent(getApplicationContext(), JavaAnswer02.class);
                startActivity(intent2);
                finish();
                break;
            case R.id.join://3번
                Intent intent3 = new Intent(getApplicationContext(), JavaAnswer03.class);
                startActivity(intent3);
                finish();
                break;
            case R.id.tomcat://4번
                Intent intent4 = new Intent(getApplicationContext(), JavaAnswer04.class);
                startActivity(intent4);
                finish();
                break;
            case R.id.ajax://5번
                Intent intent5 = new Intent(getApplicationContext(), JavaAnswer05.class);
                startActivity(intent5);
                finish();
                break;
            case R.id.mvc2://6번
                Intent intent6 = new Intent(getApplicationContext(), JavaAnswer06.class);
                startActivity(intent6);
                finish();
                break;
            case R.id.componentmodule://7번
                Intent intent7 = new Intent(getApplicationContext(), JavaAnswer07.class);
                startActivity(intent7);
                finish();
                break;
            case R.id.syncro://8번
                Intent intent8 = new Intent(getApplicationContext(), JavaAnswer08.class);
                startActivity(intent8);
                finish();
                break;
            case R.id.capsule://9번
                Intent intent9 = new Intent(getApplicationContext(), JavaAnswer09.class);
                startActivity(intent9);
                finish();
                break;
            case R.id.extend://10번
                Intent intent10 = new Intent(getApplicationContext(), JavaAnswer10.class);
                startActivity(intent10);
                finish();
                break;
            case R.id.overriding://11번
                Intent intent11 = new Intent(getApplicationContext(), JavaAnswer11.class);
                startActivity(intent11);
                finish();
                break;
            case R.id.overloading://12번
                Intent intent12 = new Intent(getApplicationContext(), JavaAnswer12.class);
                startActivity(intent12);
                finish();
                break;
            case R.id.abst://13번
                Intent intent13 = new Intent(getApplicationContext(), JavaAnswer13.class);
                startActivity(intent13);
                finish();
                break;
            case R.id.inter://14번
                Intent intent14 = new Intent(getApplicationContext(), JavaAnswer14.class);
                startActivity(intent14);
                finish();
                break;
            case R.id.gaekchae://15번
                Intent intent15 = new Intent(getApplicationContext(), JavaAnswer15.class);
                startActivity(intent15);
                finish();
                break;
            case R.id.julcha://16번
                Intent intent16 = new Intent(getApplicationContext(), JavaAnswer16.class);
                startActivity(intent16);
                finish();
                break;
            case R.id.memorynusu://17번
                Intent intent17 = new Intent(getApplicationContext(), JavaAnswer17.class);
                startActivity(intent17);
                finish();
                break;
            case R.id.staticq://18번
                Intent intent18 = new Intent(getApplicationContext(), JavaAnswer18.class);
                startActivity(intent18);
                finish();
                break;
        }
    }
}
