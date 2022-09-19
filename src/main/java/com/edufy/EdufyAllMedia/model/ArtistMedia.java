package com.edufy.EdufyAllMedia.model;

import javax.persistence.*;

@Entity
@Table(name = "artist_media")
public class ArtistMedia {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "artistMediaId", nullable = false)
    private Integer id;

    @ManyToOne(fetch = FetchType.EAGER, optional = false)
    @JoinColumn(name = "artistArtistId", nullable = false)
    private Artist artistArtist;

    @ManyToOne(fetch = FetchType.EAGER, optional = false)
    @JoinColumn(name = "mediaMediaId", nullable = false)
    private Media mediaMedia;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Artist getArtistArtist() {
        return artistArtist;
    }

    public void setArtistArtist(Artist artistArtist) {
        this.artistArtist = artistArtist;
    }

    public Media getMediaMedia() {
        return mediaMedia;
    }

    public void setMediaMedia(Media mediaMedia) {
        this.mediaMedia = mediaMedia;
    }
}