/**
 * Unit-API - Units of Measurement API for Java (http://unitsofmeasurement.org)
 * Copyright (c) 2005-2010, Unit-API contributors, JScience and others
 * All rights reserved.
 *
 * See LICENSE.txt for details.
 */
package org.unitsofmeasurement.quantity;


/**
 * Represents the degree of hotness or coldness of a body or an environment. The
 * metric system unit for this NumericQuantity is "K" (Kelvin).
 *
 * @author <a href="mailto:jean-marie@dautelle.com">Jean-Marie Dautelle</a>
 * @version 1.0, April 15, 2009
 */
public interface Temperature<T extends Temperature<T, V>, V> extends
		Quantity<T, V> {

}