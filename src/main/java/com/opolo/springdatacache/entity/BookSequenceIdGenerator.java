package com.opolo.springdatacache.entity;

import static java.util.Objects.nonNull;

import java.io.Serializable;
import org.hibernate.engine.spi.SharedSessionContractImplementor;
import org.hibernate.id.enhanced.SequenceStyleGenerator;

public class BookSequenceIdGenerator extends SequenceStyleGenerator {

    @Override
    public Serializable generate(SharedSessionContractImplementor session, Object obj) {
        Serializable result = null;
        if(obj instanceof Identifiable){
            var identifiable = (Identifiable) obj;
            Serializable id = identifiable.getId();

            if(nonNull(id)){
                result = id;
            }
        }

        if(result == null){
           result = (Serializable) super.generate(session, obj);
        }
        return result;
    }
}
