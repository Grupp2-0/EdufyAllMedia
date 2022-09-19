package com.edufy.EdufyAllMedia.services;
import com.edufy.EdufyAllMedia.model.ArtistMedia;
import com.edufy.EdufyAllMedia.model.Media;
import com.edufy.EdufyAllMedia.repository.ArtistMediaRepo;
import com.edufy.EdufyAllMedia.repository.MediaRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;

@Service
public class ArtistService {

    @Autowired
    private ArtistMediaRepo artistMediaRepo;
    private MediaRepo mediaRepo;

    public List<ArtistMedia> getMediaById (int artistId){

        return artistMediaRepo.findArtistMediaByArtistArtistId(artistId);

/*        List<ArtistMedia> artistMedias = artistMediaRepo.findArtistMediaByArtistArtistId(artistId);
        List<Media> medias = new ArrayList<>();

        for (ArtistMedia a: artistMedias) {
            medias.add(mediaRepo.findMediaById(a.getMediaMedia().getId()));
        }

        for (Media m: medias) {
            System.out.println(m.getMediaName());
        }

        return medias;*/
    }
}
