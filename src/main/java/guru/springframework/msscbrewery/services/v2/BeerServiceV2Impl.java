package guru.springframework.msscbrewery.services.v2;

import guru.springframework.msscbrewery.web.model.BeerStyleEnum;
import guru.springframework.msscbrewery.web.model.v2.BeerDtoV2;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class BeerServiceV2Impl implements BeerServiceV2 {
    @Override
    public BeerDtoV2 readBeerById(UUID beerId) {
        return BeerDtoV2.builder()
                .id(UUID.randomUUID())
                .beerName("Galaxy Cat")
                .beerStyle(BeerStyleEnum.IPA)
                .upc(123456789L)
                .build();
    }

    @Override
    public BeerDtoV2 createBeer(BeerDtoV2 beerDtoV2) {
        return BeerDtoV2.builder()
                .id(UUID.randomUUID())
                .beerName(beerDtoV2.getBeerName())
                .beerStyle(beerDtoV2.getBeerStyle())
                .upc(beerDtoV2.getUpc())
                .build();
    }

    @Override
    public void updateBeer(UUID beerId, BeerDtoV2 beerDtoV2) {

    }

    @Override
    public void deleteBeer(UUID beerId) {

    }
}
