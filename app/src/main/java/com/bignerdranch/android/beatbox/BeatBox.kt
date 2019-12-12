package com.bignerdranch.android.beatbox

import android.content.res.AssetManager
import com.bignerdranch.android.beatbox.models.Sound
import timber.log.Timber

class BeatBox(private val assets: AssetManager) {
  companion object {
    private const val SOUNDS_FOLDER = "sample_sounds"
  }

  val sounds: List<Sound>

  init {
    sounds = loadSounds()
  }

  private fun loadSounds(): List<Sound> {
    val soundNames: Array<String>

    try {
      soundNames = assets.list(SOUNDS_FOLDER)!!
    } catch (e: ExceptionInInitializerError) {
      Timber.e(e, "Could not listen assets")
      return emptyList()
    }
    val sounds = mutableListOf<Sound>()
    soundNames.forEach { filename ->
      val assetPath = "$SOUNDS_FOLDER/$filename"
      val sound = Sound(assetPath)
      sounds.add(sound)
    }
    return sounds
  }
}
