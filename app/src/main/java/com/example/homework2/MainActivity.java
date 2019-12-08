package com.example.homework2;

import android.annotation.SuppressLint;
import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageSwitcher;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.ViewSwitcher;
import android.widget.ViewSwitcher.ViewFactory;

public class MainActivity extends AppCompatActivity {

    private ImageView image;
    private ImageButton next;
    private ImageButton previous;
    private TextView Image_status;
    int ImageList[] = {R.drawable.image1,R.drawable.image2,R.drawable.image3,R.drawable.image4,
            R.drawable.image5,R.drawable.image6,R.drawable.image7};
    int count =0;
    int totallength = ImageList.length-1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        setTheme(R.style.AppTheme_NoActionBar);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        FindAllViews();
        Previous();
        Next();
        status();
        image.setImageResource(ImageList[0]);


        FloatingActionButton fab = findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view,"Replace with your own action",Snackbar.LENGTH_LONG)
                        .setAction("Action",null).show();
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        //enables user to move Quit application
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.Quit) {
            finishAndRemoveTask();
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    private void FindAllViews()  //finds all buttons used int code
    {
        next = findViewById(R.id.next);
        previous = findViewById(R.id.prevoius);
        image = findViewById(R.id.current_image);
        Image_status= findViewById(R.id.image_status);
    }

    private void Previous()
    //If the user presses the prevoius button this should enable the user to view the prevoius image

    {
        image.setImageResource(ImageList[0]);
        previous.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                count--;
                if (count >=0)
                {
                    Snackbar.make(view,"Next Image",Snackbar.LENGTH_SHORT)
                            .setAction("Action",null).show();
                    status();
                    image.setImageResource(ImageList[count]);
                }
                 if (count ==-1) //put in place so that the user cannot go past the first images
                 {
                     count = 1;
                     Image_status.setText("Cannot Show Prevoius. You are at "+ count);

                 }
            }
        });

    }

    private void status()
    {
        Image_status.setText("You are At "+ count + " Out of " + totallength+"");
    }

    private void Next()
    {
        // If the user presses the next button this should enable the user to view the Next image
        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                count++;
                if (count >0)
                {
                    Snackbar.make(view,"next image",Snackbar.LENGTH_SHORT)
                            .setAction("Action",null).show();
                    status();//updates status to show user what number image they are currently at

                }
                if (count==6) // Shows a warning to the user that they are near the edd of cycling through the images
                {
                    Snackbar.make(view,"This is the Last image",Snackbar.LENGTH_SHORT)
                            .setAction("Action",null).show();
                }

                if (count ==7)
                {
                    Image_status.setText("Cannot Show next, You are at " + totallength);
                    count = 6;
                }

                image.setImageResource(ImageList[count]); //changes the image
            }
        });
    }
}
