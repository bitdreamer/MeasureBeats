package tlw.measurebeats;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.content.Intent;

public class ShowAnswerActivity extends AppCompatActivity
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);

        Intent goToAnswer = getIntent();
        double beat;
        beat = goToAnswer.getDoubleExtra( "thebeat", 0.0);

        LinearLayout lay = new LinearLayout( this );

        TextView tv = new TextView( this );
        tv.setText("beat per minute = ");
        lay.addView( tv );

        TextView beatView = new TextView( this );
        beatView.setText( ""+beat );
        beatView.setTextSize(30);
        lay.addView( beatView );


        setContentView( lay );

        /*
        //setContentView(R.layout.activity_show_answer);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();

            }
        }); */
    }

}
