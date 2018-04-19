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

public class JavaAnswer14 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.java_answer);
        android.support.v7.app.ActionBar ab = getSupportActionBar();
        ab.setTitle("면접 예상 질문");

        TextView qtv= (TextView)findViewById(R.id.question); //질문 텍스트뷰
        qtv.setText(" 인터페이스란 무엇인가?");

        Button b = (Button) findViewById(R.id.rightAnswer);
        b.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {


            TextView tv = (TextView) findViewById(R.id.explain);

            tv.setText("자바 인터페이스(interface)란 추상클래스의 일종으로 실제" +
                            "구현된 것이 전혀 없는 클래스를 말한다." +
                            "인터페이스는 추상메서드와 상수만 가질 수 있다." +
                            "<특징>" +
                            "-인스턴스 생성 불가" +
                            "-미리 정해진 규칙을 정해 구현하도록 하는데 사용" +
                            "-다중 상속이 가능하며, 키워드는 implements이다."
                    );

        }
    });
        Button b2 = (Button) findViewById(R.id.clear);
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                        Intent intent=new Intent(JavaAnswer14.this, JavaQList.class);
                        startActivity(intent);
                        finish();
            }
        });
    }
}