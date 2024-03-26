package com.develhope.repositorueses.springRepositories2.repositories;

import com.develhope.repositorueses.springRepositories2.entity.ProgrammingLanguage;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "repo-prog-languages", collectionResourceRel = "languages")
interface ProgrammingLanguageRepository extends JpaRepository<ProgrammingLanguage, Long> {
}
