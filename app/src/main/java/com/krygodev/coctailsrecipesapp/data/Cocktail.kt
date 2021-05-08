package com.krygodev.coctailsrecipesapp.data

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.google.gson.annotations.SerializedName

@Entity(
    tableName = "cocktails"
)
data class Cocktail(
    @PrimaryKey(autoGenerate = true)
    var id: Int? = null,
    val dateModified: String,
    val idDrink: String,
    val strAlcoholic: String,
    val strCategory: String,
    val strCreativeCommonsConfirmed: String,
    val strDrink: String,
    val strDrinkAlternate: String? = null,
    val strDrinkThumb: String,
    val strGlass: String,
    val strIBA: String? = null,
    val strImageAttribution: String? = null,
    val strImageSource: String? = null,
    val strIngredient1: String,
    val strIngredient10: String? = null,
    val strIngredient11: String? = null,
    val strIngredient12: String? = null,
    val strIngredient13: String? = null,
    val strIngredient14: String? = null,
    val strIngredient15: String? = null,
    val strIngredient2: String,
    val strIngredient3: String,
    val strIngredient4: String? = null,
    val strIngredient5: String? = null,
    val strIngredient6: String? = null,
    val strIngredient7: String? = null,
    val strIngredient8: String? = null,
    val strIngredient9: String? = null,
    val strInstructions: String,
    val strInstructionsDE: String,
    val strInstructionsES: String? = null,
    val strInstructionsFR: String? = null,
    val strInstructionsIT: String,
    @SerializedName("strInstructionsZH-HANS")
    val strInstructionsZH_HANS: String? = null,
    @SerializedName("strInstructionsZH-HANT")
    val strInstructionsZH_HANT: String? = null,
    val strMeasure1: String,
    val strMeasure10: String? = null,
    val strMeasure11: String? = null,
    val strMeasure12: String? = null,
    val strMeasure13: String? = null,
    val strMeasure14: String? = null,
    val strMeasure15: String? = null,
    val strMeasure2: String? = null,
    val strMeasure3: String? = null,
    val strMeasure4: String? = null,
    val strMeasure5: String? = null,
    val strMeasure6: String? = null,
    val strMeasure7: String? = null,
    val strMeasure8: String? = null,
    val strMeasure9: String? = null,
    val strTags: String? = null,
    val strVideo: String? = null
)