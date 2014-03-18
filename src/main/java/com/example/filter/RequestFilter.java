package com.example.filter;

import com.example.utils.BasicAuth;

import javax.ws.rs.WebApplicationException;
import javax.ws.rs.container.ContainerRequestContext;
import javax.ws.rs.container.ContainerRequestFilter;
import javax.ws.rs.container.PreMatching;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.ext.Provider;
import java.io.IOException;

/**
 * Created by guillaume on 18/03/14.
 */
@Provider
public class RequestFilter implements ContainerRequestFilter{

    @Context
    UriInfo uriInfo;

    @Override
    public void filter(ContainerRequestContext containerRequestContext) throws IOException {

        System.out.print("This is the request filter on : ");
        System.out.println(uriInfo.getAbsolutePath().toString());

        //get the authorization header
        String auth = containerRequestContext.getHeaderString("authorization");
        System.out.println(auth);

        if (auth == null){
            throw new WebApplicationException(Response.Status.UNAUTHORIZED);
        }

        String[] userInfos = BasicAuth.decode(auth);

        if(userInfos == null || userInfos.length != 2){
            throw new WebApplicationException(Response.Status.UNAUTHORIZED);
        }

        //here just one user was created user:user
        if ("user".equals(userInfos[0]) && "user".equals(userInfos[0])) {
            return;
        } else {
            throw new WebApplicationException(Response.Status.UNAUTHORIZED);
        }
    }

}
