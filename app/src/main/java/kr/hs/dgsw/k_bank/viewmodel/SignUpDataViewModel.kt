package kr.hs.dgsw.k_bank.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class SignUpDataViewModel : ViewModel() {
    companion object{
        val instance = SignUpDataViewModel()
    }

    private val _id = MutableLiveData<String>()
    private val _pwd = MutableLiveData<String>()
    private val _phoneNumber = MutableLiveData<String>()
    private val _peopleNumber = MutableLiveData<Int>()
    private val _name = MutableLiveData<String>()
    private val _nickName = MutableLiveData<String>()

    val id: LiveData<String>
        get() = _id
    val pwd: LiveData<String>
        get() = _pwd
    val phoneNumber: LiveData<String>
        get() = _phoneNumber
    val peopleNumber: LiveData<Int>
        get() = _peopleNumber
    val name: LiveData<String>
        get() = _name
    val nickName: LiveData<String>
        get() = _nickName

    init {
        _id.value = ""
        _pwd.value = ""
        _phoneNumber.value = ""
        _peopleNumber.value = 0
        _name.value = ""
        _nickName.value = ""
    }

    fun addId(id: String) {
        _id.value = id
    }
}