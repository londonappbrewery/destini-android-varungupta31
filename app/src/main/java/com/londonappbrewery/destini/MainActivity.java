package com.londonappbrewery.destini;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    // TODO: Steps 4 & 8 - Declare member variables here:
    public TextView storyTextView;
    public Button topButton;
    public Button bottomButton;
    public int mStoryIndex;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        // TODO: Step 5 - Wire up the 3 views from the layout to the member variables:

        storyTextView=(TextView) findViewById(R.id.storyTextView);
        topButton=(Button) findViewById(R.id.buttonTop);
        bottomButton= (Button) findViewById(R.id.buttonBottom);
        mStoryIndex=1;






        // TODO: Steps 6, 7, & 9 - Set a listener on the top button:

        topButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(mStoryIndex==1){
                storyTextView.setText(R.string.T3_Story);
                topButton.setText(R.string.T3_Ans1);
                bottomButton.setText(R.string.T3_Ans2);
                mStoryIndex=3;}

                else if(mStoryIndex==2)
                {
                    storyTextView.setText(R.string.T3_Story);
                    topButton.setText(R.string.T3_Ans1);
                    bottomButton.setText(R.string.T3_Ans2);
                    mStoryIndex=3;
                }

                else if(mStoryIndex==3)
                {
                    storyTextView.setText(R.string.T6_End);

                    }
                }




        });




        // TODO: Steps 6, 7, & 9 - Set a listener on the bottom button:

        bottomButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(mStoryIndex==1){

                storyTextView.setText(R.string.T2_Story);
                topButton.setText(R.string.T2_Ans1);
                bottomButton.setText(R.string.T2_Ans2);
                mStoryIndex=2;}

                else if(mStoryIndex==2)
                {
                    storyTextView.setText(R.string.T4_End);
                }

                else if(mStoryIndex==3)
                {
                 storyTextView.setText(R.string.T5_End);
                }


            }
        });


    }


}
