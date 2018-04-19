package android.michael.project1.JavaAnswer;

import android.content.Intent;
import android.michael.project1.R;
import android.michael.project1.javaQ.JavaQList;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

/**
 * Created by Administrator on 2018-04-12.
 */

public class JavaAnswer13 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.java_answer);
        android.support.v7.app.ActionBar ab = getSupportActionBar();
        ab.setTitle("면접 예상 질문");

        TextView qtv= (TextView)findViewById(R.id.question); //질문 텍스트뷰
        qtv.setText(" 추상클래스란 무엇인가?");

        Button b = (Button) findViewById(R.id.rightAnswer);
        b.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {


            TextView tv = (TextView) findViewById(R.id.explain);

            tv.setText("추상클래스(Abstract Class)는 추상 메서드를 하나이상 " +
                            "가지는 클래스를 의미한다. 추상클래스를 상속 받는 경우에는" +
                            "반드시 한가지 이상의 메서드를 오버라이딩 해야한다."
                    );

        }
    });
        Button b2 = (Button) findViewById(R.id.clear);
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                        Intent intent=new Intent(JavaAnswer13.this, JavaQList.class);
                        startActivity(intent);
                        finish();
            }
        });
    }
}