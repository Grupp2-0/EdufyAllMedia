package com.edufy.EdufyAllMedia.repository;
import com.edufy.EdufyAllMedia.model.Media;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MediaRepo extends JpaRepository<Media, Integer> {
        Media findMediaByIdEquals(int mediaId);
}
