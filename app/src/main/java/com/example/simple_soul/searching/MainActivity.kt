package com.example.simple_soul.searching

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import org.jsoup.Jsoup

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        hello.setOnClickListener {
            Toast.makeText(this, "Hello!", Toast.LENGTH_LONG).show()
            getHtml()
        }

    }

    fun getHtml()
    {
        val t = Thread(runnable).start()

    }

    //搜索地址 https://www.zhizhuso.net/so/[搜索内容]-first-asc-1?f=h
    private val runnable = Runnable {
        val doc = Jsoup.connect("https://www.zhizhuso.net/so/中-first-asc-1?f=h").get()

        Log.i("main", doc.title())
    }
}
