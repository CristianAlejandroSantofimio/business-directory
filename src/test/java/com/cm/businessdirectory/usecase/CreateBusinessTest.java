package com.cm.businessdirectory.usecase;

import com.cm.businessdirectory.domain.Business;
import com.cm.businessdirectory.gateway.BusinessGateway;
import org.junit.jupiter.api.Test;

import static java.util.Collections.emptyList;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

class CreateBusinessTest {

    private final BusinessGateway gateway = mock(BusinessGateway.class);
    private final CreateBusiness createBusiness = new CreateBusiness(gateway);

    @Test
    void given_ABusiness_When_Register_Then_ReturnsNull() {
        //Given
        var businessRequest = new Business( null, "tienda", "la tienda", emptyList(), emptyList());
        var createdBusiness = new Business("123", "tienda", "la tienda", emptyList(), emptyList());

        when(gateway.create(any())).thenReturn(createdBusiness);
        //When
        var result = createBusiness.createBusiness(businessRequest);
        //Then
        assertNotNull(result);
        assertEquals("123", result.id());
    }
}
