package com.irfanirawansukirman.funwithconstraintlayout

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.irfanirawansukirman.funwithconstraintlayout.page1.Page1Activity
import com.irfanirawansukirman.funwithconstraintlayout.page2.Page2Activity
import com.irfanirawansukirman.funwithconstraintlayout.page3.Page3Activity
import com.irfanirawansukirman.funwithconstraintlayout.page4.Page4Activity
import com.irfanirawansukirman.funwithconstraintlayout.page5.Page5Activity
import com.irfanirawansukirman.funwithconstraintlayout.page6.Page6Activity
import com.irfanirawansukirman.funwithconstraintlayout.page7.Page7Activity
import com.irfanirawansukirman.funwithconstraintlayout.page8.Page8Activity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnPage1.setOnClickListener {
            startActivity(Intent(this, Page1Activity::class.java))
        }
        btnPage2.setOnClickListener {
            startActivity(Intent(this, Page2Activity::class.java))
        }
        btnPage3.setOnClickListener {
            startActivity(Intent(this, Page3Activity::class.java))
        }
        btnPage4.setOnClickListener {
            startActivity(Intent(this, Page4Activity::class.java))
        }
        btnPage5.setOnClickListener {
            startActivity(Intent(this, Page5Activity::class.java))
        }
        btnPage6.setOnClickListener {
            startActivity(Intent(this, Page6Activity::class.java))
        }
        btnPage7.setOnClickListener {
            startActivity(Intent(this, Page7Activity::class.java))
        }
        btnPage8.setOnClickListener {
            startActivity(Intent(this, Page8Activity::class.java))
        }
    }
}
