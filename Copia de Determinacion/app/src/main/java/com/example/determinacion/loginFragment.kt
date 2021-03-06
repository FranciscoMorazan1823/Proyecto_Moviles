package com.frank.mipymes

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.findNavController
import com.example.determinacion.R
import com.example.determinacion.databinding.FragmentLoginBinding


/**
 * A simple [Fragment] subclass.
 */
class loginFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val binding = DataBindingUtil.inflate<FragmentLoginBinding>(
            inflater, R.layout.fragment_login, container, false
        )
        binding.login.setOnClickListener { view: View ->
            view.findNavController().
            navigate(R.id.action_fragment_login_to_fragment_inicio)

        }
        return binding.root
    }

}
