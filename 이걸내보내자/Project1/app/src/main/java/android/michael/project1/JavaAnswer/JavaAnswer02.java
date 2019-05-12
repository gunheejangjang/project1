package android.michael.project1.JavaAnswer;

import android.content.Intent;
import android.graphics.Color;
import android.michael.project1.R;
import android.michael.project1.javaQ.JavaQList;
import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

/**
 * Created by Administrator on 2018-04-12.
 */

public class JavaAnswer02 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.java_answer);
        android.support.v7.app.ActionBar ab = getSupportActionBar();
        ab.setTitle("면접 예상 질문");
        TextView qtv= (TextView)findViewById(R.id.question);
        qtv.setText(" POST와 GET방식이란 무엇인가?");
        Button b = (Button) findViewById(R.id.rightAnswer);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                TextView tv = (TextView) findViewById(R.id.explain);

                tv.setText(
                                "웹브라우저는 GET방식과 POST방식의 두가지 방식 중 한가지를 이용해서 파라미터를 전송한다." +
                                        "GET 방식과 POST방식의 차이점은 전송 방식에 있다. \n" +

                                        "GET : 데이터를 이름과 같이 결합된 형태로 url 뒤에 붙여서 전송하는 방식이다. " +
                                        "각각의 파라미터는 &기호로 구분되고, 이름과 같은 '='로 구분합니다.\n" +
                                        "<특징>\n" +
                                        "1.url 길이의 한계가 있어 정보의 양이 제한된다.\n" +
                                        "2.url 형식에 맞게 파라미터의 이름과 값을 인코딩 한 후 전송해야한다.\n" +
                                        "3.데이터를 url정보에 붙여서 전송하기 떄문에 url이 노출되서 보약이 취약하다.\n" +
                                        "4.url 기반으로 전송되기 때문에 form을 사용하지 않아도 " +
                                        "  주소창에 직접 url을 이용해 파라미터 전송이 가능하다.\n" +

                                        "POST : 데이터 영역을 이용해 파라미터를 전송하게 된다.\n" +
                                        "<특징>\n" +
                                        "1. 전송할 수 있는 파라미터의 길이에 제한이 없다. " +
                                        "   이유는 데이터 영역을 이용해서 데이터를 전송하기 때문이다.\n" +
                                        "2. 데이터가 http header 부분에 포함되어 전송되기 때문에 " +
                                        "   데이터가 노출되지 않아 보안성이 좋다.\n" +
                                        "3. 서버 측의 정보 갱신을 원할 때 사용한다."
                );

            }
        });
        Button b2 = (Button) findViewById(R.id.clear);
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                TextView tv = (TextView) findViewById(R.id.explain);

                tv.setText("");

                Intent intent=new Intent(JavaAnswer02.this, JavaQList.class);
                startActivity(intent);
                finish();
            }
        });
    }
}