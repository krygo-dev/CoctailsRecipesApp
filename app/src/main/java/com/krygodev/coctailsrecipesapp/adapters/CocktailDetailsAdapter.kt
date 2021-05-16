package com.krygodev.coctailsrecipesapp.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.AsyncListDiffer
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.krygodev.coctailsrecipesapp.R
import com.krygodev.coctailsrecipesapp.data.Cocktail
import kotlinx.android.synthetic.main.cocktail_details.view.*

class CocktailDetailsAdapter : RecyclerView.Adapter<CocktailDetailsAdapter.CocktailDetailsViewHolder>() {

    inner class CocktailDetailsViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView)

    private val differCallback = object : DiffUtil.ItemCallback<Cocktail>() {
        override fun areItemsTheSame(
            oldItem: Cocktail,
            newItem: Cocktail
        ): Boolean {
            return oldItem.idDrink == newItem.idDrink
        }

        override fun areContentsTheSame(
            oldItem: Cocktail,
            newItem: Cocktail
        ): Boolean {
            return oldItem == newItem
        }
    }

    val differ = AsyncListDiffer(this, differCallback)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CocktailDetailsViewHolder {
        return CocktailDetailsViewHolder(
            LayoutInflater.from(parent.context).inflate(
                R.layout.cocktail_details,
                parent,
                false
            )
        )
    }

    override fun getItemCount(): Int {
        return differ.currentList.size
    }

    private var onItemClickListener: ((Cocktail) -> Unit)? = null

    override fun onBindViewHolder(holder: CocktailDetailsViewHolder, position: Int) {
        val cocktail = differ.currentList[position]
        holder.itemView.apply {
            Glide.with(this).load(cocktail.strDrinkThumb).into(cocktailImageView)
            cocktailNameTextView.text = cocktail.strDrink
            cocktailInstructionTextView.text = cocktail.strInstructions
            ingredientName1TextView.text = cocktail.strIngredient1
            ingredientMeasure1TextView.text = cocktail.strMeasure1
            ingredientName2TextView.text = cocktail.strIngredient2
            ingredientMeasure2TextView.text = cocktail.strMeasure2
            ingredientName3TextView.text = cocktail.strIngredient3
            ingredientMeasure3TextView.text = cocktail.strMeasure3
            ingredientName4TextView.text = cocktail.strIngredient4
            ingredientMeasure4TextView.text = cocktail.strMeasure4
            ingredientName5TextView.text = cocktail.strIngredient5
            ingredientMeasure5TextView.text = cocktail.strMeasure5
            ingredientName6TextView.text = cocktail.strIngredient6
            ingredientMeasure6TextView.text = cocktail.strMeasure6
            ingredientName7TextView.text = cocktail.strIngredient7
            ingredientMeasure7TextView.text = cocktail.strMeasure7

            cocktailInFavImageView.setOnClickListener {
                onItemClickListener?.let { it(cocktail) }
            }
        }
    }

    fun setOnItemClickListener(listener: (Cocktail) -> Unit) {
        onItemClickListener = listener
    }
}