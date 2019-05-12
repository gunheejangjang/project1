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

public class JavaAnswer10 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.java_answer);
        android.support.v7.app.ActionBar ab = getSupportActionBar();
        ab.setTitle("면접 예상 질문");

        TextView qtv= (TextView)findViewById(R.id.question); //질문 텍스트뷰
        qtv.setText(" 상속이란 무엇인가?");

        Button b = (Button) findViewById(R.id.rightAnswer);
        b.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {


            TextView tv = (TextView) findViewById(R.id.explain);

            tv.setText("자바에서 상속이란 코드의 재활용, 메모리 절약, 유지보수 등에" +
                            "용이하기 위해 부모클래스에 정의된 필드와 메소드를" +
                            "자식 클래스가 물려받는 것을 말합니다. " +
                            "<장점> " +
                            "-클래스 사이의 멤버 중복선언 불필요" +
                            "-필드와 메소드 재사용으로 클래스 간결화" +
                            "-클래스간 계층적 분류 및 관리" +
                            "" +
                            "특성을 물려주는 부모클래스를 super class 라고하며," +
                            "상속받는 자식 클래스를 sub class라고 한다." +
                            "C++과 다르계 다중상속은 불가능하다."
                    );

        }
    });
        Button b2 = (Button) findViewById(R.id.clear);
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                        Intent intent=new Intent(JavaAnswer10.this, JavaQList.class);
                        startActivity(intent);
                        finish();
            }
        });
    }
}