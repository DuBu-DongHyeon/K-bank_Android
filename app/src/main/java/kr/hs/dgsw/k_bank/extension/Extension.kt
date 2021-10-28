package kr.hs.dgsw.k_bank.extension

import android.text.Editable
import android.text.TextWatcher
import android.widget.EditText

fun EditText.changeFocusListener(completion: (String, String) -> Unit) {
    this.addTextChangedListener(object : TextWatcher {
        lateinit var beforeText: String
        lateinit var afterText: String
        override fun beforeTextChanged(beforeChange: CharSequence?, p1: Int, p2: Int, p3: Int) {
            beforeText = beforeChange.toString()
        }

        override fun onTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {
        }

        override fun afterTextChanged(afterChange: Editable?) {
            afterText = afterChange.toString()
            completion(beforeText, afterText)
        }

    })
}