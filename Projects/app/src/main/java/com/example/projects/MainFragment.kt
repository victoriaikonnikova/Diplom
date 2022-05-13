package com.example.projects

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment

class MainFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanseState: Bundle?
        ): View? = inflater.inflate(R.layout.activity_main, container, false)

    override fun onViewCreated(view: View, savedInstanseState: Bundle?) {
        super.onViewCreated(view, savedInstanseState)
    }

}