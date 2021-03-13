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

    fun setData(recipes: List<FoodRecipe>) {
        this.recipes = recipes
        notifyDataSetChanged()
    }

    inner class RecipeViewHolder(private val binding: CardLayoutBinding) :
        RecyclerView.ViewHolder(binding.root) {

        fun bindView(recipes: FoodRecipe) {
            binding.apply {
                glide(itemView.context, recipes.creatorPhoto, imgCreator)
                glide(itemView.context, recipes.foodPhoto, imgFood)
                tvCreatorName.text = recipes.creatorName
                tvFoodName.text = recipes.foodName
                tvStory.text = recipes.story
                isFavorite(recipes.isFavorite, imgFav)
                cardRecipes.setOnClickListener {
                    Toast.makeText(itemView.context,"Open Detail ${tvFoodName.text}",Toast.LENGTH_SHORT).show()
                    listener(recipes)
                }

                imgFav.setOnClickListener {
                    recipes.isFavorite = !recipes.isFavorite
                    changeStateLikeRecipe(recipes.isFavorite,imgFav,recipes.foodName,itemView.context,recipes.id.toString())
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