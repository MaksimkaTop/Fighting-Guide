package com.example.hp.fightingguide.stories

import android.os.Bundle
import android.support.design.widget.Snackbar
import android.support.v7.widget.LinearLayoutManager
import android.view.View
import com.arellomobile.mvp.MvpAppCompatActivity
import com.arellomobile.mvp.presenter.InjectPresenter
import com.example.hp.fightingguide.R
import com.example.hp.fightingguide.data.StoriesData
import com.example.hp.fightingguide.presenter.StoriesPresenter
import com.example.hp.fightingguide.view.StoriesView
import kotlinx.android.synthetic.main.activity_stories_list.*


class StoriesActivity : MvpAppCompatActivity(), StoriesView {
    private var controlType: String = ""
    @InjectPresenter
    lateinit var mStoriesData: StoriesPresenter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_stories_list)
        controlType = intent.getStringExtra(getString(R.string.control_type))
        mStoriesData.getStoriesData(this)
    }
        override fun showError(error: String) {
            Snackbar.make(stories_activity, error, Snackbar.LENGTH_LONG).show()
        }

    override fun getData(data: ArrayList<StoriesData?>) {
        rv_injustice.adapter = StoriesRecyclerAdapter(data)
        rv_injustice.layoutManager = LinearLayoutManager(this)
    }
    override fun showProgressBar(flag: Boolean) {
        pb_injustice.visibility = if (flag) View.VISIBLE else View.INVISIBLE
    }
}
