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

public class JavaAnswer04 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.java_answer);
        android.support.v7.app.ActionBar ab = getSupportActionBar();
        ab.setTitle("면접 예상 질문");
        TextView qtv= (TextView)findViewById(R.id.question);
        qtv.setText(" 톰캣 튜닝에 대해 설명 해보세요.");
        Button b = (Button) findViewById(R.id.rightAnswer);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                TextView tv = (TextView) findViewById(R.id.explain);

                tv.setText(
                                "1. Listener\n" +
                                        "\n" +
                                        "   <Listener className=\"org.apache.catalina.security.SecurityListener\" checkedOsUsers=\"root\" />\n" +
                                        "\n" +
                                        "   톰캣 시작시 root로 실행하는것을 방지하는 부분이다. 톰캣 단독으로 80포트 이용시에는 필요없을 부분이긴 하지만,\n" +
                                        "   그렇지 않다면 해당 옵션을 켜주는게 좋다. root 실행은 퍼미션 문제든 여러 문제점을 야기하므로 특별한 경우가 아니면\n" +
                                        "   root 실행은 하지 말자.\n" +
                                        "\n" +
                                        "   * 구문은 주석으로 처리되어 있으니, 주석을 해제하자.\n" +
                                        "\n" +
                                        "\n" +
                                        "\n" +
                                        "\n" +
                                        "2. Connector\n" +
                                        "   \n" +
                                        "   1) connectionTimeout=\"5000\"\n" +
                                        "   타임아웃 시간을 지정한다. 연결 요청후 URI 요청이 들어오기까지의 대기시간이다. 기본값은 60초이며\n" +
                                        "   타임아웃 시간을 10초 이내로 지정하는게 좋다.(5000은 5초 이다)\n" +
                                        "\n" +
                                        "\n" +
                                        "   2) minSpareThreads=\"25\"\n" +
                                        "   Tomcat이 실행될때 생성되는 스레드 사이즈 이다. \n" +
                                        "\n" +
                                        "\n" +
                                        "   3) maxThreads=\"100\"\n" +
                                        "   Tomcat의 최대 스레드 수를 지정한다. 최대 접속가능한 Active User의 수를 뜻한다. \n" +
                                        "\n" +
                                        "   일반적으로 100 내외가 적절하다고 알려져 있다.\n" +
                                        "\n" +
                                        "\n" +
                                        "   4) acceptCount=\"100\"\n" +
                                        "   Tomcat의 스레드가 full 일 경우 요청을 대기하는 queue의 길이이다. \n" +
                                        "\n" +
                                        "   순간적인 과부화 상황에 대비하기 위해 큐의 길이을 10내외 정도로 짧게 주는게 좋다고 한다.\n" +
                                        "\n" +
                                        "\n" +
                                        "   5) disableUploadTimeout=\"true\"\n" +
                                        "   데이터를 업로드할 시에 connectionTimeout을 끌것인지에 대한 내용이다. \n" +
                                        "\n" +
                                        "   데이터가 큰 경우 업로드 시간이 connectionTimeout을 넘는경우가 많으므로 설정하는게 좋다.\n" +
                                        "\n" +
                                        "\n" +
                                        "   6) maxConnections=\"8192\"\n" +
                                        "   Tomcat이 유지할수 있는 커넥션 최대 수이다. \n" +
                                        "\n" +
                                        "   하지만 현재 연결되어 있는 실제 커넥션의 최대 수는 아니다.(TIME_WAIT 등과 같은 커넥션 존재)\n"
                );

            }
        });
        Button b2 = (Button) findViewById(R.id.clear);
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                TextView tv = (TextView) findViewById(R.id.explain);

                tv.setText("");

                Intent intent=new Intent(JavaAnswer04.this, JavaQList.class);
                startActivity(intent);
                finish();
            }
        });
    }
}