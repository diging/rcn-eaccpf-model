package edu.asu.diging.eaccpf.model;

public interface SourceEntry {

    String getId();

    void setId(String id);

    String getScriptCode();

    void setScriptCode(String scriptCode);

    String getTransliteration();

    void setTransliteration(String transliteration);

    String getText();

    void setText(String text);

}