package com.edufy.EdufyAllMedia.repository;
import com.edufy.EdufyAllMedia.model.Artist;
import com.edufy.EdufyAllMedia.model.ArtistMedia;
import com.edufy.EdufyAllMedia.model.Media;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface MediaRepo extends JpaRepository<Media, Integer> {
        Media findMediaById(int mediaId);
}
