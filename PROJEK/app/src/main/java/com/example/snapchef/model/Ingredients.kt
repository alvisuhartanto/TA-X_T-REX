package com.example.snapchef.model

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class Ingredients (
    val text:String,
    val weight:Double,
        ):Parcelable
