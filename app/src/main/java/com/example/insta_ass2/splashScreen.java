package com.example.insta_ass2;
import android.content.Intent;
import android.os.AsyncTask;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ProgressBar;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class splashScreen extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {

        requestWindowFeature(Window.FEATURE_NO_TITLE);

        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);

        getSupportActionBar().hide();

        super.onCreate(savedInstanceState);
        setContentView(R.layout.splash_screen);



        ProgressBar progressBar=(ProgressBar)findViewById(R.id.progressBar);
        progressBar.setVisibility(View.VISIBLE);

        new loginTask().execute();



    }


    private class loginTask extends AsyncTask<Void,Void,Void>
    {



        // getSupportActionBar().hide();

        @Override
        protected void onPreExecute() {



        }

        @Override
        protected Void doInBackground(Void... voids) {



            return null;
        }

        @Override
        protected void onPostExecute(Void unused) {
            super.onPostExecute(unused);

            new Handler().postDelayed(new Runnable() {
                @Override
                public void run() {
                    Intent intent=new Intent(splashScreen.this,MainActivity.class);
                    startActivity(intent);
                    finish();



                }
            }, 3000);


        }
    }

}
