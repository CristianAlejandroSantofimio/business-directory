package com.cm.businessdirectory.usecase;

import com.cm.businessdirectory.domain.Business;
import com.cm.businessdirectory.gateway.BusinessGateway;
import com.cm.businessdirectory.gateway.web.BusinessModelRequest;
import com.cm.businessdirectory.gateway.web.BusinessModelResponse;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
@RequiredArgsConstructor
public class CreateBusiness {
    private final BusinessGateway businessGateway;

    public BusinessModelResponse createBusiness(final BusinessModelRequest businessToBeCreated) {

        log.info("Creating business {}", businessToBeCreated);
        var forCreating = new Business(
                null,
                businessToBeCreated.name(),
                businessToBeCreated.description(),
                businessToBeCreated.socialMedia(),
                businessToBeCreated.tags()
        );
        var result = businessGateway.create(forCreating);

        return new BusinessModelResponse(
                result.id(),
                result.name(),
                result.description(),
                result.socialMedia(),
                result.tags()
        );
    }
}
