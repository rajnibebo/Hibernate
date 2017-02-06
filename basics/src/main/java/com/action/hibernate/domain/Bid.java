/**
 * 
 */
package com.action.hibernate.domain;

import javax.persistence.Entity;

import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.Immutable;

/**
 * @author rajni.ubhi
 *
 */
@Entity
@DynamicInsert(value = true)
@Immutable
public class Bid {

}
