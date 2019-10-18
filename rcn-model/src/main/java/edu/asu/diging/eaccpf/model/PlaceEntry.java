package edu.asu.diging.eaccpf.model;

public interface PlaceEntry {

    String getId();

    void setId(String id);

    String getLocalType();

    void setLocalType(String localType);

    String getCountryCode();

    void setCountryCode(String countryCode);

    String getLatitude();

    void setLatitude(String latitude);

    String getLongitude();

    void setLongitude(String longitude);

    String getScriptCode();

    void setScriptCode(String scriptCode);

    String getTransliteration();

    void setTransliteration(String transliteration);

    String getVocabularySource();

    void setVocabularySource(String vocabularySource);

    void setText(String text);

    String getText();

    void setAltitude(String altitude);

    String getAltitude();

    void setAccuracy(String accuracy);

    String getAccuracy();

}