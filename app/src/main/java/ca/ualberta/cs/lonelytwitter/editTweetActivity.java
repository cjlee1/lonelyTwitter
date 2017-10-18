package ca.ualberta.cs.lonelytwitter;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class editTweetActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_tweet);
        String s = getIntent().getStringExtra("tweet");
        String d = getIntent().getStringExtra("date");

        // Log.d("ddd",s);
      TextView txtView = (TextView) findViewById(R.id.tweet);
        txtView.setText(s);
        TextView txtView2 = (TextView) findViewById(R.id.date);
        txtView2.setText(d);



    }



}
