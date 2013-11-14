package com.models

import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id
import javax.persistence.MappedSuperclass

/**
 * User: Akhil Shastri
 * Date: 11/14/13
 * Time: 11:19 AM
 */
@MappedSuperclass
class AbstractModel {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long id

    @Override
    public boolean equals(Object obj) {

        if (this == obj) {
            return true;
        }

        if (this.id == null || obj == null || !(this.getClass().equals(obj.getClass()))) {
            return false;
        }

        AbstractModel that = (AbstractModel) obj;

        return this.id.equals(that.getId());
    }

    @Override
    public int hashCode() {
        return id == null ? 0 : id.hashCode();
    }

}
