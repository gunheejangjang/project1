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

public class JavaAnswer12 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.java_answer);
        android.support.v7.app.ActionBar ab = getSupportActionBar();
        ab.setTitle("면접 예상 질문");

        TextView qtv= (TextView)findViewById(R.id.question); //질문 텍스트뷰
        qtv.setText(" 오버로딩(Overloading)이란 무엇인가?");

        Button b = (Button) findViewById(R.id.rightAnswer);
        b.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {


            TextView tv = (TextView) findViewById(R.id.explain);

            tv.setText("오버로딩이란 같은 이름의 함수(메서드)를 여러개 정의하고," +
                            "매개변수의 유형과 개수를 다르게 하여 다양한 유형의 호출에 " +
                            "응답할 수 있게하는 것을 말한다." +
                            "오버로딩이 성립되려면 메서드이름은 같고 , 메개변수와 타입은 달라야하고," +
                            "리턴 타입은 상관없다. 이점이 오버라이딩과 차이점이다. "
                    );

        }
    });
        Button b2 = (Button) findViewById(R.id.clear);
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                        Intent intent=new Intent(JavaAnswer12.this, JavaQList.class);
                        startActivity(intent);
                        finish();
            }
        });
    }
}