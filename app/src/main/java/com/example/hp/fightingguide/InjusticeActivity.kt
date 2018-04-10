package com.example.hp.fightingguide

import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import com.arellomobile.mvp.MvpAppCompatActivity
import com.arellomobile.mvp.presenter.InjectPresenter
import com.example.hp.fightingguide.data.Stories
import com.example.hp.fightingguide.presenter.StoriesPresenter
import com.example.hp.fightingguide.stories.StoriesRecyclerAdapter
import com.example.hp.fightingguide.view.SelectCharacters
import kotlinx.android.synthetic.main.activity_injustice.*


class InjusticeActivity : MvpAppCompatActivity(), SelectCharacters {


    var controlType: String = ""
    @InjectPresenter
    lateinit var mStoriesData: StoriesPresenter


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_injustice)
        controlType = intent.getStringExtra(getString(R.string.control_type))
        // Log.wtf("qwe", controlType)

        //  initRecycler()
        mStoriesData.getStoriesData(this)

    }

    //    override fun showError(error: String) {
//        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
//    }
    override fun withData(data: ArrayList<Stories?>) {
        rv_injustice.adapter = StoriesRecyclerAdapter(data)
        rv_injustice.layoutManager = LinearLayoutManager(this)

    }


//    override fun showProgressBar(flag: Boolean) {
//        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
//    }
}
