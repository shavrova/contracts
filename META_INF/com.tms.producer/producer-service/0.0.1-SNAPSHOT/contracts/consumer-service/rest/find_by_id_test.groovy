package contracts

import org.springframework.cloud.contract.spec.Contract

Contract.make {
    description "should return product info by id"

    request {
        url "/v1/product-info/test"
        method GET()
    }

    response {
        status OK()
        headers {
            contentType applicationJson()
        }
        body(
                "id": "test",
                "name": "test-name",
                "domain": "test-domain",
                "teams": [
                        "team1",
                        "team2",
                        "team3"
                ],
                "startDate": "2022-02-18"
        )
    }

}