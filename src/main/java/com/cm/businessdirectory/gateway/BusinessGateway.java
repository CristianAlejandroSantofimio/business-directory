package com.cm.businessdirectory.gateway;

import com.cm.businessdirectory.domain.Business;

import java.util.List;

public interface BusinessGateway {

    Business create(Business businessToBeCreated);
    List<Business> getAll();
}
