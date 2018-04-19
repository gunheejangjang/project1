package android.michael.project1.main;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Intent;
import android.michael.project1.R;
import android.os.AsyncTask;
import android.os.Bundle;
import android.os.StrictMode;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public class LoginPage extends Activity {


    EditText userId, userPwd;
    Button loginBtn, joinBtn, naverBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.loginpage);

        userId = (EditText) findViewById(R.id.userId);
        userPwd = (EditText) findViewById(R.id.userPwd);
        loginBtn = (Button) findViewById(R.id.loginBtn);
        joinBtn = (Button) findViewById(R.id.joinBtn);
        naverBtn = (Button)findViewById(R.id.naverbtn);

        loginBtn.setOnClickListener(btnListener);
        joinBtn.setOnClickListener(btnListener);
        naverBtn.setOnClickListener(btnListener);
        if (android.os.Build.VERSION.SDK_INT > 9) { //oncreate 에서 바로 쓰레드돌릴려고 임시방편으로 넣어둔소스

            StrictMode.ThreadPolicy policy = new StrictMode.ThreadPolicy.Builder().permitAll().build();

            StrictMode.setThreadPolicy(policy);

        }
    }

    class CustomTask extends AsyncTask<String, Void, String> {
        String sendMsg, receiveMsg;
        @Override
        protected String doInBackground(String... strings) {
            try {
                String str;
                URL url = new URL("http://192.168.0.3:8080/User11/data.jsp");
                HttpURLConnection conn = (HttpURLConnection) url.openConnection();
                conn.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");
                conn.setRequestMethod("POST");
                OutputStreamWriter osw = new OutputStreamWriter(conn.getOutputStream());
                sendMsg = "id="+strings[0]+"&pwd="+strings[1]+"&type="+strings[2];
                osw.write(sendMsg);
                osw.flush();
                if(conn.getResponseCode() == conn.HTTP_OK) {
                    InputStreamReader tmp = new InputStreamReader(conn.getInputStream(), "UTF-8");
                    BufferedReader reader = new BufferedReader(tmp);
                    StringBuffer buffer = new StringBuffer();
                    while ((str = reader.readLine()) != null) {
                        buffer.append(str);
                    }
                    receiveMsg = buffer.toString();

                } else {
                    Log.i("통신 결과", conn.getResponseCode()+"에러");
                }

            } catch (MalformedURLException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }
            return receiveMsg;
        }
    }

    // 버튼 클릭 이벤트 리스너
    View.OnClickListener btnListener = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            switch (view.getId()) {
                case R.id.loginBtn : // 로그인 버튼 눌렀을 경우
                    String loginid = userId.getText().toString();
                    String loginpwd = userPwd.getText().toString();
                    try {
                        String result  = new CustomTask().execute(loginid,loginpwd,"login").get();
                        if(result.equals("true")) {
                            Toast.makeText(LoginPage.this,"로그인",Toast.LENGTH_SHORT).show();
                            Intent intent = new Intent(LoginPage.this,Mainpage.class);
                            startActivity(intent);

                        } else if(result.equals("false")) {
                            Toast.makeText(LoginPage.this,"아이디 또는 비밀번호가 틀렸음",Toast.LENGTH_SHORT).show();
                            userId.setText("");
                            userPwd.setText("");
                        } else if(result.equals("noId")) {
                            Toast.makeText(LoginPage.this,"존재하지 않는 아이디",Toast.LENGTH_SHORT).show();
                            userId.setText("");
                            userPwd.setText("");
                        }
                    }catch (Exception e) {}
                    break;
                case R.id.joinBtn : // 회원가입 버튼 눌렀을 경우
                    String joinid = userId.getText().toString();
                    String joinpwd = userPwd.getText().toString();
                    try {
                        String result  = new CustomTask().execute(joinid,joinpwd,"join").get();
                        if(result.equals("id")) {
                            Toast.makeText(LoginPage.this,"이미 존재하는 아이디입니다.",Toast.LENGTH_SHORT).show();
                            userId.setText("");
                            userPwd.setText("");
                        } else if(result.equals("ok")) {
                            userId.setText("");
                            userPwd.setText("");
                            Toast.makeText(LoginPage.this,"회원가입을 축하합니다.",Toast.LENGTH_SHORT).show();
                        }
                    }catch (Exception e) {}
                    break;
                case R.id.naverbtn :// 네이버버튼 눌렀을때 -> 네아로
                    ComponentName componentName = new ComponentName("com.nhn.android.oauth.test",
                            "com.nhn.android.oauth.test.activity.OAuthSampleActivity");
                    Intent intent = new Intent();
                    intent.setComponent(componentName);
                    startActivity(intent);
                    break;
            }
        }
    };
}
