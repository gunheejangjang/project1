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

public class JavaAnswer03 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.java_answer);
        android.support.v7.app.ActionBar ab = getSupportActionBar();
        ab.setTitle("면접 예상 질문");
        TextView qtv= (TextView)findViewById(R.id.question);
        qtv.setText(" Outer Join과 Inner Join 설명하고 사용되는 예를 들어보세요.");
        Button b = (Button) findViewById(R.id.rightAnswer);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                TextView tv = (TextView) findViewById(R.id.explain);

                tv.setText(
                                "SQL 에서 사용되는 개념이고\n" +
                                        "\n" +
                                        "이너조인은 쉽게말하면 교집합니다\n" +
                                        "\n" +
                                        "두개의 집합에 있는 행들만 포함시키고 그렇지 않는 경우입니다\n" +
                                        "\n" +
                                        "ex) a{1,2,3} b{2,3,4} \n" +
                                        "\n" +
                                        "일시 {2,3} 만출력되는것을 이너조인이라고합니다\n" +
                                        "\n" +
                                        "아더조인은 \n" +
                                        "\n" +
                                        "Outer Join 은 \n" +
                                        "- LEFT JOIN\n" +
                                        "- RIGHT JOIN \n" +
                                        "- FULL JOIN  \n" +
                                        "이렇게 3가지 종류로 나뉘는것밖에모릅니다."
                );

            }
        });
        Button b2 = (Button) findViewById(R.id.clear);
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                TextView tv = (TextView) findViewById(R.id.explain);

                tv.setText("");

                Intent intent=new Intent(JavaAnswer03.this, JavaQList.class);
                startActivity(intent);
                finish();
            }
        });
    }
}