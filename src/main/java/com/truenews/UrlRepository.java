package com.truenews;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
interface UrlRepository extends JpaRepository<Url, String> {
}
