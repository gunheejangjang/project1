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

public class JavaAnswer05 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.java_answer);
        android.support.v7.app.ActionBar ab = getSupportActionBar();
        ab.setTitle("면접 예상 질문");
        TextView qtv= (TextView)findViewById(R.id.question);
        qtv.setText(" AJAX란 무엇인가?");
        Button b = (Button) findViewById(R.id.rightAnswer);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                TextView tv = (TextView) findViewById(R.id.explain);

                tv.setText
                        ("AJAX는 이름에서 알 수 있듯이 Asynchronous JavaScript + XML ," +
                        "'비동기 방식의 자바스크립트와 XML의 합성어이다. \n" +
                        " Client 와 Server 간에 XML데이터를 JavaScript를 사용하여\n" +
                        " 비동기 통신으로 주고받는 기술이다. \n" +
                                "핵심은 재로드(refresh) 하지 않고 웹페이지의 " +
                                "일부만을 갱신하여 웹서버와 데이터를 교환할 수 있다는 " +
                                "점이다."

                );

            }
        });
        Button b2 = (Button) findViewById(R.id.clear);
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                TextView tv = (TextView) findViewById(R.id.explain);

                tv.setText("");

                Intent intent=new Intent(JavaAnswer05.this, JavaQList.class);
                startActivity(intent);
                finish();
            }
        });
    }
}