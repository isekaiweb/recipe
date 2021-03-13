package com.example.recipe.function

import android.content.Context
import android.widget.ImageView
import android.widget.Toast
import com.example.recipe.HomeActivity

fun changeStateLikeRecipe( isFav:Boolean, img:ImageView, foodName:String, context: Context, id:String){
    isFavorite(isFav,img)
    Toast.makeText(context,"${if(isFav)"Like" else "Dislike"} $foodName",Toast.LENGTH_SHORT).show()
    HomeActivity.prefs.push(id,isFav)
    HomeActivity.prefs.save()
}

