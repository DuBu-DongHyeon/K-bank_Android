package kr.hs.dgsw.k_bank.fragment

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.lifecycle.LifecycleOwner
import androidx.lifecycle.Observer
import androidx.navigation.fragment.findNavController
import kr.hs.dgsw.k_bank.R
import kr.hs.dgsw.k_bank.databinding.FragmentSignUpPasswordBinding
import kr.hs.dgsw.k_bank.viewmodel.SignUpDataViewModel

class SignUpPasswordFragment : Fragment() {

    lateinit var binding: FragmentSignUpPasswordBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentSignUpPasswordBinding.inflate(inflater, container, false)

        SignUpDataViewModel.instance.id.observe(activity as LifecycleOwner, Observer {
            Toast.makeText(activity,"id값 ${it.toString()}",Toast.LENGTH_SHORT).show()
            Log.d("TAG", "id값 it ${it.toString()} ")
        })

        binding.nextBtn.setOnClickListener {
            findNavController().navigate(R.id.action_signUpPasswordFragment_to_signUpNumberFragment)
        }

        binding.backBtn.setOnClickListener {
            findNavController().navigate(R.id.action_signUpPasswordFragment_to_signUpIdFragment)
        }

        return binding.root
    }
}