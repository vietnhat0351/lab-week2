package com.example.labweek2.resources;

import com.example.labweek2.entities.Customer;
import com.example.labweek2.services.CustomerService;
import jakarta.faces.application.Resource;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.Response;

import java.net.http.HttpResponse;
import java.util.List;

@Path("/customers")
public class CustomerResource {
    private CustomerService service = new CustomerService();

    @GET
    @Produces("text/plain")
    public String getAllCustomer() {
        return service.getAll().toString();
    }
}
