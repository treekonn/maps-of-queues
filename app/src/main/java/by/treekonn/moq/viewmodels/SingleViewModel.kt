package by.treekonn.moq.viewmodels

import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import okhttp3.OkHttpClient
import javax.inject.Inject

@HiltViewModel
class SingleViewModel @Inject constructor(
    private val okHttpClient: OkHttpClient
)
    : ViewModel() {
    var id: Int = 0
        get() {
            field++
            okHttpClient.authenticator
            return field
        }

}