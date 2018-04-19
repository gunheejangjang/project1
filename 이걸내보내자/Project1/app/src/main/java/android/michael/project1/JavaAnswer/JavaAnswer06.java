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

public class JavaAnswer06 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.java_answer);
        android.support.v7.app.ActionBar ab = getSupportActionBar();
        ab.setTitle("면접 예상 질문");

        TextView qtv= (TextView)findViewById(R.id.question); //질문 텍스트뷰
        qtv.setText(" MVC 패턴은 왜 사용하는가?");

        Button b = (Button) findViewById(R.id.rightAnswer);
        b.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {


            TextView tv = (TextView) findViewById(R.id.explain);

            tv.setText("사용자가 보는 페이지, 데이터처리, 그리고 이 2가지를" +
                    "  중간에서 제어하는 컨트롤로 하나의 애플리케이션을 " +
                    "  3가지로 분리하여 만들어 서로 영향을 받지 않게 만들 수 있습니다. " +
                    "  모든 일이 각각 맡은바에만 집중을 해야 그 일이 잘됩니다.  프로그램도 마찬가지입니다. \n" +
                    "  서로 분리되어 각자의 역할에 집중할 수 있게끔하여 개발을 하고 그렇게 애플리케이션을 만든다면" +
                    "  유지보수성, 애플리케이션의 확장성, 그리고 유연성이 증가하고, " +
                    "  중복코딩이라는 문제점 또한 사라지게 되는 것입니다.  \n" +
                    "\n");

        }
    });
        Button b2 = (Button) findViewById(R.id.clear);
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                        Intent intent=new Intent(JavaAnswer06.this, JavaQList.class);
                        startActivity(intent);
                        finish();
            }
        });
    }
}