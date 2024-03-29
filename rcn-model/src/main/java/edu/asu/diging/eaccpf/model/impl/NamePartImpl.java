package edu.asu.diging.eaccpf.model.impl;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Index;
import javax.persistence.Lob;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;
import org.hibernate.search.annotations.Field;
import org.hibernate.search.annotations.Indexed;

import edu.asu.diging.eaccpf.model.NamePart;

@Entity
@Table(indexes={@Index(name="part_idx", columnList="part")})
public class NamePartImpl implements NamePart {

    @Id
    @GeneratedValue(generator = "nameEntry_id_generator")
    @GenericGenerator(name = "nameEntry_id_generator",    
                    parameters = @Parameter(name = "prefix", value = "NP"), 
                    strategy = "edu.asu.diging.eaccpf.data.IdGenerator"
            )
    private String id;
    
    private String localType;
    
    @Field
    @Lob
    private String part;
    
    /* (non-Javadoc)
     * @see edu.asu.diging.rcn.core.model.impl.NamePart#getId()
     */
    @Override
    public String getId() {
        return id;
    }
    /* (non-Javadoc)
     * @see edu.asu.diging.rcn.core.model.impl.NamePart#setId(java.lang.String)
     */
    @Override
    public void setId(String id) {
        this.id = id;
    }
    /* (non-Javadoc)
     * @see edu.asu.diging.rcn.core.model.impl.NamePart#getLocalType()
     */
    @Override
    public String getLocalType() {
        return localType;
    }
    /* (non-Javadoc)
     * @see edu.asu.diging.rcn.core.model.impl.NamePart#setLocalType(java.lang.String)
     */
    @Override
    public void setLocalType(String localType) {
        this.localType = localType;
    }
    /* (non-Javadoc)
     * @see edu.asu.diging.rcn.core.model.impl.NamePart#getPart()
     */
    @Override
    public String getPart() {
        return part;
    }
    /* (non-Javadoc)
     * @see edu.asu.diging.rcn.core.model.impl.NamePart#setPart(java.lang.String)
     */
    @Override
    public void setPart(String part) {
        this.part = part;
    }
    
    
}
