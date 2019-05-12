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

public class JavaAnswer15 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.java_answer);
        android.support.v7.app.ActionBar ab = getSupportActionBar();
        ab.setTitle("면접 예상 질문");

        TextView qtv= (TextView)findViewById(R.id.question); //질문 텍스트뷰
        qtv.setText(" 객체지향언어란 무엇인가?");

        Button b = (Button) findViewById(R.id.rightAnswer);
        b.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {


            TextView tv = (TextView) findViewById(R.id.explain);

            tv.setText("객체지향언어란 현실세계에 대한 추상적 모델링이다. " +
                            "클래스와 객채를 명백히 구분하여 코드의 재사용성을 " +
                            "높이고 코드의 관리를 용이하게 한다." +
                            "붕어빵을 만드는 틀을 클래스라고 하면 " +
                            "만들어진 붕어빵을 객체라고 생각하면 쉽다." +
                            "클래스 : 객체를 정의해놓은것" +
                            "객체 : 실제로 존재하는 사물 또는 개념  "
                    );

        }
    });
        Button b2 = (Button) findViewById(R.id.clear);
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                        Intent intent=new Intent(JavaAnswer15.this, JavaQList.class);
                        startActivity(intent);
                        finish();
            }
        });
    }
}