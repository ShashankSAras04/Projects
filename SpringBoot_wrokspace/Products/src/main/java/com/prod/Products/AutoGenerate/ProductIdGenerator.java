package com.prod.Products.AutoGenerate;

import org.hibernate.engine.spi.SharedSessionContractImplementor;
import org.hibernate.id.IdentifierGenerator;

import java.io.Serializable;

public class ProductIdGenerator implements IdentifierGenerator {

    private static final String PREFIX = "PD";

    @Override
    public Serializable generate(SharedSessionContractImplementor session, Object object) {
        // Query to get last inserted ID
        String query = "SELECT MAX(CAST(SUBSTRING(p.id, 3) AS int)) FROM Products p";
        Integer maxId = (Integer) session.createQuery(query).uniqueResult();

        int nextId = (maxId == null) ? 1 : maxId + 1; // if null → start at 1
        return PREFIX + String.format("%04d", nextId); // PD0001, PD0002 ...
    }
}
