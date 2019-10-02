package com.example.user.example2d;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {
    Button up,down,left,right;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_custom_view);

        // Get the root Linearlayout object.
        LinearLayout rootLayout = (LinearLayout)findViewById(R.id.linear1);

        // Create the Drawgame custom view object.
        final Drawgame drawgame = new Drawgame(this);

        //set min width and height.
        drawgame.setMinimumWidth(500);
        drawgame.setMinimumHeight(800);

        // Create a ontouch listener object.
        up=(Button) findViewById(R.id.Up);
        up.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                drawgame.moveCarUp();
            }
        });
        down=(Button) findViewById(R.id.Down);
        down.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                drawgame.moveCarDown();
            }
        });
        left=(Button) findViewById(R.id.Left);
        left.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                drawgame.moveCarLeft();
            }
        });
        right=(Button) findViewById(R.id.Right);
        right.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                drawgame.moveCarRight();

            }
        });




        // Add drawgame object in root LinearLayout object.
        rootLayout.addView(drawgame);
    }

}