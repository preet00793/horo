package ca.ayraainformatics.horo;

import android.content.Intent;
import android.os.Bundle;
import android.text.Spanned;
import android.text.method.ScrollingMovementMethod;
import android.view.MenuItem;
import android.widget.ImageButton;
import android.widget.TextView;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.text.HtmlCompat;

import java.util.Objects;

public class Deatails extends AppCompatActivity {

    private TextView mTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_deatails);

        //Back Arrow
        ActionBar actionBar = getSupportActionBar();
        actionBar.setHomeButtonEnabled(true);
        actionBar.setDisplayHomeAsUpEnabled(true);

        //Get the Intent that started this Activity
        Intent intent = getIntent();
        String sign = intent.getStringExtra("sign");

        if(Objects.equals(sign, "mesha")){
            Spanned spanned = HtmlCompat.fromHtml(getString(R.string.mesha_text), HtmlCompat.FROM_HTML_MODE_COMPACT);
            TextView xOutput = (TextView) findViewById(R.id.details);
            xOutput.setText(spanned);
            xOutput.setMovementMethod(new ScrollingMovementMethod());
            ImageButton ib = (ImageButton) findViewById(R.id.pic);
            ib.setBackgroundResource(R.drawable.mesha);
        }

        if(Objects.equals(sign, "vrishabha")){
            Spanned spanned = HtmlCompat.fromHtml(getString(R.string.vrishabha_text), HtmlCompat.FROM_HTML_MODE_COMPACT);
            TextView xOutput = (TextView) findViewById(R.id.details);
            xOutput.setText(spanned);
            xOutput.setMovementMethod(new ScrollingMovementMethod());
            ImageButton ib = (ImageButton) findViewById(R.id.pic);
            ib.setBackgroundResource(R.drawable.vrishabha);
        }
    }


    //Back Arrow
    @Override
    public boolean onOptionsItemSelected(MenuItem item){
        switch(item.getItemId()){
            case android.R.id.home:
                onBackPressed();
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }

}