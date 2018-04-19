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

public class JavaAnswer18 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.java_answer);
        android.support.v7.app.ActionBar ab = getSupportActionBar();
        ab.setTitle("면접 예상 질문");

        TextView qtv= (TextView)findViewById(R.id.question); //질문 텍스트뷰
        qtv.setText(" staic이란 무엇인가?");

        Button b = (Button) findViewById(R.id.rightAnswer);
        b.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {


            TextView tv = (TextView) findViewById(R.id.explain);

            tv.setText("static이란 정적 이라는 의미의 단어로 , 객체지향언어에서 " +
                            "자주 등장하는 용어이다. 기본적으로 공유되는 의미로 생각하면" +
                            "되는데 , static 메소드나 변수는 static 메소드가 삼입된 클래스의 모든" +
                            "인스턴스로부터 접근이 가능하다. 즉 인스턴스를 별도로 생성하지 않아도" +
                            "클래스 이름을 이용해 메소드 호출이 가능하다. " +
                            "프로그램 내에서 공통적으로 쓰이는 부분이나 수학함수나 " +
                            "이미 정의되어 제공되는 함수들에 주로 쓰인다. "
                    );

        }
    });
        Button b2 = (Button) findViewById(R.id.clear);
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                        Intent intent=new Intent(JavaAnswer18.this, JavaQList.class);
                        startActivity(intent);
                        finish();
            }
        });
    }
}