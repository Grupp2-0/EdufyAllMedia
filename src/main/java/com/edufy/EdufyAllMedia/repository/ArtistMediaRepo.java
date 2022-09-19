package com.edufy.EdufyAllMedia.repository;

import com.edufy.EdufyAllMedia.model.Artist;
import com.edufy.EdufyAllMedia.model.ArtistMedia;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface ArtistMediaRepo extends JpaRepository<ArtistMedia, Integer> {
    List<ArtistMedia> findArtistMediaByArtistArtistId(int artistId);
}
