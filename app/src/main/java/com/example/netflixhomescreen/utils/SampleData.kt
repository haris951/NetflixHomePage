package com.example.netflixhomescreen.utils

import com.example.netflixhomescreen.model.MainModel
import com.example.netflixhomescreen.model.MovieModel

object SampleData {
    private val movieModel= listOf(
        MovieModel(Images.ImageUrl1),
        MovieModel(Images.ImageUrl2),
        MovieModel(Images.ImageUrl3),
        MovieModel(Images.ImageUrl4),
        MovieModel(Images.ImageUrl5),
        MovieModel(Images.ImageUrl6),
        MovieModel(Images.ImageUrl7),
        MovieModel(Images.ImageUrl8),
        MovieModel(Images.ImageUrl9)

    )
    val collections= listOf(
        MainModel("All Movie", movieModel),
        MainModel("Want To See", movieModel.reversed()),
        MainModel("Popular Movie", movieModel.shuffled()),
        MainModel("Top Rated Movie", movieModel.shuffled())

    )
}