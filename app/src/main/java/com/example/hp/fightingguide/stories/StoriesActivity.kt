package com.example.hp.fightingguide.stories

import android.content.res.Configuration
import android.os.Bundle
import android.support.design.widget.Snackbar
import android.support.v7.widget.GridLayout
import android.support.v7.widget.GridLayoutManager
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.view.View
import android.view.WindowManager
import com.arellomobile.mvp.MvpAppCompatActivity
import com.arellomobile.mvp.presenter.InjectPresenter
import com.bumptech.glide.Glide
import com.example.hp.fightingguide.R
import com.example.hp.fightingguide.R.layout.activity_stories
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


//        setTheme(android.R.style.Theme_Black_NoTitleBar_Fullscreen)
//        window.setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN)

    }

    override fun showError(error: String) {
        Snackbar.make(stories_activity, error, Snackbar.LENGTH_LONG).show()
    }

    override fun getData(data: ArrayList<StoriesData>) {
        val orintationPos = this.resources.configuration.orientation
        if (orintationPos == Configuration.ORIENTATION_PORTRAIT) {
            rv_stories.layoutManager = GridLayoutManager(this,1)
        } else {
            rv_stories.layoutManager = GridLayoutManager(this,2)
        }
        rv_stories.adapter = StoriesRecyclerAdapter(data, this)
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
