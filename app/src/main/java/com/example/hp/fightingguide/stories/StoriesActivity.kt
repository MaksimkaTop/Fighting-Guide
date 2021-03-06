package com.example.hp.fightingguide.stories

import android.content.res.Configuration
import android.os.Bundle
import android.support.v7.widget.GridLayoutManager
import android.view.View
import com.arellomobile.mvp.MvpAppCompatActivity
import com.arellomobile.mvp.presenter.InjectPresenter
import com.bumptech.glide.Glide
import com.example.hp.fightingguide.R
import com.example.hp.fightingguide.data.StoriesData
import com.example.hp.fightingguide.helpers.MessageShow
import com.example.hp.fightingguide.presenter.StoriesPresenter
import com.example.hp.fightingguide.view.StoriesView
import kotlinx.android.synthetic.main.activity_stories.*


class StoriesActivity : MvpAppCompatActivity(), StoriesView {
    private var controlType: String = ""
    private var gameName: String = ""
    private var console: String = ""
    @InjectPresenter
    lateinit var mStoriesData: StoriesPresenter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_stories)
        controlType = intent.getStringExtra(getString(R.string.control_type))
        gameName = intent.getStringExtra(getString(R.string.game))
        console = intent.getStringExtra(getString(R.string.control_type))
        mStoriesData.getStoriesData(this, gameName)
        initBackgroungForGame(gameName)
        collapsing_toolbar.title = gameName.replace("_", " ")


    }

    override fun showError(error: String) {
        MessageShow().showSnackbar(stories_activity,error)
    }

    override fun getData(data: ArrayList<StoriesData>) {
        val orientationPos = this.resources.configuration.orientation

        if (orientationPos == Configuration.ORIENTATION_PORTRAIT) rv_stories.layoutManager = GridLayoutManager(this, 1)
        else rv_stories.layoutManager = GridLayoutManager(this, 2)

        rv_stories.adapter = StoriesRecyclerAdapter(data, this, console)
        rv_stories.itemAnimator
    }

    override fun showProgressBar(flag: Boolean) {
        pb_stories.visibility = if (flag) View.VISIBLE else View.INVISIBLE
    }

    private fun initBackgroungForGame(game: String) {
        if (game == getString(R.string.Injustice2)) {
            Glide
                    .with(iv_stories_appbar.context)
                    .load(R.drawable.injustice2_all_characters)
                    .into(iv_stories_appbar)
        }
        if (game == getString(R.string.Tekken7)) {
            Glide
                    .with(iv_stories_appbar.context)
                    .load(R.drawable.tekken_7_ded)
                    .into(iv_stories_appbar)
        }
        if(game == getString(R.string.MKX)){
            Glide
                    .with(iv_stories_appbar.context)
                    .load(R.drawable.mkk)
                    .into(iv_stories_appbar)
        }

    }
}
