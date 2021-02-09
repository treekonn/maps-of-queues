package by.treekonn.moq

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.Observer

class MovieActivity : AppCompatActivity(){
    
    private lateinit var tmdbViewModel: TmdbViewModel
  
     override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_movie)
       
        tmdbViewModel = ViewModelProviders.of(this).get(TmdbViewModel::class.java)
       
        tmdbViewModel.fetchMovies()
       
        tmdbViewModel.popularMovies.observe(this, Observer {
            
            //TODO - Your Update UI Logic
        })
       
     }
  
}