package com.pluralsight.fundamentals.resolver;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import com.pluralsight.fundamentals.entity.Application;
import com.pluralsight.fundamentals.repository.ApplicationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ApplicationQueryResolver implements GraphQLQueryResolver {
    private ApplicationRepository applicationRepository;

    @Autowired
    public ApplicationQueryResolver(ApplicationRepository applicationRepository) {
        this.applicationRepository = applicationRepository;
    }

    public Iterable<Application> findAllApplications() {
        return applicationRepository.findAll();
    }

    public long countApplications() {
        return applicationRepository.count();
    }
}
