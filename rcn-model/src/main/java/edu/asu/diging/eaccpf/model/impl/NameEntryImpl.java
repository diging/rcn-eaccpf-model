package edu.asu.diging.eaccpf.model.impl;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;
import org.hibernate.search.annotations.IndexedEmbedded;

import edu.asu.diging.eaccpf.model.NameEntry;
import edu.asu.diging.eaccpf.model.NamePart;
import edu.asu.diging.eaccpf.model.UseDates;

@Entity
public class NameEntryImpl implements NameEntry {

    @Id
    @GeneratedValue(generator = "nameEntry_id_generator")
    @GenericGenerator(name = "nameEntry_id_generator",    
                    parameters = @Parameter(name = "prefix", value = "NE"), 
                    strategy = "edu.asu.diging.eaccpf.data.IdGenerator"
            )
    private String id;
    
    private String localType;
    private String scriptCode;
    private String transliteration;
    
    @IndexedEmbedded
    @ElementCollection
    private List<String> alternativeForms;
    @IndexedEmbedded
    @ElementCollection
    private List<String> authorizedForms;
    @IndexedEmbedded
    @ElementCollection
    private List<String> preferredForms;
    
    @IndexedEmbedded(targetElement=NamePartImpl.class)
    @OneToMany(targetEntity=NamePartImpl.class, cascade=CascadeType.ALL, orphanRemoval=true)
    private List<NamePart> parts;
    
    @OneToOne(targetEntity=UseDatesImpl.class, cascade=CascadeType.ALL, orphanRemoval=true)
    private UseDates useDates;

    /* (non-Javadoc)
     * @see edu.asu.diging.rcn.core.model.impl.NameEntry#getId()
     */
    @Override
    public String getId() {
        return id;
    }

    /* (non-Javadoc)
     * @see edu.asu.diging.rcn.core.model.impl.NameEntry#setId(java.lang.String)
     */
    @Override
    public void setId(String id) {
        this.id = id;
    }

    /* (non-Javadoc)
     * @see edu.asu.diging.rcn.core.model.impl.NameEntry#getLocalType()
     */
    @Override
    public String getLocalType() {
        return localType;
    }

    /* (non-Javadoc)
     * @see edu.asu.diging.rcn.core.model.impl.NameEntry#setLocalType(java.lang.String)
     */
    @Override
    public void setLocalType(String localType) {
        this.localType = localType;
    }

    /* (non-Javadoc)
     * @see edu.asu.diging.rcn.core.model.impl.NameEntry#getScriptCode()
     */
    @Override
    public String getScriptCode() {
        return scriptCode;
    }

    /* (non-Javadoc)
     * @see edu.asu.diging.rcn.core.model.impl.NameEntry#setScriptCode(java.lang.String)
     */
    @Override
    public void setScriptCode(String scriptCode) {
        this.scriptCode = scriptCode;
    }

    /* (non-Javadoc)
     * @see edu.asu.diging.rcn.core.model.impl.NameEntry#getTransliteration()
     */
    @Override
    public String getTransliteration() {
        return transliteration;
    }

    /* (non-Javadoc)
     * @see edu.asu.diging.rcn.core.model.impl.NameEntry#setTransliteration(java.lang.String)
     */
    @Override
    public void setTransliteration(String transliteration) {
        this.transliteration = transliteration;
    }

    /* (non-Javadoc)
     * @see edu.asu.diging.rcn.core.model.impl.NameEntry#getAlternativeForm()
     */
    @Override
    public List<String> getAlternativeForms() {
        return alternativeForms;
    }

    /* (non-Javadoc)
     * @see edu.asu.diging.rcn.core.model.impl.NameEntry#setAlternativeForm(java.lang.String)
     */
    @Override
    public void setAlternativeForms(List<String> alternativeForms) {
        this.alternativeForms = alternativeForms;
    }

    /* (non-Javadoc)
     * @see edu.asu.diging.rcn.core.model.impl.NameEntry#getAuthorizedForm()
     */
    @Override
    public List<String> getAuthorizedForms() {
        return authorizedForms;
    }

    /* (non-Javadoc)
     * @see edu.asu.diging.rcn.core.model.impl.NameEntry#setAuthorizedForm(java.lang.String)
     */
    @Override
    public void setAuthorizedForms(List<String> authorizedForms) {
        this.authorizedForms = authorizedForms;
    }

    /* (non-Javadoc)
     * @see edu.asu.diging.rcn.core.model.impl.NameEntry#getPreferredForm()
     */
    @Override
    public List<String> getPreferredForms() {
        return preferredForms;
    }

    /* (non-Javadoc)
     * @see edu.asu.diging.rcn.core.model.impl.NameEntry#setPreferredForm(java.lang.String)
     */
    @Override
    public void setPreferredForms(List<String> preferredForms) {
        this.preferredForms = preferredForms;
    }

    /* (non-Javadoc)
     * @see edu.asu.diging.rcn.core.model.impl.NameEntry#getParts()
     */
    @Override
    public List<NamePart> getParts() {
        return parts;
    }

    /* (non-Javadoc)
     * @see edu.asu.diging.rcn.core.model.impl.NameEntry#setParts(java.util.List)
     */
    @Override
    public void setParts(List<NamePart> parts) {
        this.parts = parts;
    }

    /* (non-Javadoc)
     * @see edu.asu.diging.rcn.core.model.impl.NameEntry#getUseDates()
     */
    @Override
    public UseDates getUseDates() {
        return useDates;
    }

    /* (non-Javadoc)
     * @see edu.asu.diging.rcn.core.model.impl.NameEntry#setUseDates(edu.asu.diging.rcn.core.model.UseDates)
     */
    @Override
    public void setUseDates(UseDates useDates) {
        this.useDates = useDates;
    }
    
}
