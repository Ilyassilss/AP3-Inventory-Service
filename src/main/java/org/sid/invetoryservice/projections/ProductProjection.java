package org.sid.invetoryservice.projections;

import org.sid.invetoryservice.entities.Product;
import org.springframework.data.rest.core.config.Projection;

@Projection(name="fullProduct" , types = Product.class)
public interface ProductProjection extends Projection {
    public Long getId();
    public String getName();
    public String getPrice();
}
