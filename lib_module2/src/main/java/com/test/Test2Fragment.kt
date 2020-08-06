package com.test

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import kotlinx.android.synthetic.main.fragment_in_lib2.*
import com.test.navi.lib2.R
import com.test.navi.lib2.databinding.FragmentInLib2Binding

class Test2Fragment : Fragment(), View.OnClickListener {

    private lateinit var viewDataBinding: FragmentInLib2Binding


    override fun onCreateView(
            inflater: LayoutInflater,
            container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {
        viewDataBinding = FragmentInLib2Binding.inflate(inflater, container, false).apply {
            onClickListener = this@Test2Fragment
        }

        return viewDataBinding.root
    }


    override fun onClick(v: View?) {
        when (v) {
            btn -> {
                findNavController().navigate(R.id.navi_to_main_module_action)
            }
        }
    }
}
