package com.cocha.hotels.model.matesearch.error;

import com.cocha.hotels.model.matesearch.canonical.ErrorSupplier;

/**
 * 
 * @author viken Esta Clase se creo debido que la clase padre ErrorSupplier esta
 *         anotada para crear xml, cuando ocurre un error en las rutas, Al Estar
 *         anotada la clase padre camel automanticamente convertia a xml y a los
 *         caso de integrar los respose de los supplier no tenia que llegar en
 *         xml.
 */
public class NotXmlErrorSupplier extends ErrorSupplier {

    public NotXmlErrorSupplier(String codeSupplier) {
        super.setCodeSupplier(codeSupplier);
    }
}
