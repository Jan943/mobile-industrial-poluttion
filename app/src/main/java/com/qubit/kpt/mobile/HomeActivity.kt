package com.qubit.kpt.mobile

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.qubit.kpt.mobile.model.DummyModel

class HomeActivity : AppCompatActivity(), EventFragment.OnListFragmentInteractionListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)
    }

    override fun onListFragmentInteraction(item: DummyModel.DummyItem?) {

    }
}
