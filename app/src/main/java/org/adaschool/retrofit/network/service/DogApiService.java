package org.adaschool.retrofit.network.service;

import org.adaschool.retrofit.network.dto.BreedsListDto;

import retrofit2.Call;
import retrofit2.http.GET;

public interface DogApiService {
    @GET("api/breeds/list/all")
    Call<BreedsListDto> getAllBreeds();

    @GET("api/breeds/image/random")
    Call<BreedsListDto> getRandomBreedImg();
}
