package kr.hs.dgsw.k_bank.fragment

import android.R.attr
import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kr.hs.dgsw.k_bank.R
import kr.hs.dgsw.k_bank.databinding.FragmentSignUpProfileBinding
import android.R.attr.data
import android.app.Activity.RESULT_OK
import android.net.Uri


class SignUpProfileFragment : Fragment() {
    lateinit var binding: FragmentSignUpProfileBinding
    val GET_GALLERY_IMAGE = 200
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentSignUpProfileBinding.inflate(inflater, container, false)

        binding.profile.setOnClickListener {
            val intent = Intent(Intent.ACTION_PICK)
            intent.setDataAndType(android.provider.MediaStore.Images.Media.EXTERNAL_CONTENT_URI, "image/*")
            startActivityForResult(intent,GET_GALLERY_IMAGE)


        }

        return binding.root
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        if (requestCode === GET_GALLERY_IMAGE && resultCode === RESULT_OK && data != null && data?.data != null) {
            val selectedImageUri: Uri = data.data as Uri
            binding.profile.setImageURI(selectedImageUri)
        }
    }
}