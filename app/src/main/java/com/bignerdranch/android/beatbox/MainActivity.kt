package com.bignerdranch.android.beatbox

import SoundAdapter
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.GridLayoutManager
import com.bignerdranch.android.beatbox.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
  private lateinit var beatBox: BeatBox

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)

    beatBox = BeatBox(assets)

    val binding: ActivityMainBinding = DataBindingUtil.setContentView(this, R.layout.activity_main)

    binding.recyclerView.apply {
      layoutManager = GridLayoutManager(context, 3)
      adapter = SoundAdapter(beatBox.sounds)
    }
  }
}
