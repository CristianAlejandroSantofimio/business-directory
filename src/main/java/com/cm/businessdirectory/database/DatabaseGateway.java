package com.cm.businessdirectory.database;

import com.cm.businessdirectory.domain.Business;
import com.cm.businessdirectory.gateway.BusinessGateway;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class DatabaseGateway implements BusinessGateway {
    @Override
    public Business create(Business businessToBeCreated) {
        //TODO call database

        return new Business(
                UUID.randomUUID().toString(),
                businessToBeCreated.name(),
                businessToBeCreated.description(),
                businessToBeCreated.socialMedia(),
                businessToBeCreated.tags());
    }

    //TODO retornar lista de negocios
    //return List.of(new Business(), new Business())
}
