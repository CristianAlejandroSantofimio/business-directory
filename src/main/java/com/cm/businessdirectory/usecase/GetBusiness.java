package com.cm.businessdirectory.usecase;


import com.cm.businessdirectory.gateway.BusinessGateway;
import com.cm.businessdirectory.gateway.web.BusinessModelResponse;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@Slf4j
@RequiredArgsConstructor
public class GetBusiness {
    private final BusinessGateway businessGateway;

    public List<BusinessModelResponse> getBusinesses() {
        var result = businessGateway.getAll();
        List<BusinessModelResponse> responses = result.stream().map(business -> new BusinessModelResponse(
                business.id(),
                business.name(),
                business.description(),
                business.socialMedia(),
                business.tags())).collect(Collectors.toUnmodifiableList());
        return responses;
    }

}
