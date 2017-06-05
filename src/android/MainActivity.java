package android;
import android.content.Intent;
import android.net.Uri;
import android.view.View;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;
import java.text.SimpleDateFormat;
import java.util.Date;

public class MainActivity extends Activity {

	long now = System.currentTimeMillis();

    Date date = new Date(now);
	SimpleDateFormat sdfNow = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");

	String formatDate = sdfNow.format(date);
    TextView dateNow;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        dateNow = (TextView) findViewById(R.id.dateNow);
        dateNow.setText(formatDate);
    }

    public void onClick01(View v) {
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("tel:119"));
        startActivity(intent);
    }
}




	/*  1. 시간 불러오기
	    2. 초기 화면
	    3. 로그인 화면
	    4. 회원 정보 입력 (통급시간, 보호자 번호)
	    5. gps 시스템 끌어오는 법
	    6. 문자 보내는 법
	 */


}
