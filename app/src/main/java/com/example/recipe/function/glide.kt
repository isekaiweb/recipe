package com.example.recipe.function

import android.content.Context
import android.widget.ImageView
import com.bumptech.glide.Glide

fun glide(context: Context, src:Int, img: ImageView) =
    Glide.with(context).load(src).into(img)