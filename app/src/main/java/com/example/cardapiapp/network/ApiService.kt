package com.example.cardapiapp.network

import com.example.cardapiapp.model.CardDTO
import com.example.cardapiapp.model.CardDTOItem
import com.example.cardapiapp.util.Constants
import retrofit2.Call
import retrofit2.http.*

interface ApiService {
    @GET(Constants.END_POINT)
    fun getAllCardList(): Call<CardDTO>

    @POST(Constants.END_POINT)
    fun createCard(@Body cardDTOItem: CardDTOItem): Call<CardDTOItem>

    @PUT("${Constants.END_POINT}/{id}")
    fun updateCard(@Path("id") id: String, @Body cardDTOItem: CardDTOItem): Call<CardDTOItem>

    @DELETE("${Constants.END_POINT}/{id}")
    fun deleteCard(@Path("id") id: String): Call<CardDTOItem>
}