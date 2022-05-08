package contracts

import org.springframework.cloud.contract.spec.Contract

Contract.make {
    description "should return product info by id"

    request {
        url "/v1/product-info/second"
        method GET()
    }

    response {
        status OK()
        headers {
            contentType applicationJson()
        }
        body(
                "id": "second",
                "name": "second-name",
                "domain": "test-domain",
                "teams": [
                        "one",
                        "2",
                        "3"
                ],
                "startDate": "2022-02-19"
        )
    }

}
