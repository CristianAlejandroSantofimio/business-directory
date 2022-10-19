package com.cm.businessdirectory.gateway;

import com.cm.businessdirectory.domain.Business;

public interface BusinessGateway {

    Business create(Business businessToBeCreated);

}
