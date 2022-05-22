package guru.springframework.msscbrewery.services.v1;

import guru.springframework.msscbrewery.web.model.v1.BeerDtoV1;

import java.util.UUID;

public interface BeerServiceV1 {
    BeerDtoV1 readBeerById(UUID beerId);
    BeerDtoV1 createBeer(BeerDtoV1 beerDtoV1);
    void updateBeer(UUID beerId, BeerDtoV1 beerDtoV1);
    void deleteBeer(UUID beerId);
}
