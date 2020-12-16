package com.example.librarycatalogandroid

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TableLayout
import android.widget.TableRow
import android.widget.TextView
import org.openapitools.client.apis.AuthorsApi
import org.openapitools.client.apis.PublicationsApi
import org.openapitools.client.apis.PublishersApi
import org.openapitools.client.apis.ReviewsApi

class PublicationActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_publication)

        val publicationId = intent.extras!!["publicationId"] as Int

        val publicationsApi = PublicationsApi(MainActivity.basePath)
        val authorsApi = AuthorsApi(MainActivity.basePath)
        val publishersApi = PublishersApi(MainActivity.basePath)
        val reviewsApi = ReviewsApi(MainActivity.basePath)

        val publication = publicationsApi.publicationsIdGet(publicationId)
        (findViewById<View>(R.id.titleTextView) as TextView).text = publication.title
        (findViewById<View>(R.id.publisherTextView) as TextView).text =
            publication.publisherId
                ?.let { publishersApi.publishersIdGet(it) }
                ?.run { "$name ($email)" }
                .let { "Publisher: ${it ?: "Not specified"}" }

        (findViewById<View>(R.id.descriptionTextView) as TextView).text = publication.description

        (findViewById<View>(R.id.authorsTextView) as TextView).text = publication.authorsIds?.map {
            authorsApi.authorsIdGet(it).name
        }?.joinToString(",").let { "Authors: $it" }

        val reviews = publication.reviewsIds?.map { reviewsApi.reviewsIdGet(it) }
        val reviewsTableLayout = findViewById<View>(R.id.reviewsTableLayout) as TableLayout

        reviewsTableLayout.addView(TableRow(this).also {
            it.addView(TextView(this).apply {
                text = "Reviewer"
                this.setPadding(0, 0, 30, 0)
            })
            it.addView(TextView(this).apply { text = "Comment" })
        })

        reviews?.forEach { review ->
            reviewsTableLayout.addView(TableRow(this).also {
                it.addView(TextView(this).apply { text = review.reviewerName })
                it.addView(TextView(this).apply { text = review.comment })
                it.setBackgroundColor(
                    if (review.isPositive == true)
                        Color.parseColor("#69e00d")
                    else Color.parseColor("#e31b1b")
                )
            })
        }
    }
}
