package edu.asu.diging.eaccpf.model.impl;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;

import edu.asu.diging.eaccpf.model.RelationEntry;

@Entity
public class RelationEntryImpl implements RelationEntry {

    @Id
    @GeneratedValue(generator = "RelationEntry_id_generator")
    @GenericGenerator(name = "RelationEntry_id_generator",    
                    parameters = @Parameter(name = "prefix", value = "RELEN"), 
                    strategy = "edu.asu.diging.rcn.core.data.IdGenerator"
            )
    private String id;
    
    private String localType;
    
    private String scriptCode;
    
    private String transliteration;
    
    private String text;

    /* (non-Javadoc)
     * @see edu.asu.diging.rcn.core.model.impl.RelationEntry#getId()
     */
    @Override
    public String getId() {
        return id;
    }

    /* (non-Javadoc)
     * @see edu.asu.diging.rcn.core.model.impl.RelationEntry#setId(java.lang.String)
     */
    @Override
    public void setId(String id) {
        this.id = id;
    }

    /* (non-Javadoc)
     * @see edu.asu.diging.rcn.core.model.impl.RelationEntry#getLocalType()
     */
    @Override
    public String getLocalType() {
        return localType;
    }

    /* (non-Javadoc)
     * @see edu.asu.diging.rcn.core.model.impl.RelationEntry#setLocalType(java.lang.String)
     */
    @Override
    public void setLocalType(String localType) {
        this.localType = localType;
    }

    /* (non-Javadoc)
     * @see edu.asu.diging.rcn.core.model.impl.RelationEntry#getScriptCode()
     */
    @Override
    public String getScriptCode() {
        return scriptCode;
    }

    /* (non-Javadoc)
     * @see edu.asu.diging.rcn.core.model.impl.RelationEntry#setScriptCode(java.lang.String)
     */
    @Override
    public void setScriptCode(String scriptCode) {
        this.scriptCode = scriptCode;
    }

    /* (non-Javadoc)
     * @see edu.asu.diging.rcn.core.model.impl.RelationEntry#getTransliteration()
     */
    @Override
    public String getTransliteration() {
        return transliteration;
    }

    /* (non-Javadoc)
     * @see edu.asu.diging.rcn.core.model.impl.RelationEntry#setTransliteration(java.lang.String)
     */
    @Override
    public void setTransliteration(String transliteration) {
        this.transliteration = transliteration;
    }

    /* (non-Javadoc)
     * @see edu.asu.diging.rcn.core.model.impl.RelationEntry#getText()
     */
    @Override
    public String getText() {
        return text;
    }

    /* (non-Javadoc)
     * @see edu.asu.diging.rcn.core.model.impl.RelationEntry#setText(java.lang.String)
     */
    @Override
    public void setText(String text) {
        this.text = text;
    }
}
