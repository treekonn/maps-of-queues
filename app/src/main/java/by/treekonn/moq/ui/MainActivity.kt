package by.treekonn.moq.ui

import android.os.Bundle
import androidx.activity.compose.setContent
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import by.treekonn.moq.viewmodels.SingleViewModel
import dagger.hilt.android.AndroidEntryPoint
import okhttp3.OkHttpClient
import javax.inject.Inject

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {

    @Inject lateinit var okHttpClient: OkHttpClient

    private val viewModel: SingleViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent { MessageCard("Ivan") }
    }
}

@Composable
fun MessageCard(name: String) {
    Text(text = "Hello $name!")
}