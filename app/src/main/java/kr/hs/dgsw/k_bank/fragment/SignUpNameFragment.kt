package kr.hs.dgsw.k_bank.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import kr.hs.dgsw.k_bank.R
import kr.hs.dgsw.k_bank.databinding.FragmentSignUpNameBinding

class SignUpNameFragment : Fragment() {
    lateinit var binding: FragmentSignUpNameBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentSignUpNameBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.backBtn.setOnClickListener {
            findNavController().navigate(R.id.action_signUpNameFragment_to_signUpPeopleNumberFragment)
        }

        binding.nextBtn.setOnClickListener {
            findNavController().navigate(R.id.action_signUpNameFragment_to_signUpProfileFragment)
        }
    }
}