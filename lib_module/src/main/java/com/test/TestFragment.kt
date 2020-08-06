package com.test

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import kotlinx.android.synthetic.main.fragment_in_lib.*
import com.test.navi.lib.R
import com.test.navi.lib.databinding.FragmentInLibBinding

class TestFragment : Fragment(), View.OnClickListener {

    private lateinit var viewDataBinding: FragmentInLibBinding


    override fun onCreateView(
            inflater: LayoutInflater,
            container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {
        viewDataBinding = FragmentInLibBinding.inflate(inflater, container, false).apply {
            onClickListener = this@TestFragment
        }

        return viewDataBinding.root
    }


    override fun onClick(v: View?) {
        when (v) {
            btn -> {
                findNavController().navigate(R.id.navi_to_lib2_module_action)
            }
        }
    }
}
