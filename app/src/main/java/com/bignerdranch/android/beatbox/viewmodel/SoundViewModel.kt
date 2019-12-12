package com.bignerdranch.android.beatbox.viewmodel

import androidx.databinding.BaseObservable
import androidx.databinding.Bindable
import com.bignerdranch.android.beatbox.models.Sound

class SoundViewModel : BaseObservable() {
  var sound: Sound? = null
    set(sound) {
      field = sound
      notifyChange()
    }

  @get:Bindable
  val title: String?
    get() = sound?.name
}