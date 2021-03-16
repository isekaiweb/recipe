package com.example.recipe


import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.example.recipe.databinding.CardLayoutBinding
import com.example.recipe.function.changeStateLikeRecipe
import com.example.recipe.function.glide
import com.example.recipe.function.isFavorite

class FoodRecipeAdapter(
    private val listener: (FoodRecipe) -> Unit
) :
    RecyclerView.Adapter<FoodRecipeAdapter.RecipeViewHolder>() {


    private var recipes = listOf<FoodRecipe>()

    fun setData(newRecipes: List<FoodRecipe>) {
        recipes = newRecipes
        notifyDataSetChanged()
    }

    inner class RecipeViewHolder(private val binding: CardLayoutBinding) :
        RecyclerView.ViewHolder(binding.root) {

        fun bindView(recipe: FoodRecipe) {
            binding.apply {
                glide(itemView.context, recipe.creatorPhoto, imgCreator)
                glide(itemView.context, recipe.foodPhoto, imgFood)
                tvCreatorName.text = recipe.creatorName
                tvFoodName.text = recipe.foodName
                tvStory.text = recipe.story
                isFavorite(recipe.isFavorite, imgFav)



                cardRecipes.setOnClickListener {
                    Toast.makeText(itemView.context,"Open Detail ${tvFoodName.text}",Toast.LENGTH_SHORT).show()
                    listener(recipe)
                }




                imgFav.setOnClickListener {
                    recipe.isFavorite = !recipe.isFavorite
                    changeStateLikeRecipe(
                        recipe.isFavorite,
                        imgFav,
                        recipe.foodName,
                        itemView.context,
                        recipe.id.toString()
                    )
                }
            }

        }


    }



    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecipeViewHolder =
        RecipeViewHolder(
            CardLayoutBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            )
        )


    override fun onBindViewHolder(holder: RecipeViewHolder, position: Int) {
        holder.bindView(recipes[position])
    }

    override fun getItemCount(): Int = recipes.size


}