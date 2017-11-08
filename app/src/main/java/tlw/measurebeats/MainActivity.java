package tlw.measurebeats;

import android.content.Intent;
import android.os.SystemClock;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.view.View.OnClickListener;


public class MainActivity extends AppCompatActivity
    implements OnClickListener
{
    int numberOfClicks = 0;
    long firstClick = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);

        LinearLayout lay = new LinearLayout(this);

        // make a button that you have to press 8 times.
        Button b = new Button(this);
        b.setText("press me 8 times");
        b.setOnClickListener( this );
        lay.addView( b );


        setContentView( lay );
    }

    public void onClick( View v )
    {
        numberOfClicks++;
        if ( numberOfClicks==1 )
        {
           firstClick =  SystemClock.elapsedRealtime();
        }
        if ( numberOfClicks==8 )
        {
            long eigthClick = SystemClock.elapsedRealtime();
            double elapsedTime = (eigthClick - firstClick) / 60000.0 / 7 ;

            double beat = 1 / elapsedTime;

            // measure the beat.  show the answer.
            Intent goToAnswer = new Intent(this, ShowAnswerActivity.class );
            goToAnswer.putExtra("thebeat", beat );

            startActivity( goToAnswer );
        }
    }
}
