/**
 * This file is copyright 2017 State of the Netherlands (Ministry of Interior Affairs and Kingdom Relations).
 * It is made available under the terms of the GNU Affero General Public License, version 3 as published by the Free Software Foundation.
 * The project of which this file is part, may be found at www.github.com/MinBZK/operatieBRP.
 */

package nl.bzk.brp.protocollering.service.algemeen;

import java.util.Set;
import nl.bzk.algemeenbrp.dal.domein.brp.entity.ScopePatroon;

/**
 * Service voor het ophalen van een ScopePatroon.
 */
interface ScopePatroonService {

    /**
     * Geeft een ScopePatroon obv de gegeven set attributen.
     * @param attribuutSet set met attribuut Element ids
     * @return een ScopePatroon
     */
    ScopePatroon getScopePatroon(Set<Integer> attribuutSet);
}
