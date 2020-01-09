package com.vidi.embedded_ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment

class EmbeddedFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val v = inflater.inflate(R.layout.embedded_fragment, container, false)
        val textView = v.findViewById<TextView>(R.id.the_text)
        textView.text = requireContext().applicationContext.packageName
        return v
    }

}