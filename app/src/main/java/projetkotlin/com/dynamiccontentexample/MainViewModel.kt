package projetkotlin.com.dynamiccontentexample

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainViewModel : ViewModel() {

    val mTextFieldState = MutableLiveData("")

    fun onTextChanged(mNewText: String) {
        mTextFieldState.value = mNewText
    }
}