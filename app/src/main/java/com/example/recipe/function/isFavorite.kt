package com.example.recipe.function

import android.widget.ImageView
import com.example.recipe.R

fun isFavorite(isFavorite:Boolean, imgFav: ImageView){
    when (isFavorite) {
        true -> imgFav.setImageResource(R.drawable.ic_favorite_true)
        else -> imgFav.setImageResource(R.drawable.ic_favorite_false)
    }
}

