package com.example.recipe.fragment

import android.content.Context
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.NavController
import androidx.navigation.Navigation
import com.example.recipe.FoodRecipe
import com.example.recipe.databinding.FragmentDetailBinding
import com.example.recipe.function.changeStateLikeRecipe
import com.example.recipe.function.glide
import com.example.recipe.function.isFavorite


class DetailFragment : Fragment() {
    private lateinit var binding: FragmentDetailBinding
    private lateinit var recipe: FoodRecipe
    private lateinit var navController: NavController


    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {


        binding = FragmentDetailBinding.inflate(inflater, container, false)
        return binding.root

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        getData()





        detailRecipe(requireContext())
        initNavController(view)

        binding.incToolbar.imgBackToolbar.setOnClickListener{
            navController.popBackStack()
        }
    }


    private fun detailRecipe(context: Context) {

        binding.apply {
            glide(context, recipe.creatorPhoto, imgCreator)
            glide(context, recipe.foodPhoto, imgFood)
            tvCreatorName.text = recipe.creatorName
            tvFoodName.text = recipe.foodName
            tvStory.text = recipe.story
            tvIngredients.text = recipe.ingredients
            tvDirection.text = recipe.direction


            isFavorite(recipe.isFavorite, imgFav)
            imgFav.setOnClickListener {
                recipe.isFavorite = !recipe.isFavorite

                changeStateLikeRecipe(
                    recipe.isFavorite,
                    imgFav,
                    recipe.foodName,
                    context,
                    recipe.id.toString()
                )

            }
        }
    }

    private fun getData() {
        recipe = arguments?.getParcelable(EXTRA_RECIPE)!!
    }


    private fun initNavController(view: View) {
        navController = Navigation.findNavController(view)
    }


}