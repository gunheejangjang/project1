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

public class JavaAnswer07 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.java_answer);
        android.support.v7.app.ActionBar ab = getSupportActionBar();
        ab.setTitle("면접 예상 질문");

        TextView qtv= (TextView)findViewById(R.id.question); //질문 텍스트뷰
        qtv.setText(" 컴포넌트와 모듈의 차이는 ?");

        Button b = (Button) findViewById(R.id.rightAnswer);
        b.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {


            TextView tv = (TextView) findViewById(R.id.explain);

            tv.setText("모듈 : 이미 알고 있는 특성을 갖는 기능 단위로서 부품 집합\n" +
                    "컴포넌트 : 소프트웨어 개발을 마치 레고블록을 쌓듯이 쉽게 할 수 있도록 하는 기술\n" +
                    "모듈과 컴포넌트의 차이\n" +
                    "\n" +
                    "- 모듈은 하나의 프로그램안에서 같이 공유해 쓸 수 있고, 컴포넌트는 다른 프로그램에서 공유해 쓸 수 있다.\n" +
                    "\n" +
                    "- 모듈보다 컴포넌트가 대체로 엄격하고 이상적인 개념(모듈과 컴포넌트 사이에 명확한 구분이 되어 있지 않다)\n" +
                    "\n" +
                    "- 가장 명확한 차이라고 볼 수 있는 점은 코드 수정이 필요없는 재사용 가능성 \n" +
                    "\n" +
                    "- 컴포넌트 : 컴포넌트를 사용하는 시스템 환경에 맞춰 약간의 설정 변경만으로 그대로 쓸 수 있는 프로그램 덩어리지만, 모듈은 그렇지 않다.\n" +
                    "\n" +
                    "- 수정을 해서 재사용할 수 있는 프로그램 덩어리를 모듈이라고 할 수 있지만 컴포넌트라고는 할 수 없다. \n" +
                    "\n" +
                    "- 재사용하지 않는 경우도 모듈이라는 이름으로 프로그램의 기능을 구분해놓기도 한다.\n" +
                    "\n" +
                    "- 모듈은 기능적인 구분의 단위로 쓰이는 경우가 많고, 컴포넌트는 재사용의 단위라고도 볼 수 있음.");

        }
    });
        Button b2 = (Button) findViewById(R.id.clear);
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                        Intent intent=new Intent(JavaAnswer07.this, JavaQList.class);
                        startActivity(intent);
                        finish();
            }
        });
    }
}