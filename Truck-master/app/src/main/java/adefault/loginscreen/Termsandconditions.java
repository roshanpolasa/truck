package adefault.loginscreen;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Html;
import android.text.method.ScrollingMovementMethod;
import android.widget.TextView;

public class Termsandconditions extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_termsandconditions);
        String url="file:///andriod_assets/termsan&condition.html";
        TextView view=(TextView)findViewById(R.id.textView7);
        view.setText(Html.fromHtml(getString(R.string.termsandcondition)));
        view.setMovementMethod(new ScrollingMovementMethod());

    }
}
