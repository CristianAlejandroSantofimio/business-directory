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


        return new Business(
                UUID.randomUUID().toString(),
                businessToBeCreated.name(),
                businessToBeCreated.description(),
                businessToBeCreated.socialMedia(),
                businessToBeCreated.tags());
    }

    @Override
    public List<Business> getAll() {
        return  List.of(new Business("145667"," dondeMa","fritos y algo mas",null,null),
                        new Business("53454","tienda","miscelanea de remesa",null,null));
    }


}
