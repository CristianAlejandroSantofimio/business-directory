package com.cm.businessdirectory.usecase;

import com.cm.businessdirectory.domain.Business;
import com.cm.businessdirectory.gateway.BusinessGateway;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
@RequiredArgsConstructor
public class CreateBusiness {
    private final BusinessGateway businessGateway;

    public Business createBusiness(final Business businessToBeCreated) {

        log.info("Creating business {}", businessToBeCreated);

        return businessGateway.create(businessToBeCreated);
    }
}
