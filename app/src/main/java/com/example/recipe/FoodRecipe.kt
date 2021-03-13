package com.example.recipe

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class FoodRecipe(
    var id:Int,
    var creatorName:String,
    var creatorPhoto:String,
    var foodName:String,
    var foodPhoto:String,
    var story:String,
    var ingredients:String,
    var direction:String,
    var isFavorite:Boolean = false
) : Parcelable