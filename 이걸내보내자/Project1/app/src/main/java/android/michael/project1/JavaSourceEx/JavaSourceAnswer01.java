package android.michael.project1.JavaSourceEx;

import android.content.Intent;
import android.graphics.Typeface;
import android.michael.project1.R;
import android.michael.project1.javaQ.JavaCodeQList;
import android.michael.project1.javaQ.JavaQList;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

/**
 * Created by Administrator on 2018-04-12.
 */

public class JavaSourceAnswer01 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.java_answer);
        android.support.v7.app.ActionBar ab = getSupportActionBar();
        ab.setTitle("면접 예상 질문(코드)");
        TextView qtv= (TextView)findViewById(R.id.question);

        qtv.setTypeface(Typeface.createFromAsset(getAssets(), "fonts/NanumSquareB.ttf"));
        qtv.setText(" 박싱 언박싱이란 무엇인가요 ?");
        Button b = (Button) findViewById(R.id.rightAnswer);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                TextView tv = (TextView) findViewById(R.id.explain);

                tv.setText(
                        "wrapper 클래스에 넣느냐 안넣느냐의 차이라고 알고있습니다.\n" +
                                "\n" +
                                "ex)boxing =\n" +
                                "\n" +
                                "Integer arg = new Integer(data)\n" +
                                "\n" +
                                "unboxing\n" +
                                "\n" +
                                "int data2 = arg.intValue();"
                );

            }
        });
        Button b2 = (Button) findViewById(R.id.clear);
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                TextView tv = (TextView) findViewById(R.id.explain);

                tv.setText("");

                Intent intent=new Intent(JavaSourceAnswer01.this, JavaCodeQList.class);
                startActivity(intent);
                finish();
            }
        });
    }
}