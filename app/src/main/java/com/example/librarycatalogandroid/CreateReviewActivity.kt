package com.example.librarycatalogandroid

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.widget.SwitchCompat
import org.openapitools.client.apis.ReviewsApi
import org.openapitools.client.models.ReviewDto

class CreateReviewActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_create_review)

        val publicationId = intent.extras!!["publicationId"] as Int

        val reviewsApi = ReviewsApi(MainActivity.basePath)

        val reviewerNameEditText = findViewById<View>(R.id.reviewerNameEditText) as EditText
        val commentEditText = findViewById<View>(R.id.commentEditText) as EditText
        val isPositiveSwitch = findViewById<View>(R.id.isPositiveSwitch) as SwitchCompat

        val mainActivityIntent = Intent(this, MainActivity::class.java)

        (findViewById<View>(R.id.submitButton) as TextView).setOnClickListener {
            reviewsApi.reviewsPost(
                ReviewDto(
                    reviewerNameEditText.text.toString(),
                    isPositiveSwitch.isChecked,
                    commentEditText.text.toString(),
                    publicationId
                )
            )

            startActivity(mainActivityIntent)
        }
    }
}
