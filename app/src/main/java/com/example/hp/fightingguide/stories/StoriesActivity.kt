package com.example.hp.fightingguide.stories

import android.os.Bundle
import android.support.design.widget.Snackbar
import android.support.v7.widget.LinearLayoutManager
import android.view.View
import com.arellomobile.mvp.MvpAppCompatActivity
import com.arellomobile.mvp.presenter.InjectPresenter
import com.bumptech.glide.Glide
import com.example.hp.fightingguide.R
import com.example.hp.fightingguide.data.StoriesData
import com.example.hp.fightingguide.presenter.StoriesPresenter
import com.example.hp.fightingguide.view.StoriesView
import kotlinx.android.synthetic.main.activity_stories.*


class StoriesActivity : MvpAppCompatActivity(), StoriesView {
    private var controlType: String = ""
    private var gameName: String = ""
    @InjectPresenter
    lateinit var mStoriesData: StoriesPresenter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_stories)
        controlType = intent.getStringExtra(getString(R.string.control_type))
        gameName = intent.getStringExtra(getString(R.string.game))
        mStoriesData.getStoriesData(this)
        collapsing_toolbar.title = gameName
        appbarImg()
    }

    override fun showError(error: String) {
        Snackbar.make(stories_activity, error, Snackbar.LENGTH_LONG).show()
    }

    override fun getData(data: ArrayList<StoriesData>) {
        rv_stories.adapter = StoriesRecyclerAdapter(data, this)
        rv_stories.layoutManager = LinearLayoutManager(this)
        rv_stories.itemAnimator
    }

    override fun showProgressBar(flag: Boolean) {
        pb_stories.visibility = if (flag) View.VISIBLE else View.INVISIBLE
    }

    fun appbarImg() {
        Glide
                .with(iv_stories_appbar.context)
                .load(R.drawable.injustice2_all_characters)
                .into(iv_stories_appbar)
    }
}
