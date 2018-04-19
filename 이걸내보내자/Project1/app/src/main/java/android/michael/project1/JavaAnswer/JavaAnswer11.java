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

public class JavaAnswer11 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.java_answer);
        android.support.v7.app.ActionBar ab = getSupportActionBar();
        ab.setTitle("면접 예상 질문");

        TextView qtv= (TextView)findViewById(R.id.question); //질문 텍스트뷰
        qtv.setText(" 오버라이딩(Overriding)이란 무엇인가?");

        Button b = (Button) findViewById(R.id.rightAnswer);
        b.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {


            TextView tv = (TextView) findViewById(R.id.explain);

            tv.setText("오버라이딩이란 상속을 받은 클래스에서 부모의 클래스에서 " +
                            "정의된  메서드를 변경해서 사용하는 것을 말한다." +
                            "오버라이딩을 할 때는 함수의 원형은 부모 클래스와 일치해야한다." +
                            "이미 사용하고 있는 클래스의 멤버함수를 수정할 경우, 그 클래스를 " +
                            "건드리지 않고  upgrade나 update를 할 때 사용한다." +
                            "오버라이딩이 성립되려면 메서드 이름 , 매개변수(타입), 리턴타입이" +
                            "전부 같아야한다. 이점이 오버로딩과의 차이이다. "
                    );

        }
    });
        Button b2 = (Button) findViewById(R.id.clear);
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                        Intent intent=new Intent(JavaAnswer11.this, JavaQList.class);
                        startActivity(intent);
                        finish();
            }
        });
    }
}