package com.cm.businessdirectory.usecase;


import com.cm.businessdirectory.domain.Business;
import com.cm.businessdirectory.gateway.BusinessGateway;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
@RequiredArgsConstructor
public class GetBusiness {
    private final BusinessGateway businessGateway;

    public List<Business> getBusinesses() {
        return businessGateway.getAll();
    }

}
