package com.qubit.kpt.mobile.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.qubit.kpt.mobile.R
import com.qubit.kpt.mobile.model.DummyModel
import com.qubit.kpt.mobile.ui.fragments.EventFragment

class HomeActivity : AppCompatActivity(), EventFragment.OnListFragmentInteractionListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)
    }

    override fun onListFragmentInteraction(item: DummyModel.DummyItem?) {

    }
}
