package org.jbossoutreach.certifier.service.generator;

import org.jbossoutreach.certifier.model.Certificate;

/**
 * An interface for a certificate generator.
 */

public interface CertGenerator {
    public String generateCert(Certificate certificate) throws Exception;
}
