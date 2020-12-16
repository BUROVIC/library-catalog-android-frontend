package com.example.librarycatalogandroid

import android.content.Intent
import android.os.Bundle
import android.os.StrictMode
import android.view.View
import android.widget.Button
import android.widget.TableLayout
import android.widget.TableRow
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import org.openapitools.client.apis.PublicationsApi

class MainActivity : AppCompatActivity() {
    companion object {
        const val basePath = "http://192.168.1.50:5000"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        StrictMode.setThreadPolicy(StrictMode.ThreadPolicy.Builder().permitAll().build())

        val publicationsApi = PublicationsApi(basePath)

        val publications = publicationsApi.publicationsGet()

        val publicationsTableLayout = findViewById<View>(R.id.publicationsTableLayout) as TableLayout

        publicationsTableLayout.addView(TableRow(this).also {
            it.addView(TextView(this).apply {
                text = "Title"
            })
        })

        val publicationActivityIntent = Intent(this, PublicationActivity::class.java)
        val createReviewActivityIntent = Intent(this, CreateReviewActivity::class.java)

        publications.forEach { publication ->
            publicationsTableLayout.addView(TableRow(this).also {
                it.addView(TextView(this).apply {
                    text = publication.title
                    textSize = 15.0f
                    setOnClickListener {
                        publicationActivityIntent.putExtra("publicationId", publication.id)
                        startActivity(publicationActivityIntent)
                    }
                })
                it.addView(Button(this).apply {
                    text = "Review"
                    setOnClickListener {
                        createReviewActivityIntent.putExtra("publicationId", publication.id)
                        startActivity(createReviewActivityIntent)
                    }
                })
            })
        }
    }
}
