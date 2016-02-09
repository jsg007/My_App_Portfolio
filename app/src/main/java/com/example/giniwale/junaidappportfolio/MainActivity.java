package com.example.giniwale.junaidappportfolio;

import android.content.Context;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Mail me on junaid.giniwale@gmail.com", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }

    /** Called when the user touches the button */
    public void displayToast(View view) {
        Context context = getApplicationContext();
        CharSequence toastText = "Hello toast!";
        int duration = Toast.LENGTH_SHORT;

        if (view.getId() == R.id.spotify_button){
            toastText="This button will launch my Spotify Streamer App!";
        }
        else if (view.getId() == R.id.scores_button){
            toastText="This button will launch my Scores App!";
        }
        else if(view.getId() == R.id.library_button){
            toastText="This button will launch my Library App!";
        }
        else if(view.getId() == R.id.build_button){
            toastText="This button will launch my Build It Bigger App!";
        }
        else if(view.getId() == R.id.reader_button){
            toastText="This button will launch my XYZ Reader App!";
        }
        else if(view.getId() == R.id.capstone_button){
            toastText="This button will launch my Capstone App!";
        }

        Toast toast = Toast.makeText(context, toastText, duration);
        toast.show();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
