package com.develhope.repositorueses.springRepositories2.service;

import com.develhope.repositorueses.springRepositories2.entity.ProgrammingLanguage;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;

@Service
public class ProgrammingLanguageService {
    private List<ProgrammingLanguage> listOfProgrammingLanguage = new ArrayList<>();
    public ProgrammingLanguage addProgrammingLanguage(ProgrammingLanguage programmingLanguage){
        listOfProgrammingLanguage.add(programmingLanguage);
        return programmingLanguage;
    }
    public ProgrammingLanguage removeProgrammingLanguage(Integer id){
        ProgrammingLanguage programmingLanguageDeleted = new ProgrammingLanguage();
        for (ProgrammingLanguage programmingLanguages : listOfProgrammingLanguage){
            if(programmingLanguages.getId().equals(id)){
                listOfProgrammingLanguage.remove(programmingLanguages);
                programmingLanguageDeleted = programmingLanguages;
            }
        }
        return programmingLanguageDeleted;
    }
    public ProgrammingLanguage returnProgrammingLanguageById(Integer id){
        ProgrammingLanguage programmingLanguagesFound = new ProgrammingLanguage();
        for (ProgrammingLanguage programmingLanguages : listOfProgrammingLanguage){
            if(programmingLanguages.getId().equals(id)){
                programmingLanguagesFound = programmingLanguages;
            }
        }
        return programmingLanguagesFound;
    }
    public List<ProgrammingLanguage> returnAllProgrammingLanguages(){
        return listOfProgrammingLanguage;
    }
    public ProgrammingLanguage updateProgrammingLanguage(ProgrammingLanguage programmingLanguageToUpdate, Integer id){
        ProgrammingLanguage programmingLanguageUpdated = new ProgrammingLanguage();
        for (ProgrammingLanguage programmingLanguages: listOfProgrammingLanguage){
            if(programmingLanguages.getId().equals(id)){
                programmingLanguages.setId(programmingLanguageToUpdate.getId());
                programmingLanguages.setInventor(programmingLanguageToUpdate.getInventor());
                programmingLanguages.setName(programmingLanguageToUpdate.getName());
                programmingLanguages.setFirstAppearance(programmingLanguageToUpdate.getFirstAppearance());
                programmingLanguageUpdated = programmingLanguages;
            }
        }
        return programmingLanguageUpdated;
    }
}
