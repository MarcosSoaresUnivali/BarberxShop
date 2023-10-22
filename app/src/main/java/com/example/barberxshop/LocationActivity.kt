package com.example.barberxshop

import android.content.Intent
import android.graphics.Bitmap
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.webkit.WebView
import android.webkit.WebViewClient
import android.widget.ProgressBar
import com.google.android.material.snackbar.Snackbar

class LocationActivity : AppCompatActivity() {

    private val url: String = "https://github.com/MarcosSoaresUnivali/BarberxShop/blob/main/README_location.md"
    private lateinit var webview: WebView
    lateinit var progress: ProgressBar

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val fabHome: View = findViewById(R.id.fabHome)
        val contextHome = fabHome.context
        val intentHome = Intent(contextHome, LocationActivity::class.java)
        fabHome.setOnClickListener { view ->
            Snackbar.make(view, "Go to Location...", Snackbar.LENGTH_LONG)
                .setAction("Action", null)
                .show()
            contextHome.startActivity(intentHome)
        }

        val fab1: View = findViewById(R.id.floatingActionButton)
        val context1 = fab1.context
        val intent1 = Intent(context1, MainActivity::class.java)
        fab1.setOnClickListener { view ->
            Snackbar.make(view, "Go to Main...", Snackbar.LENGTH_LONG)
                .setAction("Action", null)
                .show()
            context1.startActivity(intent1)
        }
        val fab2: View = findViewById(R.id.floatingActionButton2)
        val context2 = fab2.context
        val intent2 = Intent(context2, ProfessionalActivity::class.java)
        fab2.setOnClickListener { view ->
            Snackbar.make(view, "Go to Professional...", Snackbar.LENGTH_LONG)
                .setAction("Action", null)
                .show()
            context2.startActivity(intent2)
        }
        val fab3: View = findViewById(R.id.floatingActionButton3)
        val context3 = fab3.context
        val intent3 = Intent(context3, ServiceActivity::class.java)
        fab3.setOnClickListener { view ->
            Snackbar.make(view, "Go to Service...", Snackbar.LENGTH_LONG)
                .setAction("Action", null)
                .show()
            context3.startActivity(intent3)
        }
        val fab4: View = findViewById(R.id.floatingActionButton4)
        val context4 = fab4.context
        val intent4 = Intent(context4, TimeActivity::class.java)
        fab4.setOnClickListener { view ->
            Snackbar.make(view, "Go to Time...", Snackbar.LENGTH_LONG)
                .setAction("Action", null)
                .show()
            context4.startActivity(intent4)
        }
        val fab5: View = findViewById(R.id.floatingActionButton5)
        val context5 = fab5.context
        val intent5 = Intent(context5, OrderSchedActivity::class.java)
        fab5.setOnClickListener { view ->
            Snackbar.make(view, "Go to Order Scheduled...", Snackbar.LENGTH_LONG)
                .setAction("Action", null)
                .show()
            context5.startActivity(intent5)
        }
        val fab6: View = findViewById(R.id.floatingActionButton6)
        val context6 = fab6.context
        val intent6 = Intent(context6, SettingsActivity::class.java)
        fab6.setOnClickListener { view ->
            Snackbar.make(view, "Go to Settings...", Snackbar.LENGTH_LONG)
                .setAction("Action", null)
                .show()
            context6.startActivity(intent6)
        }

//        webview = findViewById(R.id.webview)
//        webview.settings.javaScriptEnabled = true
//        progress = findViewById(R.id.progress)
//
//        // Carrega a página
//        setWebViewClient(webview)
//        webview.loadUrl(url)
    }

    private fun setWebViewClient(webView: WebView?) {
        webView?.webViewClient = object : WebViewClient() {
            override fun onPageStarted(view: WebView?, url: String?, favicon: Bitmap?) {
                super.onPageStarted(view, url, favicon)
                // Ativa o PreogressBar
                progress.visibility = View.VISIBLE
            }
            override fun onPageFinished(view: WebView?, url: String?) {
                super.onPageFinished(view, url)
                // Desativa o PreogressBar
                progress.visibility = View.INVISIBLE
            }
        }
    }
}
