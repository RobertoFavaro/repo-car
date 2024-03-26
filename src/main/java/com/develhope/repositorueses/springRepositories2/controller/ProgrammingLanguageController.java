package com.develhope.repositorueses.springRepositories2.controller;

import com.develhope.repositorueses.springRepositories2.entity.ProgrammingLanguage;
import com.develhope.repositorueses.springRepositories2.service.ProgrammingLanguageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("/programmingLanguage")
public class ProgrammingLanguageController {
    @Autowired
    private ProgrammingLanguageService programmingLanguageService;
    @PostMapping("/add")
    public ResponseEntity<ProgrammingLanguage> addProgrammingLanguage(@RequestBody ProgrammingLanguage programmingLanguage){
        ProgrammingLanguage programmingLanguageAdded = programmingLanguageService.addProgrammingLanguage(programmingLanguage);
        return ResponseEntity.ok().body(programmingLanguageAdded);
    }
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<ProgrammingLanguage> deleteProgrammingLanguage(@PathVariable Integer id){
        ProgrammingLanguage programmingLanguageRemoved = programmingLanguageService.removeProgrammingLanguage(id);
        return ResponseEntity.ok().body(programmingLanguageRemoved);
    }
    @GetMapping("/programmingLanguage/{id}")
    public ResponseEntity<ProgrammingLanguage> selectProgrammingLanguageById(@PathVariable Integer id){
        ProgrammingLanguage programmingLanguageTaked = programmingLanguageService.returnProgrammingLanguageById(id);
        return ResponseEntity.ok().body(programmingLanguageTaked);
    }
    @GetMapping("/all")
    public ResponseEntity<List<ProgrammingLanguage>> selectAllProgrammingLanguage(){
        List<ProgrammingLanguage> allProgrammingLanguage = programmingLanguageService.returnAllProgrammingLanguages();
        return ResponseEntity.ok().body(allProgrammingLanguage);
    }
    @PutMapping("/update/{id}")
    public ResponseEntity<ProgrammingLanguage> updateProgrammingLanguage(@RequestBody ProgrammingLanguage programmingLanguage, @PathVariable Integer id){
        ProgrammingLanguage programmingLanguageUpdated = programmingLanguageService.updateProgrammingLanguage(programmingLanguage,id);
        return ResponseEntity.ok().body(programmingLanguageUpdated);
    }
}
