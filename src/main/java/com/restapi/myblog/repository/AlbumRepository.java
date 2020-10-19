package com.restapi.myblog.repository;

import com.restapi.myblog.model.Album;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AlbumRepository extends JpaRepository<Album, Long> {
}
