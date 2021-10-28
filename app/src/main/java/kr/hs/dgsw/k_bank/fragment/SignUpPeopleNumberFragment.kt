package kr.hs.dgsw.k_bank.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import kr.hs.dgsw.k_bank.R
import kr.hs.dgsw.k_bank.databinding.FragmentSignUpPeopleNumberBinding
import kr.hs.dgsw.k_bank.extension.changeFocusListener

class SignUpPeopleNumberFragment : Fragment() {
    lateinit var binding: FragmentSignUpPeopleNumberBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentSignUpPeopleNumberBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.backBtn.setOnClickListener {
            findNavController().navigate(R.id.action_signUpPeopleNumberFragment_to_signUpNumberFragment)
        }
        binding.nextBtn.setOnClickListener {
            findNavController().navigate(R.id.action_signUpPeopleNumberFragment_to_signUpNameFragment)
        }

        binding.edit1.changeFocusListener { _, afterText ->
            if (afterText.length == 1) {
                binding.edit2.isFocusableInTouchMode = true
                binding.edit1.isFocusableInTouchMode = false
                binding.edit2.requestFocus()
            }
        }

        binding.edit2.changeFocusListener { beforeText, afterText ->
            if (beforeText.length == 1 && afterText.length == 0) {
                binding.edit2.isFocusableInTouchMode = false
                binding.edit1.isFocusableInTouchMode = true
                binding.edit1.requestFocus()
            } else if (afterText.length == 1) {
                binding.edit3.isFocusableInTouchMode = true
                binding.edit2.isFocusableInTouchMode = false
                binding.edit3.requestFocus()
            }

        }

        binding.edit3.changeFocusListener { beforeText, afterText ->
            if (beforeText.length == 1 && afterText.length == 0) {
                binding.edit3.isFocusableInTouchMode = false
                binding.edit2.isFocusableInTouchMode = true
                binding.edit2.requestFocus()
            } else if (afterText.length == 1) {
                binding.edit4.isFocusableInTouchMode = true
                binding.edit3.isFocusableInTouchMode = false
                binding.edit4.requestFocus()
            }

        }

        binding.edit4.changeFocusListener { beforeText, afterText ->
            if (beforeText.length == 1 && afterText.length == 0) {
                binding.edit4.isFocusableInTouchMode = false
                binding.edit3.isFocusableInTouchMode = true
                binding.edit3.requestFocus()
            } else if (afterText.length == 1) {
                binding.edit5.isFocusableInTouchMode = true
                binding.edit4.isFocusableInTouchMode = false
                binding.edit5.requestFocus()
            }

        }

        binding.edit5.changeFocusListener { beforeText, afterText ->
            if (beforeText.length == 1 && afterText.length == 0) {
                binding.edit5.isFocusableInTouchMode = false
                binding.edit4.isFocusableInTouchMode = true
                binding.edit4.requestFocus()
            } else if (afterText.length == 1) {
                binding.edit6.isFocusableInTouchMode = true
                binding.edit5.isFocusableInTouchMode = false
                binding.edit6.requestFocus()
            }

        }

        binding.edit6.changeFocusListener { beforeText, afterText ->
            if (beforeText.length == 1 && afterText.isEmpty()) {
                binding.edit6.isFocusableInTouchMode = false
                binding.edit5.isFocusableInTouchMode = true
                binding.edit5.requestFocus()
            } else if (afterText.length == 1) {
                binding.edit7.isFocusableInTouchMode = true
                binding.edit6.isFocusableInTouchMode = false
                binding.edit7.requestFocus()
            }

        }

        binding.edit7.changeFocusListener { beforeText, afterText ->
            if (beforeText.length == 1 && afterText.isEmpty()) {
                binding.edit7.isFocusableInTouchMode = false
                binding.edit6.isFocusableInTouchMode = true
                binding.edit6.requestFocus()
            }

        }


    }
}