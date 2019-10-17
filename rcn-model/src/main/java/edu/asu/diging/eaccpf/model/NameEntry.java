package edu.asu.diging.eaccpf.model;

import java.util.List;

public interface NameEntry {

    String getId();

    void setId(String id);

    String getLocalType();

    void setLocalType(String localType);

    String getScriptCode();

    void setScriptCode(String scriptCode);

    String getTransliteration();

    void setTransliteration(String transliteration);

    List<String> getAlternativeForms();

    void setAlternativeForms(List<String> alternativeForms);

    List<String> getAuthorizedForms();

    void setAuthorizedForms(List<String> authorizedForms);

    List<String> getPreferredForms();

    void setPreferredForms(List<String> preferredForms);

    List<NamePart> getParts();

    void setParts(List<NamePart> parts);

    UseDates getUseDates();

    void setUseDates(UseDates useDates);

}