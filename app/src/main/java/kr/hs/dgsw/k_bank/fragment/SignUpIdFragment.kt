package kr.hs.dgsw.k_bank.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import kr.hs.dgsw.k_bank.R
import kr.hs.dgsw.k_bank.databinding.FragmentSignUpIdBinding
import kr.hs.dgsw.k_bank.viewmodel.SignUpDataViewModel
import kr.hs.dgsw.k_bank.viewmodel.SignUpIdViewModel

class SignUpIdFragment : Fragment() {
    private lateinit var binding: FragmentSignUpIdBinding
    private lateinit var viewModel: SignUpIdViewModel


    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentSignUpIdBinding.inflate(inflater, container, false)


        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.nextBtn.setOnClickListener {
            val id = binding.idEditText.toString()
            SignUpDataViewModel.instance.addId(id)
            findNavController().navigate(R.id.action_signUpIdFragment_to_signUpPasswordFragment)
        }
    }
}