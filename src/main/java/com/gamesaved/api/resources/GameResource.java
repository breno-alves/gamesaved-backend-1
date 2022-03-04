package com.gamesaved.api.resources;

import com.gamesaved.api.dto.RawgDTO;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping(value = "/games")
public class GameResource {
    @RequestMapping(value = "/externalapi")
    public ResponseEntity<RawgDTO> externalApi() {
        String uri = "https://api.rawg.io/api/games?key=e30c4b13ba264b8680f0fcab95f1b69a";
        RestTemplate template = new RestTemplate();
        RawgDTO result = template.getForObject(uri, RawgDTO.class);

        System.out.println("teste: " + result);

        return ResponseEntity.ok().body(result);
    }
}
