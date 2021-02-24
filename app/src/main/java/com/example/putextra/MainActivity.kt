package com.example.putextra

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button

class MainActivity : AppCompatActivity() {
    var isFragmentOneLoaded = true;
    val manager = supportFragmentManager;

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var intentbutton = findViewById<Button>(R.id.buttonintent);
        var fragmentPage = fragmentPage();
        var buttonfrag = findViewById<Button>(R.id.buttonfrag);


        intentbutton.setOnClickListener {
            var intent = Intent(this, NewPage::class.java);
            intent.putExtra("name","swaraj");
            startActivity(intent);
        };

        buttonfrag.setOnClickListener({

            var bundle = Bundle();
            bundle.putString("name","viraj")
            fragmentPage.setArguments(bundle)
            supportFragmentManager.beginTransaction().replace(R.id.fragment_container,fragmentPage).commit();
        });

        Log.e("Main Activity","onCreate")
    }



    override fun onStart() {
        super.onStart()
        Log.e("Main Activity","onStart")
    }

    override fun onResume() {
        super.onResume()
        Log.e("Main Activity","onResume")
    }

    override fun onPause() {
        super.onPause()
        Log.e("Main Activity","onPause")
    }

    override fun onRestart() {
        super.onRestart()
        Log.e("Main Activity","onRestart")
    }

    override fun onStop() {
        super.onStop()
        Log.e("Main Activity","onStop")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.e("Main Activity","onDestroy")
    }
}