package com.example.recipe.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.os.bundleOf
import androidx.fragment.app.Fragment
import androidx.navigation.NavController
import androidx.navigation.Navigation
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.recipe.*
import com.example.recipe.databinding.FragmentHomeBinding


class HomeFragment : Fragment() {

    private lateinit var binding:FragmentHomeBinding
    private lateinit var adapterData: FoodRecipeAdapter
    private var recipes = listOf<FoodRecipe>()
    private lateinit var navController: NavController
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)


        initListRecipes()
        initData()

        initNavController(view)

        binding.incToolbar.imgIcPerson.setOnClickListener{
            moveToProfileFragment()
        }
    }
    private fun initNavController(view: View) {
        navController = Navigation.findNavController(view)
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding =  FragmentHomeBinding.inflate(inflater,container,false)
        return binding.root
    }

    private fun initData(){
       recipes = foodRecipeData()

        recipes.forEach {
            it.isFavorite = HomeActivity.prefs.pull(it.id.toString(),false)
        }
       adapterData.setData(recipes)
    }

    private fun initListRecipes(){
        binding.list.layoutManager = LinearLayoutManager(requireContext())
        adapterData = FoodRecipeAdapter {
             moveToDetailFragment(it)
        }

        binding.list.adapter = adapterData
    }

    private fun moveToDetailFragment(recipe:FoodRecipe){
        val bundle = bundleOf(EXTRA_RECIPE to recipe)
        navController.navigate(R.id.homeFragment_to_detailFragment,bundle)
    }

    private fun moveToProfileFragment(){
        navController.navigate(R.id.homeFragment_to_profileFragment)
    }


}


