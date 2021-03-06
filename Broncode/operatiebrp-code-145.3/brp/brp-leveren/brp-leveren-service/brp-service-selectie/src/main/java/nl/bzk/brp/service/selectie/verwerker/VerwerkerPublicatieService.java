/**
 * This file is copyright 2017 State of the Netherlands (Ministry of Interior Affairs and Kingdom Relations).
 * It is made available under the terms of the GNU Affero General Public License, version 3 as published by the Free Software Foundation.
 * The project of which this file is part, may be found at www.github.com/MinBZK/operatieBRP.
 */

package nl.bzk.brp.service.selectie.verwerker;

import java.util.Collection;
import nl.bzk.brp.domain.internbericht.selectie.SelectieVerwerkTaakBericht;

/**
 * VerwerkerPublicatieService.
 */
interface VerwerkerPublicatieService {


    /**
     * Publiceert schrijftaken naar de "schrijver" nodes.
     * @param selectieTaak selectieTaak
     * @param resultaten resultaten
     * @return het aantal gepubliceerde schrijf taken
     */
    int publiceerSchrijfTaken(SelectieVerwerkTaakBericht selectieTaak, Collection<VerwerkPersoonResultaat> resultaten);
}
