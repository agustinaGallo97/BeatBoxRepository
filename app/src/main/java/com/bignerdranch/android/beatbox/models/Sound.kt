package com.bignerdranch.android.beatbox.models

class Sound(val assetPath: String) {
  companion object {
    private const val WAV = ".wav"
  }

  val name = assetPath.split("/").last().removeSuffix(WAV)
}
