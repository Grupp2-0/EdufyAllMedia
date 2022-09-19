package com.edufy.EdufyAllMedia.model;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "media")
public class Media {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "mediaId", nullable = false)
    private Integer id;

    @Column(name = "url", nullable = false, length = 200)
    private String url;

    @Column(name = "releaseDate", nullable = false)
    private LocalDate releaseDate;

    @Column(name = "mediaName", nullable = false, length = 100)
    private String mediaName;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public LocalDate getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(LocalDate releaseDate) {
        this.releaseDate = releaseDate;
    }

    public String getMediaName() {
        return mediaName;
    }

    public void setMediaName(String mediaName) {
        this.mediaName = mediaName;
    }

}