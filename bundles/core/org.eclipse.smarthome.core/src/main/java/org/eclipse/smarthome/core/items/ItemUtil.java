/**
 * Copyright (c) 2014 openHAB UG (haftungsbeschraenkt) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.eclipse.smarthome.core.items;

/**
 * The {@link ItemUtil} class contains utility methods for {@link Item} objects.
 * <p>
 * This class cannot be instantiated, it only contains static methods.
 *
 * @author Michael Grammling - Initial contribution and API
 */
public class ItemUtil {

    /**
     * The constructor is private.
     * This class cannot be instantiated.
     */
    private ItemUtil() {
        // nothing to do
    }

    /**
     * Returns {@code true} if the specified name is a valid item name, otherwise {@code false}.
     * <p>
     * A valid item name must <i>only</i> only consists of the following characters:
     * <ul>
     * <li>a-z</li>
     * <li>A-Z</li>
     * <li>0..9</li>
     * <li>_ (underscore)</li>
     * </ul>
     *
     * @param itemName the name of the item to be checked (could be null or empty)
     *
     * @return true if the specified name is a valid item name, otherwise false
     */
    public static boolean isValidItemName(String itemName) {
        if ((itemName != null) && (!itemName.isEmpty())) {
            return itemName.matches("[a-zA-Z0-9_]*");
        }

        return false;
    }

    /**
     * Ensures that the specified name of the item is valid.
     * <p>
     * If the name of the item is invalid an {@link IllegalArgumentException} is thrown,
     * otherwise this method returns silently.
     * <p>
     * A valid item name must <i>only</i> only consists of the following characters:
     * <ul>
     * <li>a-z</li>
     * <li>A-Z</li>
     * <li>0..9</li>
     * <li>_ (underscore)</li>
     * </ul>
     *
     * @param itemName the name of the item to be checked (could be null or empty)
     *
     * @throws IllegalArgumentException if the name of the item is invalid
     */
    public static void assertValidItemName(String itemName) throws IllegalArgumentException {
        if (!isValidItemName(itemName)) {
            throw new IllegalArgumentException("The specified name of the item '"
                    + itemName + "' is not valid!");
        }
    }

}
