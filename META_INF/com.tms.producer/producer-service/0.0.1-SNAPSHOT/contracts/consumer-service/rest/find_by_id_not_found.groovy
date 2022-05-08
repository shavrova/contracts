package contracts

import org.springframework.cloud.contract.spec.Contract

Contract.make {
    description "should return product info by id"

    request {
        url "/v1/product-info/wrong"
        method GET()
    }

    response {
        status 404
    }

}