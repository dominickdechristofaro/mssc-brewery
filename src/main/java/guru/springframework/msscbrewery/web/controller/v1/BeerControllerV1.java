package guru.springframework.msscbrewery.web.controller.v1;

import guru.springframework.msscbrewery.services.v1.BeerServiceV1;
import guru.springframework.msscbrewery.web.model.v1.BeerDtoV1;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@Deprecated
@RequestMapping("/api/v1/beer")
@RestController
public class BeerControllerV1 {

    private final BeerServiceV1 beerServiceV1;

    public BeerControllerV1(BeerServiceV1 beerServiceV1) {
        this.beerServiceV1 = beerServiceV1;
    }

    @GetMapping("/{beerId}")
    public ResponseEntity<BeerDtoV1> readBeerById(@PathVariable("beerId") UUID beerId) {
        return new ResponseEntity<>(beerServiceV1.readBeerById(beerId), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<Void> createBeer(@RequestBody BeerDtoV1 beerDtoV1) {
        BeerDtoV1 savedDto = beerServiceV1.createBeer(beerDtoV1);

        HttpHeaders httpHeaders = new HttpHeaders();
        //todo add hostname to url
        httpHeaders.add("Location", "/api/v1/beer/" + savedDto.getId().toString());

        return new ResponseEntity<>(httpHeaders, HttpStatus.CREATED);
    }

    @PutMapping("/{beerId}")
    public ResponseEntity<Void> updateBeer(@PathVariable UUID beerId, @RequestBody BeerDtoV1 beerDtoV1) {
        beerServiceV1.updateBeer(beerId, beerDtoV1);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

    @DeleteMapping("/{beerId}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteBeer(@PathVariable UUID beerId) {
        beerServiceV1.deleteBeer(beerId);
    }
}
