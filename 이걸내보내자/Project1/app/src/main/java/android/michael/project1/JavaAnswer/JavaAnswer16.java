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

public class JavaAnswer16 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.java_answer);
        android.support.v7.app.ActionBar ab = getSupportActionBar();
        ab.setTitle("면접 예상 질문");

        TextView qtv= (TextView)findViewById(R.id.question); //질문 텍스트뷰
        qtv.setText(" 절차지향언어란 무엇인가?");

        Button b = (Button) findViewById(R.id.rightAnswer);
        b.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {


            TextView tv = (TextView) findViewById(R.id.explain);

            tv.setText("절차지향언어란 어떠한 절차에 따라 , 순차적 처리를 중요시하며" +
                            "프로그램 전체가 유기적으로 연결되어 있는 프로그래밍 방법을" +
                            "말한다.예를 들어 설명하자면,\n" +
                            "1. 나는 목이 마르다\n" +
                            "2. 슈퍼로 간다\n" +
                            "3. 콜라를 산다\n" +
                            "4. 콜라를 사서 마신다\n" +
                            "절차지향언어는 이처럼, \n" +
                            "동작과 행동을 나열하여 순차적으로 실행하는 것을 의미합니다.\n" +
                            "이렇게 순차적으로 실행되는 방식은 컴퓨터의 처리 방식과\n" +
                            "비슷하여 객체지향보다 빠르게 처리되지만\n" +
                            "코드가 많아 유지/보수가 힘들다는 단점이 있습니다.\n" +
                            "[출처] 절차지향언어와 객체지향언어란 무엇인가?|작성자 맛다시 주인장\n" +
                            "\n  "
                    );

        }
    });
        Button b2 = (Button) findViewById(R.id.clear);
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                        Intent intent=new Intent(JavaAnswer16.this, JavaQList.class);
                        startActivity(intent);
                        finish();
            }
        });
    }
}