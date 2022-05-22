package guru.springframework.msscbrewery.services.v1;

import guru.springframework.msscbrewery.web.model.v1.BeerDtoV1;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
@Slf4j
public class BeerServiceV1Impl implements BeerServiceV1 {

    @Override
    public BeerDtoV1 readBeerById(UUID beerId) {
        return BeerDtoV1.builder().id(UUID.randomUUID())
                .beerName("Galaxy Cat")
                .beerStyle("Pale Ale")
                .build();
    }

    @Override
    public BeerDtoV1 createBeer(BeerDtoV1 beerDtoV1) {
        return BeerDtoV1.builder()
                .id(UUID.randomUUID())
                .beerName(beerDtoV1.getBeerName())
                .beerStyle(beerDtoV1.getBeerStyle())
                .upc(beerDtoV1.getUpc())
                .build();
    }

    @Override
    public void updateBeer(UUID beerId, BeerDtoV1 beerDtoV1) {
        //todo impl - would add a real impl to update beer
    }

    @Override
    public void deleteBeer(UUID beerId) {
        //todo impl - would delete a beer
        log.debug("Deleting a beer...");
    }
}
