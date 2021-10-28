package kr.hs.dgsw.k_bank.fragment

import android.os.Bundle
import android.telephony.PhoneNumberFormattingTextWatcher
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import kr.hs.dgsw.k_bank.R
import kr.hs.dgsw.k_bank.databinding.FragmentSignUpNumberBinding

class SignUpNumberFragment : Fragment() {

    lateinit var binding: FragmentSignUpNumberBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentSignUpNumberBinding.inflate(inflater, container, false)

        binding.numberEdittext.addTextChangedListener(PhoneNumberFormattingTextWatcher())
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.nextBtn.setOnClickListener {
            findNavController().navigate(R.id.action_signUpNumberFragment_to_signUpPeopleNumberFragment)
        }

        binding.backBtn.setOnClickListener {
            findNavController().navigate(R.id.action_signUpNumberFragment_to_signUpPasswordFragment)
        }


    }
}