package com.edufy.EdufyAllMedia.controller;
import com.edufy.EdufyAllMedia.model.ArtistMedia;
import com.edufy.EdufyAllMedia.model.Media;
import com.edufy.EdufyAllMedia.services.ArtistService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;


@RestController
@RequestMapping("/allMediaForArtist")
public class ArtistController {
    @Autowired
    private ArtistService artistService;

    @GetMapping("/getuserbyartist")
    public List<Media> getArtistMediaById(int id) {
        return artistService.getMediaById(id);
    }
}
