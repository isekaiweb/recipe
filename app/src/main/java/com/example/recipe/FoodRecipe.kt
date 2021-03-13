package com.example.recipe

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class FoodRecipe(
    var id:Int,
    var creatorName:String,
    var creatorPhoto:Int,
    var foodName:String,
    var foodPhoto:Int,
    var story:String,
    var ingredients:String,
    var direction:String,
    var isFavorite:Boolean = false
) : Parcelable