package com.cm.businessdirectory.database;

import com.cm.businessdirectory.domain.Business;
import com.cm.businessdirectory.gateway.BusinessGateway;
import org.springframework.stereotype.Service;

@Service
public class DatabaseGateway implements BusinessGateway {
    @Override
    public Business create(Business businessToBeCreated) {
        return null;
    }
}
