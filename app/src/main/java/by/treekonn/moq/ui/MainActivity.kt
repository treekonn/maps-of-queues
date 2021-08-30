package by.treekonn.moq.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.viewModels
import by.treekonn.moq.databinding.ActivityMainBinding
import by.treekonn.moq.viewmodels.SingleViewModel
import dagger.hilt.android.AndroidEntryPoint
import okhttp3.OkHttpClient
import javax.inject.Inject

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    @Inject lateinit var okHttpClient: OkHttpClient

    private val viewModel: SingleViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        initViews()
    }

    private fun initViews() {
        binding.btnCounter.setOnClickListener {
            binding.tvCounter.text = viewModel.id.toString()
            okHttpClient.authenticator
        }
    }
}