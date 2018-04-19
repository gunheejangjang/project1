package android.michael.project1.JavaSourceEx;

import android.content.Intent;
import android.michael.project1.R;
import android.michael.project1.javaQ.JavaCodeQList;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

/**
 * Created by Administrator on 2018-04-12.
 */

public class JavaSourceAnswer06 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.java_answer);
        android.support.v7.app.ActionBar ab = getSupportActionBar();
        ab.setTitle("면접 예상 질문(코드)");
        TextView qtv= (TextView)findViewById(R.id.question);
        qtv.setText(" 소수 구하는 코드를 생각해보세요.");
        Button b = (Button) findViewById(R.id.rightAnswer);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                TextView tv = (TextView) findViewById(R.id.explain);

                tv.setText(
                                "public class OneTo100YaksuClass {\n" +
                                        "     \n" +
                                        "    public static void main(String[] args) {\n" +
                                        "         \n" +
                                        "        for(int i = 1; i <= 100; i++) {\n" +
                                        "             \n" +
                                        "            System.out.println(i + \" 의 약수 : \");\n" +
                                        "             \n" +
                                        "            for(int j = 1; j <= i; j++) {\n" +
                                        "                 \n" +
                                        "                if(i % j == 0) {\n" +
                                        "                    System.out.println(j);\n" +
                                        "                }\n" +
                                        "            }\n" +
                                        "        }\n" +
                                        "    }\n"
                );

            }
        });
        Button b2 = (Button) findViewById(R.id.clear);
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                TextView tv = (TextView) findViewById(R.id.explain);

                tv.setText("");

                Intent intent=new Intent(JavaSourceAnswer06.this,JavaCodeQList.class);
                startActivity(intent);
                finish();
            }
        });
    }
}