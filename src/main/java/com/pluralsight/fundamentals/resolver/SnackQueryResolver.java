package com.pluralsight.fundamentals.resolver;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import com.pluralsight.fundamentals.entity.Snack;
import com.pluralsight.fundamentals.repository.SnackRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class SnackQueryResolver implements GraphQLQueryResolver {
    private SnackRepository snackRepository;

    @Autowired
    public SnackQueryResolver(SnackRepository snackRepository) {
        this.snackRepository = snackRepository;
    }

    public Iterable<Snack> snacks() {
        return snackRepository.findAll();
    }

}

/*
public class ApplicationQueryResolver implements GraphQLQueryResolver {
    private ApplicationRepository applicationRepository;

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


---
public class SnackQueryResolver(val snackRepository: SnackRepository,
                         private val mongoOperations: MongoOperations) : GraphQLQueryResolver {
    fun snacks(): List<Snack> {
        val list = snackRepository.findAll()
        for (item in list) {
            item.reviews = getReviews(snackId = item.id)
        }
        return list
    }

    private fun getReviews(snackId: String): List<Review> {
        val query = Query()
        query.addCriteria(Criteria.where("snackId").`is`(snackId))
        return mongoOperations.find(query, Review::class.java)
    }
}
 */