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

public class JavaAnswer01 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.java_answer);
        android.support.v7.app.ActionBar ab = getSupportActionBar();
        ab.setTitle("면접 예상 질문");

        TextView qtv= (TextView)findViewById(R.id.question); //질문 텍스트뷰
        qtv.setText(" MVC 패턴이란 무엇인가?");

        Button b = (Button) findViewById(R.id.rightAnswer);
        b.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {


            TextView tv = (TextView) findViewById(R.id.explain);

            tv.setText("" +
                    " MVC 패턴은 디자인패턴중 하나로 하나의 애플리케이션, 프로젝트를 세가지의 역할로 구분한 패턴입니다. \n" +
                    "\n . Model View Controller 의 약자이고,\n" +
                    "\n" +
                    "\t모델(Model)은 애플리케이션의 정보 데이터를 나타내는 컴포넌트입니다.\n" +
                    "\n" +
                    "\t뷰(VIEW)는 텍스트 체크박스 항목등과같은 사용자 인터페이스 요소를 나타내고,\n" +
                    "\n" +
                    "\thtml, css, javascript 가 대표적으로 사용됩니다.\n" +
                    "\n" +
                    "\t뷰(View)에는 다음과같은 규칙이있습니다 모델(MODEL)이 가지고있는 정보를 따로 저장해서는 안되고\n" +
                    "\n" +
                    "\t모델이나 컨트롤러와 같이 다른 구성요소들을 몰라야합니다.\n" +
                    "\n" +
                    "\t컨트롤러(Controller)는\n" +
                    "\n" +
                    "\t데이터와 사용자 인터페이스 요소들을 잇는 다리역할로 사용자가 클릭하고 수정하는\n" +
                    "\n" +
                    "\t이벤트들을 처리하는 부분입니다.");

        }
    });
        Button b2 = (Button) findViewById(R.id.clear);
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                        Intent intent=new Intent(JavaAnswer01.this, JavaQList.class);
                        startActivity(intent);
                        finish();
            }
        });
    }
}