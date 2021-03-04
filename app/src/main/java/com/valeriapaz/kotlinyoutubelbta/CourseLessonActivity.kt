package com.valeriapaz.kotlinyoutubelbta

import android.graphics.Color
import android.os.Bundle
import android.os.PersistableBundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_course_lesson.*

/**
 * * Created by Valeria Paz on 04/03/21.
 */

class CourseLessonActivity: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_course_lesson)

        val courseLink = intent.getStringExtra(CourseDetailActivity.CourseLessonViewHolder.COURSE_LESSON_LINK_KEY)

        webView_course_lesson.settings.javaScriptEnabled = true
        webView_course_lesson.settings.loadWithOverviewMode = true
        webView_course_lesson.settings.useWideViewPort = true

        webView_course_lesson.loadUrl(courseLink.toString())
    }
}